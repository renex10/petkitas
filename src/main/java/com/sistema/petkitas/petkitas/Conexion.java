package com.sistema.petkitas.petkitas;
/*Singleton:instancia unica,un punto de acceso global*/
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    //1) variable guarda el estado de la CONEXION BBDD
    private static Connection conexion;
     //2) varible una sola instancia desde la clase de grafico desde la otra clase
    private static Conexion instancia;
     //3variables para conectarnos a la BBDD
    /**=======================VARIABLES DE CONEXION=================*/
    private static final String URL= "jdbc:mysql://localhost/petkitas";
    private static final String USERNAME = "petkitas";
    private static final String PASSWORD = "petkitas";
    
    //###################METODOS########################### 
    
    //retorna la conexion a la base de datos
    //---------------------------------------metodo para conectar a la bbdd
    public Connection conectar(){
        try{
            //1 carga el driver(OBTENENOMOS LA CONEXION A LA BD)
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showConfirmDialog(null, "CONEXION EXITOSA");
            return conexion;
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null,"ERROR" + e);
        }
        return conexion;
    }
    
        //---------------------------------------metodo para cerrar  la bbdd
    public void cerrarConexion(){
        try{
            conexion.close();
        }catch(Exception e){
                JOptionPane.showConfirmDialog(null,"ERROR" + e);
        }
    }
 }
