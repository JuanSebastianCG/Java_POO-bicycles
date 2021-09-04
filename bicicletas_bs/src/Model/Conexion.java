/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Conexion {
    Connection connection;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rutas_bicicletas_bd", "root","");
            if(connection!=null){
                System.out.println("Conexion establecida");
            }
        } catch (SQLException  | ClassNotFoundException ex) {
            System.out.println(ex);
         }
    
    }

    public Connection getConnection() {
        return connection;
    }
    
}
