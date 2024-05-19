package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlUsuarios extends Conexion {

    public boolean registrar(Usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "INSERT INTO usuarios (NumeroLegajoUsuario, Password, NombreUsuario, CorreoElectronico, IdTipoUsuario) VALUES (?,?,?,?,?)";
        
        try {
            // prepara consulta
            ps = con.prepareStatement(sql);
            //busca el campo solicitado
            ps.setString(1, usr.getNumeroLegajoUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombreUsuario());
            ps.setString(4, usr.getCorreoElectronico());
            ps.setString(5, usr.getTipoUsuario());
            //ejecuta el query determinado en el sql.
            ps.execute();
            
            return true;
                     
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public int existeUsuario(String NumeroLegajo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConection();

        String sql = "SELECT count(idUsuario) FROM usuarios WHERE NumeroLegajo =?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, NumeroLegajo);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }

    }

    public boolean emailValido(String CorreoElectronico) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[_A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(CorreoElectronico);

        return mather.find();
    }
}
