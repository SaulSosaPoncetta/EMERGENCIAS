package GestionPersonal2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

        
public class Conexion {

    Connection enlazar = null;
    
    public Connection conectar(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           enlazar = DriverManager.getConnection("jdbc:mysql://localhost/gestionbomberos?useTimezone=true&serverTimezone=UTC", "root","");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e + "IMPOSIBLE CONECTAR A BASE DE DATOS gestionbomberos");
        }
        return enlazar;
    }    
    
}
