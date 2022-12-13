/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.javasql;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


 
public class CConexion {
    Connection conectar = null;
        
        String usuario ="usersql";
        String contrasena ="root";
        String bd ="gestiontransporte";
        String ip ="localhost";
        String puerto ="1433";
        
        String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
        
        public Connection establecerConexion(){
            
            try{
                String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd;
                
              conectar = (Connection) DriverManager.getConnection(cadena,usuario,contrasena);
                
                //dsadsad
                JOptionPane.showMessageDialog(null, "se conecto correctamente");
                
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error al conectar base de datos,"+ e.toString());
                
            }
            return conectar;
        }
    
}
