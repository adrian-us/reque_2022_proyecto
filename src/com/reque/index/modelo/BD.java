package com.reque.index.modelo;


public class BD {
    private static final String directorioIndices = "C:\\SAE\\Index";
    private static final String directorioArchivos = "C:\\SAE\\Data";
    private static final String usuarioAdmin = "administrador";
    private static final String contraAdmin = "admin";
    
    
    public static boolean acceso(String usuario, String contra){
        return usuario.toLowerCase().equals(usuarioAdmin.toLowerCase()) && contra.equals(contraAdmin);
    }


    public static String getDirectorioIndices() {
        return directorioIndices;
    }
    
    public static String getDirectorioArchivos() {
        return directorioArchivos;
    }
    
    
}
