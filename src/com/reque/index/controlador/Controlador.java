package com.reque.index.controlador;

import com.reque.index.modelo.BD;
import com.reque.index.vista.VentanaBusqueda;
import java.io.IOException;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import com.reque.index.vista.VentanaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.File;
import java.awt.Desktop;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Controlador {
    // Vista
    VentanaLogin ventanaLogin = new VentanaLogin();
    VentanaBusqueda ventanaBusqueda = new VentanaBusqueda();
    
    // Modelo (Sistema)
    String indexDir = "C:\\SAE\\Index";
    String dataDir = "C:\\SAE\\Data";
    
    // Controlador
    Indexer indexer;
    Searcher searcher;
    
    ActionListener btnIngresar_ActionPerformed = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            if (BD.acceso(ventanaLogin.getTxfUser().getText(), ventanaLogin.getTxfPassword().getText())){
                System.out.println("acceso");
                // Si accede se pasa a la ventana de busque
                ventanaLogin.dispose();
                // aca se hace visible la ventna de busqueda
                ventanaBusqueda.setVisible(true);
            } else {
                System.out.println("acceso denegado");
                JOptionPane.showMessageDialog (null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    };
    
    ActionListener btnAbrir_ActionPerformed = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            abrirArchivo(ventanaBusqueda.getObjListDoc().getSelectedValue());
        }
    };
    
    ActionListener btnBuscar_ActionPerformed = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // borrar directorio de indice antes de crear otro
                File index = new File(indexDir);
                String[] entradas = index.list();
                for (String entrada : entradas){
                    File archivo = new File(index.getPath(),entrada);
                    archivo.delete();
                }
                // actualizar indices
                createIndex();
                // buscar
                searcher = new Searcher(indexDir);
                long startTime = System.currentTimeMillis();
                TopDocs hits;
                hits = searcher.search(ventanaBusqueda.getTxfBuscar().getText());
                long endTime = System.currentTimeMillis();
                System.out.println(hits.totalHits + " documents found. Time :" + (endTime - startTime));
                // Crear un nuevo modelo para actualizar la JList
                DefaultListModel listModel = new DefaultListModel();
                
                for (ScoreDoc scoreDoc : hits.scoreDocs){
                    Document doc = searcher.getDocument(scoreDoc);
                    System.out.println("File : " + doc.get("filepath"));
                    listModel.addElement(doc.get("filepath"));
                }
                
                ventanaBusqueda.setJListModel(listModel);
                
                searcher.close();
            } catch (IOException | ParseException ex ) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    };
    
    
    public Controlador() {
        ventanaLogin.getBtnIngresar().addActionListener(btnIngresar_ActionPerformed);
        ventanaBusqueda.getBtnBuscar().addActionListener(btnBuscar_ActionPerformed);
        ventanaBusqueda.getBtnAbrir().addActionListener(btnAbrir_ActionPerformed);
    }

    private void createIndex() throws IOException {
        indexer = new Indexer(indexDir);
        int numIndexed;
        long startTime = System.currentTimeMillis();
        // Aca el filtro de archivos viene definido de Text
        numIndexed = indexer.createIndex(dataDir, new TextFileFilter());
        long endTime = System.currentTimeMillis();
        indexer.close();
        System.out.println(numIndexed+" File indexed, time taken : " + (endTime-startTime)+" ms");
    }

    private void search(String searchQuery) throws IOException, ParseException {
        searcher = new Searcher(indexDir);
        long startTime = System.currentTimeMillis();
        TopDocs hits = searcher.search(searchQuery);
        long endTime = System.currentTimeMillis();
        System.out.println(hits.totalHits + " documents found. Time :" + (endTime - startTime));
        for (ScoreDoc scoreDoc : hits.scoreDocs){
            Document doc = searcher.getDocument(scoreDoc);
            System.out.println("File : " + doc.get("filepath"));
        }
        searcher.close();
    }
    
    public void abrirArchivo(String ruta){
        //Apertura de un archivo especifico
        try {
            //constructor of file class having file as argument
            File file = new File(ruta);
            //check if Desktop is supported by Platform or not  
            if (!Desktop.isDesktopSupported()){
                System.out.println("No soportado");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) //checks file exists or no
                desktop.open(file); //open the specific file
        } catch (IOException e){}
    }
    

    public static void main(String[] args) {

        Controlador main = new Controlador();
        
        main.ventanaLogin.setVisible(true);
        
//        try {
//            main = new Main();
//            main.createIndex();
//            main.search("Sahil");
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }
    }
}
