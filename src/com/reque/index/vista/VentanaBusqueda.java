/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reque.index.vista;

/**
 *
 * @author gris
 */
public class VentanaBusqueda extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBusqueda
     */
    public VentanaBusqueda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txfBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        objListDoc = new javax.swing.JList<>();
        btnAbrir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Busqueda de archivos");

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarActionPerformed(evt);
            }
        });

        objListDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(objListDoc);

        btnAbrir.setBackground(new java.awt.Color(51, 51, 51));
        btnAbrir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCerrar.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfBuscar))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnCerrar))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> objListDoc;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnBuscar
     */
    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    /**
     * @param btnBuscar the btnBuscar to set
     */
    public void setBtnBuscar(javax.swing.JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the objListDoc
     */
    public javax.swing.JList<String> getObjListDoc() {
        return objListDoc;
    }

    /**
     * @param objListDoc the objListDoc to set
     */
    public void setObjListDoc(javax.swing.JList<String> objListDoc) {
        this.objListDoc = objListDoc;
    }

    public void setJListModel(javax.swing.DefaultListModel model){
        this.objListDoc.setModel(model);
    }
    
    public javax.swing.JButton getBtnAbrir() {
        return btnAbrir;
    }
    
    public javax.swing.JButton getBtnCerrar() {
        return btnCerrar;
    }
    
    /**
     * @return the txfBuscar
     */
    public javax.swing.JTextField getTxfBuscar() {
        return txfBuscar;
    }

    /**
     * @param txfBuscar the txfBuscar to set
     */
    public void setTxfBuscar(javax.swing.JTextField txfBuscar) {
        this.txfBuscar = txfBuscar;
    }
}
