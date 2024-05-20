package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

        
public class Conexion {
    
    private final String base = "gestionbomberos";
    private final String user = "admin";
    private final String password = "1234";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    
    private Connection enlazar = null;
    
    public Connection getConection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           enlazar = DriverManager.getConnection("jdbc:mysql://localhost/gestionbomberos?useTimezone=true&serverTimezone=UTC", "root","");
        } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null, e + "IMPOSIBLE CONECTAR A BASE DE DATOS DEL SISTEMA");
        }
        return enlazar;
    }    
    
}
