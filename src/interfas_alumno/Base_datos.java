/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Geovanni
 */
public class Base_datos {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String RUTA = "jdbc:mysql://localhost/laboratios";
    public static final String USUARIO = "root";
    public static final String PASSWORD = "12345";
    
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(RUTA, USUARIO, PASSWORD);
        } catch (Exception ex) {
        }
        return connection;
    }
}
