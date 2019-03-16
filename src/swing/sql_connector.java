/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Steven
 */
public class sql_connector {
        
    Connection con=null;
    
    public static Connection dbConnector(){
        try{
           Class.forName("org.sqlite.JDBC");
           Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Steven\\Documents\\NetBeansProjects\\proyecto_diseño_inferfaces\\pro.db");
           JOptionPane.showMessageDialog(null, "Conexión establecida");
           return con;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }   
    }
}
