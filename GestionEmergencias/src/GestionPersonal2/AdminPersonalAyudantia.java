package GestionPersonal2;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminPersonalAyudantia extends javax.swing.JInternalFrame {
// Creo variable para la conexion
    Conexion enlace = new Conexion();
// Creo la conexion con la base    
    Connection conect = enlace.conectar();
        
    public AdminPersonalAyudantia() {
        initComponents();
        mostrarDatosPersonales(0, null);
        mostrarDatosInstitucionales(0, null);
        mostrarDatosLaborales(0, null);
        mostrarDatosFamiliares(0, null);
        mostrarDatosMedicos(0, null);
    }

    public void mostrarDatosPersonales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatospersonales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatospersonales.addColumn("");
        tdatospersonales.addColumn("N Legajo");
        tdatospersonales.addColumn("Nombre");
        tdatospersonales.addColumn("Apellido");
        tdatospersonales.addColumn("Tipo");
        tdatospersonales.addColumn("Nummero ");
        tdatospersonales.addColumn("Calle");
        tdatospersonales.addColumn("Numero");
        tdatospersonales.addColumn("Localidad");
        tdatospersonales.addColumn("Barrio");
        tdatospersonales.addColumn("CP");
        tdatospersonales.addColumn("Telefono");
        tdatospersonales.addColumn("Estado Civil");
        tdatospersonales.addColumn("F Nacim");
        tdatospersonales.addColumn("Edad");
        tdatospersonales.addColumn("Email");
        tdatospersonales.addColumn("Sexo");
        TablaDatPerBomberos.setModel(tdatospersonales);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datospersonalesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                 codigosql = "SELECT * FROM datospersonalesbomberos WHERE NumeroLegajoPerBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datospersonalesbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                              codigosql = "SELECT * FROM datospersonalesbomberos";
                               }
                        }
                      }
                 
        String []datospersonales = new String[18];                                        // Crea arreglo para los datos de cada registro
        
        try {
            Statement leer = conect.createStatement();                          //de tipo Statement declaro variable leer y le asigno el metodo para la conexion
            ResultSet resultado = leer.executeQuery(codigosql);                    //de tipo ResultSet creo variable resultado y le asigno la consulta mediante la variable leer
            
            while (resultado.next()){
                datospersonales[0] = resultado.getString(1);
                datospersonales[1] = resultado.getString(2);
                datospersonales[2] = resultado.getString(3);
                datospersonales[3] = resultado.getString(4);
                datospersonales[4] = resultado.getString(5);
                datospersonales[5] = resultado.getString(6);
                datospersonales[6] = resultado.getString(7);
                datospersonales[7] = resultado.getString(8);
                datospersonales[8] = resultado.getString(9);
                datospersonales[9] = resultado.getString(10);
                datospersonales[10] = resultado.getString(11);
                datospersonales[11] = resultado.getString(12);
                datospersonales[12] = resultado.getString(13);
                datospersonales[13] = resultado.getString(14);
                datospersonales[14] = resultado.getString(15);
                datospersonales[15] = resultado.getString(16);
                datospersonales[16] = resultado.getString(17);
  
                
                tdatospersonales.addRow(datospersonales);
            }
            TablaDatPerBomberos.setModel(tdatospersonales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    
    public void mostrarDatosInstitucionales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosInstitucionales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosInstitucionales.addColumn("");
        tdatosInstitucionales.addColumn("N Legajo");
        tdatosInstitucionales.addColumn("Apellido");        
        tdatosInstitucionales.addColumn("P Servicio");
        tdatosInstitucionales.addColumn("Antig");
        tdatosInstitucionales.addColumn("Jerarquia");
        tdatosInstitucionales.addColumn("Sit Revista");
        tdatosInstitucionales.addColumn("F Ing Escuela");
        tdatosInstitucionales.addColumn("F Asc Cuer Act");
        tdatosInstitucionales.addColumn("F Ing Sist Bom");
        tdatosInstitucionales.addColumn("Seccion");
        tdatosInstitucionales.addColumn("Conductor");
        tdatosInstitucionales.addColumn("T Licencia");
        tdatosInstitucionales.addColumn("Cat Habilitadas");
        tdatosInstitucionales.addColumn("F Venc Lic");
        tdatosInstitucionales.addColumn("Ant O Cuart");
        tdatosInstitucionales.addColumn("Ant Sist Bomb");
        tdatosInstitucionales.addColumn("F Pase Reserva");
        tdatosInstitucionales.addColumn("Vto DJ2040");
        tdatosInstitucionales.addColumn("Subsidio 13802");
        tdatosInstitucionales.addColumn("Ioma Laboral");
        TablaDatInstBomberos.setModel(tdatosInstitucionales);                                         // Agrega el modelo a la tabla
        
               String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosinstitucionalesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                 codigosql = "SELECT * FROM datosinstitucionalesbomberos WHERE NumeroLegajoInstBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datosinstitucionalesbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }      else {
                               codigosql = "SELECT * FROM datosinstitucionalesbomberos";
                               }
                        }
                      }
                 
        String []datosinstitucionales = new String[21];                                        // Crea arreglo para los datos de cada registro
        
        try {
            Statement leer = conect.createStatement();                          //de tipo Statement declaro variable leer y le asigno el metodo para la conexion
            ResultSet resultado = leer.executeQuery(codigosql);                    //de tipo ResultSet creo variable resultado y le asigno la consulta mediante la variable leer
            
            while (resultado.next()){
                datosinstitucionales[0] = resultado.getString(1);
                datosinstitucionales[1] = resultado.getString(2);
                datosinstitucionales[2] = resultado.getString(3);
                datosinstitucionales[3] = resultado.getString(4);
                datosinstitucionales[4] = resultado.getString(5);
                datosinstitucionales[5] = resultado.getString(6);
                datosinstitucionales[6] = resultado.getString(7);
                datosinstitucionales[7] = resultado.getString(8);
                datosinstitucionales[8] = resultado.getString(9);
                datosinstitucionales[9] = resultado.getString(10);
                datosinstitucionales[10] = resultado.getString(11);
                datosinstitucionales[11] = resultado.getString(12);
                datosinstitucionales[12] = resultado.getString(13);
                datosinstitucionales[13] = resultado.getString(14);
                datosinstitucionales[14] = resultado.getString(15);
                datosinstitucionales[15] = resultado.getString(16);
                datosinstitucionales[16] = resultado.getString(17);
                datosinstitucionales[17] = resultado.getString(18);
                datosinstitucionales[18] = resultado.getString(19);
                datosinstitucionales[19] = resultado.getString(20);
                datosinstitucionales[20] = resultado.getString(21);
                tdatosInstitucionales.addRow(datosinstitucionales);
            }
            TablaDatInstBomberos.setModel(tdatosInstitucionales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    
    public void mostrarDatosLaborales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosLaborales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosLaborales.addColumn("");
        tdatosLaborales.addColumn("N Legajo");
        tdatosLaborales.addColumn("Apellido");
        tdatosLaborales.addColumn("Empleador");
        tdatosLaborales.addColumn("Contacto Laboral");
        tdatosLaborales.addColumn("Domicilio Lab");
        tdatosLaborales.addColumn("Tipo Horario");
        tdatosLaborales.addColumn("H Inic Jornada");
        tdatosLaborales.addColumn("Tel Laboral");
        TablaDatLabBomberos.setModel(tdatosLaborales);                                         // Agrega el modelo a la tabla
        
                String codigosql;
        
         if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datoslaboralesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                 codigosql = "SELECT * FROM datoslaboralesbomberos WHERE NumeroLegajoLabBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datoslaboralesbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }     else {
                               codigosql = "SELECT * FROM datoslaboralesbomberos";
                               }
                        }
                      }
                 
        String []datoslaborales = new String[9];                                        // Crea arreglo para los datos de cada registro
        
        try {
            Statement leer = conect.createStatement();                          //de tipo Statement declaro variable leer y le asigno el metodo para la conexion
            ResultSet resultado = leer.executeQuery(codigosql);                    //de tipo ResultSet creo variable resultado y le asigno la consulta mediante la variable leer
            
            while (resultado.next()){
                datoslaborales[0] = resultado.getString(1);
                datoslaborales[1] = resultado.getString(2);
                datoslaborales[2] = resultado.getString(3);
                datoslaborales[3] = resultado.getString(4);
                datoslaborales[4] = resultado.getString(5);
                datoslaborales[5] = resultado.getString(6);
                datoslaborales[6] = resultado.getString(7);
                datoslaborales[7] = resultado.getString(8);
                datoslaborales[8] = resultado.getString(9);
                tdatosLaborales.addRow(datoslaborales);
            }
            TablaDatLabBomberos.setModel(tdatosLaborales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    public void mostrarDatosFamiliares(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosfamiliares = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosfamiliares.addColumn(" ");
        tdatosfamiliares.addColumn("N LEGAJO");
        tdatosfamiliares.addColumn("Apellido");
        tdatosfamiliares.addColumn("NOMBRE MADRE");
        tdatosfamiliares.addColumn("NOMBRE PADRE");
        tdatosfamiliares.addColumn("NOMBRE CONYUGUE");
        tdatosfamiliares.addColumn("DOMICILIO MADRE");
        tdatosfamiliares.addColumn("DOMICILIO PADRE");
        tdatosfamiliares.addColumn("DOMICILIO CONYUGUE");
        tdatosfamiliares.addColumn("TEL MADRE");
        tdatosfamiliares.addColumn("TEL PADRE");
        tdatosfamiliares.addColumn("TEL CONYUGUE");
        tdatosfamiliares.addColumn("CANT HIJOS");
        tdatosfamiliares.addColumn("NOMBRES HIJOS");

        TablaDatFamBomberos.setModel(tdatosfamiliares);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
                 if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosfamiliaresbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                 codigosql = "SELECT * FROM datosfamiliaresbomberos WHERE NumeroLegajoFamBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datosfamiliaresbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }    else {
                               codigosql = "SELECT * FROM datosfamiliaresbomberos";
                               }
                        }
                      }
                 
        String []datosfamiliares = new String[14];                                        // Crea arreglo para los datos de cada registro
        
        try {
            Statement leer = conect.createStatement();                          //de tipo Statement declaro variable leer y le asigno el metodo para la conexion
            ResultSet resultado = leer.executeQuery(codigosql);                    //de tipo ResultSet creo variable resultado y le asigno la consulta mediante la variable leer
            
            while (resultado.next()){
                datosfamiliares[0] = resultado.getString(1);
                datosfamiliares[1] = resultado.getString(2);
                datosfamiliares[2] = resultado.getString(3);
                datosfamiliares[3] = resultado.getString(4);
                datosfamiliares[4] = resultado.getString(5);
                datosfamiliares[5] = resultado.getString(6);
                datosfamiliares[6] = resultado.getString(7);
                datosfamiliares[7] = resultado.getString(8);
                datosfamiliares[8] = resultado.getString(9);
                datosfamiliares[9] = resultado.getString(10);
                datosfamiliares[10] = resultado.getString(11);
                datosfamiliares[11] = resultado.getString(12);
                datosfamiliares[12] = resultado.getString(13);
               datosfamiliares[13] = resultado.getString(14);
                tdatosfamiliares.addRow(datosfamiliares);
            }
            TablaDatFamBomberos.setModel(tdatosfamiliares);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    public void mostrarDatosMedicos(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosmedicos = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosmedicos.addColumn("");
        tdatosmedicos.addColumn("N Legajo");
        tdatosmedicos.addColumn("Apellido");
        tdatosmedicos.addColumn("Medico");
        tdatosmedicos.addColumn("Tel Medico");
        tdatosmedicos.addColumn("Obra Soc Part");
        tdatosmedicos.addColumn("F Ult Control");
        tdatosmedicos.addColumn("F Ult A/Clinico");
        tdatosmedicos.addColumn("Grupo Sang");
        tdatosmedicos.addColumn("Donante");
        tdatosmedicos.addColumn("Pres Art");
        tdatosmedicos.addColumn("Alergias");
        tdatosmedicos.addColumn("Medicamentos");
        tdatosmedicos.addColumn("F/UltDos Gripe");
        tdatosmedicos.addColumn("F/UltDos Neumo");
        tdatosmedicos.addColumn("F/UltDos AntTet");
        tdatosmedicos.addColumn("F/Prim Covid");
        tdatosmedicos.addColumn("F/Seg Covid");
        tdatosmedicos.addColumn("Hist Medica");
        TablaDatMedBomberos.setModel(tdatosmedicos);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosmedicosbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                 codigosql = "SELECT * FROM datosmedicosbomberos WHERE NumeroLegajoMedBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datosmedicosbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                               codigosql = "SELECT * FROM datosmedicosbomberos";
                               }
                        }
                      }
                 
        String []datosmedicos = new String[19];                                        // Crea arreglo para los datos de cada registro
        
        try {
            Statement leer = conect.createStatement();                          //de tipo Statement declaro variable leer y le asigno el metodo para la conexion
            ResultSet resultado = leer.executeQuery(codigosql);                    //de tipo ResultSet creo variable resultado y le asigno la consulta mediante la variable leer
            
            while (resultado.next()){
                datosmedicos[0] = resultado.getString(1);
                datosmedicos[1] = resultado.getString(2);
                datosmedicos[2] = resultado.getString(3);
                datosmedicos[3] = resultado.getString(4);
                datosmedicos[4] = resultado.getString(5);
                datosmedicos[5] = resultado.getString(6);
                datosmedicos[6] = resultado.getString(7);
                datosmedicos[7] = resultado.getString(8);
                datosmedicos[8] = resultado.getString(9);
                datosmedicos[9] = resultado.getString(10);
                datosmedicos[10] = resultado.getString(11);
                datosmedicos[11] = resultado.getString(12);
                datosmedicos[12] = resultado.getString(13);
                datosmedicos[13] = resultado.getString(14);
                datosmedicos[14] = resultado.getString(15);
                datosmedicos[15] = resultado.getString(16);
                datosmedicos[16] = resultado.getString(17);
                datosmedicos[17] = resultado.getString(18);
                datosmedicos[18] = resultado.getString(19);
                tdatosmedicos.addRow(datosmedicos);
            }
            TablaDatMedBomberos.setModel(tdatosmedicos);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    
    public void actualizardatospersonales(){
        int filapersonales = TablaDatPerBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int IdBombero = Integer.parseInt(this.TablaDatPerBomberos.getValueAt(filapersonales, 0).toString());
        String NumeroLegajoPerBom = TablaDatPerBomberos.getValueAt(filapersonales, 1).toString();
        String NombreBom = TablaDatPerBomberos.getValueAt(filapersonales, 2).toString();
        String ApellidoBom = TablaDatPerBomberos.getValueAt(filapersonales, 3).toString();
        String TipoDocBom = TablaDatPerBomberos.getValueAt(filapersonales, 4).toString();
        String NumDocBom = TablaDatPerBomberos.getValueAt(filapersonales, 5).toString();
        String DomCalleBom = TablaDatPerBomberos.getValueAt(filapersonales, 6).toString();
        String DomNumBom = TablaDatPerBomberos.getValueAt(filapersonales, 7).toString();
        String LocalidaBom = TablaDatPerBomberos.getValueAt(filapersonales, 8).toString();
        String BarrioBom = TablaDatPerBomberos.getValueAt(filapersonales, 9).toString();
        String CodigoPostBomb = TablaDatPerBomberos.getValueAt(filapersonales, 10).toString();
        String TelefonoBom = TablaDatPerBomberos.getValueAt(filapersonales, 11).toString();
        String EstadoCivilBom = TablaDatPerBomberos.getValueAt(filapersonales, 12).toString();
        String FecNacBom = TablaDatPerBomberos.getValueAt(filapersonales, 13).toString();
        String EdadBom = TablaDatPerBomberos.getValueAt(filapersonales, 14).toString();
        String EmailBom = TablaDatPerBomberos.getValueAt(filapersonales, 15).toString();
        String SexoBom = TablaDatPerBomberos.getValueAt(filapersonales, 16).toString();
        
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE datospersonalesbomberos SET NumeroLegajoPerBom ='"+NumeroLegajoPerBom+"',ApellidoBom ='"+ApellidoBom+"',NombreBom='"+NombreBom+"',ApellidoBom='"+ApellidoBom+"',TipoDocBom='"+TipoDocBom+"',NumDocBom='"+NumDocBom+"',DomCalleBom='"+DomCalleBom+"',DomNumBom='"+DomNumBom+"',LocalidaBom='"+LocalidaBom+"',BarrioBom='"+BarrioBom+"',CodigoPostBomb='"+CodigoPostBomb+"',TelefonoBom='"+TelefonoBom+"',EstadoCivilBom='"+EstadoCivilBom+"',FecNacBom='"+FecNacBom+"',EdadBom='"+EdadBom+"',EmailBom='"+EmailBom+"',SexoBom='"+SexoBom+"' WHERE IdBombero='"+IdBombero+"'");
            actualizar.executeUpdate();
            mostrarDatosPersonales(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS PERSONALES ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
    }   
    
    public void actualizardatoinstitucionales(){
        int filainstitucionales = TablaDatInstBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int iddatosinstitucionales = Integer.parseInt(this.TablaDatInstBomberos.getValueAt(filainstitucionales, 0).toString());
        String NumeroLegajoInstBom = TablaDatInstBomberos.getValueAt(filainstitucionales, 1).toString();
        String ApellidoBom = TablaDatInstBomberos.getValueAt(filainstitucionales, 2).toString();
        String PrestaServ = TablaDatInstBomberos.getValueAt(filainstitucionales, 3).toString();
        String Antig = TablaDatInstBomberos.getValueAt(filainstitucionales, 4).toString();
        String Jerarquia = TablaDatInstBomberos.getValueAt(filainstitucionales, 5).toString();
        String SitRevistaBom = TablaDatInstBomberos.getValueAt(filainstitucionales, 6).toString();
        String FechaIngEscuela = TablaDatInstBomberos.getValueAt(filainstitucionales, 7).toString();
        String FechaAscCuerAct = TablaDatInstBomberos.getValueAt(filainstitucionales, 8).toString();
        String FechaIngSistBom = TablaDatInstBomberos.getValueAt(filainstitucionales, 9).toString();
        String Seccion = TablaDatInstBomberos.getValueAt(filainstitucionales, 10).toString();
        String Conductor = TablaDatInstBomberos.getValueAt(filainstitucionales, 11).toString();
        String TipoLicenciaConductor = TablaDatInstBomberos.getValueAt(filainstitucionales, 12).toString();
        String CategoriasHabilitadas = TablaDatInstBomberos.getValueAt(filainstitucionales, 13).toString();
        String FechaVencLic = TablaDatInstBomberos.getValueAt(filainstitucionales, 14).toString();
        String AntOtroCuart = TablaDatInstBomberos.getValueAt(filainstitucionales, 15).toString();
        String AntSistBomb = TablaDatInstBomberos.getValueAt(filainstitucionales, 16).toString();
        String FechaPaseReserva = TablaDatInstBomberos.getValueAt(filainstitucionales, 17).toString();
        String VtoDJ2040Bom = TablaDatInstBomberos.getValueAt(filainstitucionales, 18).toString();
        String Subsidio13802 = TablaDatInstBomberos.getValueAt(filainstitucionales, 19).toString();
        String IomaLab = TablaDatInstBomberos.getValueAt(filainstitucionales, 20).toString();
         
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE datosinstitucionalesbomberos SET NumeroLegajoInstBom ='"+NumeroLegajoInstBom+"',ApellidoBom ='"+ApellidoBom+"',PrestaServ='"+PrestaServ+"',Antig='"+Antig+"',Jerarquia='"+Jerarquia+"',SitRevistaBom='"+SitRevistaBom+"',FechaIngEscuela='"+FechaIngEscuela+"',FechaAscCuerAct='"+FechaAscCuerAct+"',FechaIngSistBom='"+FechaIngSistBom+"',Seccion='"+Seccion+"',Conductor='"+Conductor+"',TipoLicenciaConductor='"+TipoLicenciaConductor+"',CategoriasHabilitadas='"+CategoriasHabilitadas+"',FechaVencLic='"+FechaVencLic+"',AntOtroCuart='"+AntOtroCuart+"',AntSistBomb='"+AntSistBomb+"',FechaPaseReserva='"+FechaPaseReserva+"' ,VtoDJ2040Bom='"+VtoDJ2040Bom+"' ,Subsidio13802='"+Subsidio13802+"' ,IomaLab='"+IomaLab+"' WHERE iddatosinstitucionales='"+iddatosinstitucionales+"'");
            actualizar.executeUpdate();
            mostrarDatosInstitucionales(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS INSTITUCIONALES ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
        
    }
    
    public void actualizardatolaborales(){
        int filalaborales = TablaDatLabBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int IdDatosLabBom = Integer.parseInt(this.TablaDatLabBomberos.getValueAt(filalaborales, 0).toString());
        String NumeroLegajoLabBom = TablaDatLabBomberos.getValueAt(filalaborales, 1).toString();
        String ApellidoBom = TablaDatLabBomberos.getValueAt(filalaborales, 2).toString();
        String EmpleadorBom = TablaDatLabBomberos.getValueAt(filalaborales, 3).toString();
        String ContactoLaboral = TablaDatLabBomberos.getValueAt(filalaborales, 4).toString();
        String DomicilioLabBom = TablaDatLabBomberos.getValueAt(filalaborales, 5).toString();
        String TipoHorarioLab = TablaDatLabBomberos.getValueAt(filalaborales, 6).toString();
        String HoraInicioJornada = TablaDatLabBomberos.getValueAt(filalaborales, 7).toString();
        String TelLaboralBom = TablaDatLabBomberos.getValueAt(filalaborales, 8).toString();
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE datoslaboralesbomberos SET NumeroLegajoLabBom ='"+NumeroLegajoLabBom+"',ApellidoBom ='"+ApellidoBom+"',EmpleadorBom='"+EmpleadorBom+"',ContactoLaboral='"+ContactoLaboral+"',DomicilioLabBom='"+DomicilioLabBom+"',TipoHorarioLab='"+TipoHorarioLab+"',HoraInicioJornada='"+HoraInicioJornada+"',	TelLaboralBom='"+TelLaboralBom+"' WHERE IdDatosLabBom='"+IdDatosLabBom+"'");
            actualizar.executeUpdate();
            mostrarDatosLaborales(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS LABORALES ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }        
    }
    
    public void actualizardatofamiliares(){
        int filafamiliares = TablaDatFamBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int IdDatosFamiliares = Integer.parseInt(this.TablaDatFamBomberos.getValueAt(filafamiliares, 0).toString());
        String NumeroLegajoFamBom = TablaDatFamBomberos.getValueAt(filafamiliares, 1).toString();
        String ApellidoBom = TablaDatFamBomberos.getValueAt(filafamiliares, 2).toString();
        String NomMadre = TablaDatFamBomberos.getValueAt(filafamiliares, 3).toString();
        String NomPadre = TablaDatFamBomberos.getValueAt(filafamiliares, 4).toString();
        String NomCony = TablaDatFamBomberos.getValueAt(filafamiliares, 5).toString();
        String DomMadre = TablaDatFamBomberos.getValueAt(filafamiliares, 6).toString();
        String DomPadre = TablaDatFamBomberos.getValueAt(filafamiliares, 7).toString();
        String DomCony = TablaDatFamBomberos.getValueAt(filafamiliares, 8).toString();
        String TelMadre = TablaDatFamBomberos.getValueAt(filafamiliares, 9).toString();
        String TelPadre = TablaDatFamBomberos.getValueAt(filafamiliares, 10).toString();
        String TelCony = TablaDatFamBomberos.getValueAt(filafamiliares, 11).toString();
        String CantHij = TablaDatFamBomberos.getValueAt(filafamiliares, 12).toString();
        String NomHij = TablaDatFamBomberos.getValueAt(filafamiliares, 13).toString();
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE datosfamiliaresbomberos SET NumeroLegajoFamBom ='"+NumeroLegajoFamBom+"',ApellidoBom ='"+ApellidoBom+"',NomMadre='"+NomMadre+"',NomPadre='"+NomPadre+"',NomCony='"+NomCony+"',DomMadre='"+DomMadre+"',DomPadre='"+DomPadre+"',DomCony='"+DomCony+"',TelMadre='"+TelMadre+"',TelPadre='"+TelPadre+"',TelCony='"+TelCony+"',CantHij='"+CantHij+"',NomHij='"+NomHij+"' WHERE IdDatosFamiliares='"+IdDatosFamiliares+"'");
            actualizar.executeUpdate();
            mostrarDatosFamiliares(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS FAMILIARES ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }       
    }
    
    public void actualizardatomedicos(){
        int filamedicos = TablaDatMedBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int IdDatosMedicosBom = Integer.parseInt(this.TablaDatMedBomberos.getValueAt(filamedicos, 0).toString());
        String NumeroLegajoMedBom = TablaDatMedBomberos.getValueAt(filamedicos, 1).toString();
        String ApellidoBom = TablaDatMedBomberos.getValueAt(filamedicos, 2).toString();
        String MedicoCabecera = TablaDatMedBomberos.getValueAt(filamedicos, 3).toString();
        String TelMedicoCabecera = TablaDatMedBomberos.getValueAt(filamedicos, 4).toString();
        String ObraSocPartBomb = TablaDatMedBomberos.getValueAt(filamedicos, 5).toString();
        String FechaUltControl = TablaDatMedBomberos.getValueAt(filamedicos, 6).toString();
        String FechaUltAnalClinico = TablaDatMedBomberos.getValueAt(filamedicos, 7).toString();
        String GrupoSangBom = TablaDatMedBomberos.getValueAt(filamedicos, 8).toString();
        String Donante = TablaDatMedBomberos.getValueAt(filamedicos, 9).toString();
        String PresionArtBom = TablaDatMedBomberos.getValueAt(filamedicos, 10).toString();
        String Alergias = TablaDatMedBomberos.getValueAt(filamedicos, 11).toString();
        String Medicamentos = TablaDatMedBomberos.getValueAt(filamedicos, 12).toString();
        String FechaUltDosGripe = TablaDatMedBomberos.getValueAt(filamedicos, 13).toString();
        String FechaUltDosNeumo = TablaDatMedBomberos.getValueAt(filamedicos, 14).toString();
        String FechaUltDosAntTet = TablaDatMedBomberos.getValueAt(filamedicos, 15).toString();
        String FechaPrimCovid = TablaDatMedBomberos.getValueAt(filamedicos, 16).toString();
        String FechaSegCovid = TablaDatMedBomberos.getValueAt(filamedicos, 17).toString();
        String HistoriaMedica = TablaDatMedBomberos.getValueAt(filamedicos, 18).toString();
                
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE datosmedicosbomberos SET NumeroLegajoMedBom ='"+NumeroLegajoMedBom+"',ApellidoBom ='"+ApellidoBom+"',MedicoCabecera='"+MedicoCabecera+"',TelMedicoCabecera='"+TelMedicoCabecera+"',ObraSocPartBomb='"+ObraSocPartBomb+"',FechaUltControl='"+FechaUltControl+"',FechaUltAnalClinico='"+FechaUltAnalClinico+"',GrupoSangBom='"+GrupoSangBom+"',Donante='"+Donante+"',PresionArtBom='"+PresionArtBom+"',Alergias='"+Alergias+"',Medicamentos='"+Medicamentos+"',FechaUltDosGripe='"+FechaUltDosGripe+"',FechaUltDosNeumo='"+FechaUltDosNeumo+"',FechaUltDosAntTet='"+FechaUltDosAntTet+"',FechaPrimCovid='"+FechaPrimCovid+"',FechaSegCovid='"+FechaSegCovid+"' ,HistoriaMedica='"+HistoriaMedica+"' WHERE IdDatosMedicosBom='"+IdDatosMedicosBom+"'");
            actualizar.executeUpdate();
            mostrarDatosMedicos(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS MEDICOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }    
    }
    
    
    
    public void eliminarpersonal(){    
        int fila = TablaDatPerBomberos.getSelectedRow();
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "ESTA ACCION ELIMINA UN REGISTRO DE LA BASE DE DATOS DEFINITIVAMENTE, DESEA CONTINUAR");
        
            if (confirmacion == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "SE BORRARA EL REGISTRO SELECCIONADO");
               String valor = TablaDatPerBomberos.getValueAt(fila, 0). toString();
        
             try {
                PreparedStatement elimi = conect.prepareStatement("DELETE FROM datospersonalesbomberos WHERE IdBombero='"+valor+"'");
                elimi.executeUpdate();
                mostrarDatosPersonales(0, null);
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog( null, e + "NO SE BORRO EL REGISTRO");
            }       
           
            }
            
            if (confirmacion == JOptionPane.NO_OPTION){
                // JOptionPane.showMessageDialog(null,"NO SE BORRO EL REGISTRO SELECCIONADO");
            }
            if (confirmacion == JOptionPane.CANCEL_OPTION){
                
            } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOpcion = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizarDatosPersonales = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatPerBomberos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatInstBomberos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaDatLabBomberos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaDatFamBomberos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDatMedBomberos = new javax.swing.JTable();
        btnActualizarDatosInstitucionales = new javax.swing.JButton();
        btnActualizarDatosLaborales = new javax.swing.JButton();
        btnActualizarDatosFamiliares = new javax.swing.JButton();
        btnActualizarDatosMedicos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administra Personal / Permite Modificar o Actualizar Datos del Personal / Ayudantia ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Personal por"));

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "NUMERO LEGAJO", "APELLIDO" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnBuscar))
        );

        btnActualizarDatosPersonales.setText("Actualizar Personales");
        btnActualizarDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosPersonalesActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("PRESIONE ACTUALIZAR PARA TERMINAR EL PROCESO DE MODIFICACION");

        jLabel2.setText("DAR ENTER LUEGO DE MODIFICAR EL DATO SELECCIONADO");

        jLabel1.setText("SELECCIONE CON DOBLE CLICK EL DATO A MODIFICAR");

        jTabbedPane1.setToolTipText("Muestra datos personales");

        TablaDatPerBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatPerBomberos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Personales", jPanel2);

        TablaDatInstBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaDatInstBomberos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Institucionales", jPanel3);

        TablaDatLabBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaDatLabBomberos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Laborales", jPanel4);

        TablaDatFamBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaDatFamBomberos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Familiares", jPanel5);

        TablaDatMedBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaDatMedBomberos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Medicos", jPanel6);

        btnActualizarDatosInstitucionales.setText("Actualizar Institucionales");
        btnActualizarDatosInstitucionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosInstitucionalesActionPerformed(evt);
            }
        });

        btnActualizarDatosLaborales.setText("Actualizar Laborales");
        btnActualizarDatosLaborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosLaboralesActionPerformed(evt);
            }
        });

        btnActualizarDatosFamiliares.setText("Actualizar Familiares");
        btnActualizarDatosFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosFamiliaresActionPerformed(evt);
            }
        });

        btnActualizarDatosMedicos.setText("Actualizar Datos Medicos");
        btnActualizarDatosMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosMedicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(364, 364, 364))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnActualizarDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarDatosInstitucionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarDatosLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnActualizarDatosMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarDatosFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarDatosPersonales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarDatosInstitucionales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarDatosLaborales)
                        .addGap(1, 1, 1)
                        .addComponent(btnActualizarDatosFamiliares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarDatosMedicos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int Opcion = cmbOpcion.getSelectedIndex();
        String ValorBus = txtBuscar.getText();
    
        mostrarDatosPersonales(Opcion,ValorBus);
        mostrarDatosInstitucionales(Opcion,ValorBus);
        mostrarDatosLaborales(Opcion,ValorBus);
        mostrarDatosFamiliares(Opcion,ValorBus);
        mostrarDatosMedicos(Opcion,ValorBus);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosPersonalesActionPerformed
            actualizardatospersonales();
    }//GEN-LAST:event_btnActualizarDatosPersonalesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarDatosInstitucionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosInstitucionalesActionPerformed
            actualizardatoinstitucionales();
    }//GEN-LAST:event_btnActualizarDatosInstitucionalesActionPerformed

    private void btnActualizarDatosLaboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosLaboralesActionPerformed
            actualizardatolaborales();
    }//GEN-LAST:event_btnActualizarDatosLaboralesActionPerformed

    private void btnActualizarDatosFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosFamiliaresActionPerformed
            actualizardatofamiliares();
    }//GEN-LAST:event_btnActualizarDatosFamiliaresActionPerformed

    private void btnActualizarDatosMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosMedicosActionPerformed
            actualizardatomedicos();
    }//GEN-LAST:event_btnActualizarDatosMedicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatFamBomberos;
    private javax.swing.JTable TablaDatInstBomberos;
    private javax.swing.JTable TablaDatLabBomberos;
    private javax.swing.JTable TablaDatMedBomberos;
    private javax.swing.JTable TablaDatPerBomberos;
    private javax.swing.JButton btnActualizarDatosFamiliares;
    private javax.swing.JButton btnActualizarDatosInstitucionales;
    private javax.swing.JButton btnActualizarDatosLaborales;
    private javax.swing.JButton btnActualizarDatosMedicos;
    private javax.swing.JButton btnActualizarDatosPersonales;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
