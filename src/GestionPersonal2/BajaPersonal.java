package GestionPersonal2;



import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BajaPersonal extends javax.swing.JInternalFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    
    public BajaPersonal() {
        initComponents();
        mostrarDatosPersonales(0, null);
        //mostrarDatosInstitucionales(0, null);
        //mostrarDatosLaborales(0, null);
        //mostrarDatosFamiliares(0, null);
        //mostrarDatosMedicos(0, null);                                         //muestra los datos del personal en tabla
    }
      
    public void mostrarDatosPersonales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatospersonales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatospersonales.addColumn("Id Bombero");
        tdatospersonales.addColumn("Numero Legajo");
        tdatospersonales.addColumn("Nombre");
        tdatospersonales.addColumn("Apellido");
        tdatospersonales.addColumn("Tipo Doc");
        tdatospersonales.addColumn("Num Doc");
        tdatospersonales.addColumn("Dom Calle");
        tdatospersonales.addColumn("Dom Num");
        tdatospersonales.addColumn("Localidad");
        tdatospersonales.addColumn("Barrio");
        tdatospersonales.addColumn("Codigo Post");
        tdatospersonales.addColumn("Telefono");
        tdatospersonales.addColumn("Estado Civil");
        tdatospersonales.addColumn("FecNac");
        tdatospersonales.addColumn("Edad");
        tdatospersonales.addColumn("Email");
        tdatospersonales.addColumn("Sexo");
        TablaEDatPerBomberos.setModel(tdatospersonales);                                         // Agrega el modelo a la tabla
        
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
                           if(opbuscar == 3 && valorBuscar != null){
                             codigosql = "SELECT * FROM datospersonalesbomberos WHERE NumDocBom = '"+valorBuscar+"'";
                             }   else {
                               codigosql = "SELECT * FROM datospersonalesbomberos";
                               }
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
            TablaEDatPerBomberos.setModel(tdatospersonales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    
    /* public void mostrarDatosInstitucionales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosInstitucionales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosInstitucionales.addColumn("iddatosinstitucionales");
        tdatosInstitucionales.addColumn("NumeroLegajo");
        tdatosInstitucionales.addColumn("PrestaServ");
        tdatosInstitucionales.addColumn("Antig");
        tdatosInstitucionales.addColumn("Jerarquia");
        tdatosInstitucionales.addColumn("SitRevistaBom");
        tdatosInstitucionales.addColumn("FechaIngEscuela");
        tdatosInstitucionales.addColumn("FechaAscCuerAct");
        tdatosInstitucionales.addColumn("FechaIngSistBom");
        tdatosInstitucionales.addColumn("Seccion");
        tdatosInstitucionales.addColumn("Conductor");
        tdatosInstitucionales.addColumn("TipoLicenciaConductor");
        tdatosInstitucionales.addColumn("CategoriasHabilitadas");
        tdatosInstitucionales.addColumn("FechaVencLic");
        tdatosInstitucionales.addColumn("AntOtroCuart");
        tdatosInstitucionales.addColumn("AntSistBomb");
        tdatosInstitucionales.addColumn("FechaPaseReserva");
        tdatosInstitucionales.addColumn("VtoDJ2040Bom");
        tdatosInstitucionales.addColumn("Subsidio13802");
        tdatosInstitucionales.addColumn("IomaLab");
        //TablaEDatInstBomberos.setModel(tdatosInstitucionales);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosinstitucionalesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datosinstitucionalesbomberos WHERE NumeroLegajoBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datosinstitucionalesbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                           if(opbuscar == 3 && valorBuscar != null){
                              codigosql = "SELECT * FROM datosinstitucionalesbomberos WHERE NumDocBom = '"+valorBuscar+"'";
                           }   else {
                               codigosql = "SELECT * FROM datosinstitucionalesbomberos";
                }
            }
        }
    }
        String []datosinstitucionales = new String[20];                                        // Crea arreglo para los datos de cada registro
        
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
                
                tdatosInstitucionales.addRow(datosinstitucionales);
            }
            //TablaEDatInstBomberos.setModel(tdatosInstitucionales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    
    public void mostrarDatosLaborales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosLaborales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosLaborales.addColumn("IdDatosLabBom");
        tdatosLaborales.addColumn("NumeroLegajoBom");
        tdatosLaborales.addColumn("EmpleadorBom");
        tdatosLaborales.addColumn("ContactoLaboral");
        tdatosLaborales.addColumn("DomicilioLabBom");
        tdatosLaborales.addColumn("TipoHorarioLab");
        tdatosLaborales.addColumn("HoraInicioJornada");
        tdatosLaborales.addColumn("TelLaboralBom");
        //TablaEDatLabBomberos.setModel(tdatosLaborales);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datoslaboralesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datoslaboralesbomberos WHERE NumeroLegajoBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datoslaboralesbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                           if(opbuscar == 3 && valorBuscar != null){
                              codigosql = "SELECT * FROM datoslaboralesbomberos WHERE NumDocBom = '"+valorBuscar+"'";
                           }   else {
                               codigosql = "SELECT * FROM datoslaboralesbomberos";
                }
            }
        }
    }
        String []datoslaborales = new String[8];                                        // Crea arreglo para los datos de cada registro
        
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
                   
                tdatosLaborales.addRow(datoslaborales);
            }
            //TablaEDatLabBomberos.setModel(tdatosLaborales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    public void mostrarDatosFamiliares(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosfamiliares = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosfamiliares.addColumn(" ");
        tdatosfamiliares.addColumn("N LEGAJO");
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

        //TablaEDatFamBomberos.setModel(tdatosfamiliares);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosfamiliaresbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datosfamiliaresbomberos WHERE NumeroLegajoBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datosfamiliaresbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                           if(opbuscar == 3 && valorBuscar != null){
                              codigosql = "SELECT * FROM datosfamiliaresbomberos WHERE NumDocBom = '"+valorBuscar+"'";
                           }   else {
                               codigosql = "SELECT * FROM datosfamiliaresbomberos";
                }
            }
        }
    }
        String []datosfamiliares = new String[13];                                        // Crea arreglo para los datos de cada registro
        
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
               
                tdatosfamiliares.addRow(datosfamiliares);
            }
            //TablaEDatFamBomberos.setModel(tdatosfamiliares);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    public void mostrarDatosMedicos(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosmedicos = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosmedicos.addColumn("");
        tdatosmedicos.addColumn("N Legajo");
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
        //TablaEDatMedBomberos.setModel(tdatosmedicos);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosmedicosbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datosmedicosbomberos WHERE NumeroLegajoBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM datosmedicosbomberos WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                           if(opbuscar == 3 && valorBuscar != null){
                              codigosql = "SELECT * FROM datosmedicosbomberos WHERE NumDocBom = '"+valorBuscar+"'";
                           }   else {
                               codigosql = "SELECT * FROM datosmedicosbomberos";
                }
            }
        }
    }
        String []datosmedicos = new String[18];                                        // Crea arreglo para los datos de cada registro
        
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
                
                tdatosmedicos.addRow(datosmedicos);
            }
            //TablaEDatMedBomberos.setModel(tdatosmedicos);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }*/
        
        
        

    
public void actualizardatospersonales(){
        int filapersonales = TablaEDatPerBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int Id = Integer.parseInt(this.TablaEDatPerBomberos.getValueAt(filapersonales, 0).toString());
        String Num = TablaEDatPerBomberos.getValueAt(filapersonales, 1).toString();
        String Ape = TablaEDatPerBomberos.getValueAt(filapersonales, 2).toString();
        String Nom = TablaEDatPerBomberos.getValueAt(filapersonales, 3).toString();
        String Sex = TablaEDatPerBomberos.getValueAt(filapersonales, 4).toString();
        String Fec = TablaEDatPerBomberos.getValueAt(filapersonales, 5).toString();
        String Eda = TablaEDatPerBomberos.getValueAt(filapersonales, 6).toString();
        String Tip = TablaEDatPerBomberos.getValueAt(filapersonales, 7).toString();
        String Doc = TablaEDatPerBomberos.getValueAt(filapersonales, 8).toString();
        String Cal = TablaEDatPerBomberos.getValueAt(filapersonales, 9).toString();
        String Nca = TablaEDatPerBomberos.getValueAt(filapersonales, 10).toString();
        String Bar = TablaEDatPerBomberos.getValueAt(filapersonales, 11).toString();
        String Tel = TablaEDatPerBomberos.getValueAt(filapersonales, 12).toString();
        String Raz = TablaEDatPerBomberos.getValueAt(filapersonales, 13).toString();
        String Sal = TablaEDatPerBomberos.getValueAt(filapersonales, 14).toString();
        // String Mai = TablaClientes.getValueAt(fila, 15).toString();
        
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE cliente SET NumeroCliente ='"+Num+"',ApellidoCliente='"+Ape+"',NombreCliente='"+Nom+"',SexoCliente='"+Sex+"',FechaNacCliente='"+Fec+"',EdadCliente='"+Eda+"',TipoDocumento='"+Tip+"',NumeroDocCliente='"+Doc+"',CalleCliente='"+Cal+"',NumCalleCliente='"+Nca+"',BarrioCliente='"+Bar+"',TelefonoCliente='"+Tel+"',RazonSocialCliente='"+Raz+"',SaldoCliente='"+Sal+"' WHERE IdCliente='"+Id+"'");
            actualizar.executeUpdate();
            mostrarDatosPersonales(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
    }   
    /*public void actualizardatosinstitucionales(){
        int filainstitucionales = TablaEDatInstBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int Id = Integer.parseInt(this.TablaEDatInstBomberos.getValueAt(filainstitucionales, 0).toString());
        String Num = TablaEDatInstBomberos.getValueAt(filainstitucionales, 1).toString();
        String Ape = TablaEDatInstBomberos.getValueAt(filainstitucionales, 2).toString();
        String Nom = TablaEDatInstBomberos.getValueAt(filainstitucionales, 3).toString();
        String Sex = TablaEDatInstBomberos.getValueAt(filainstitucionales, 4).toString();
        String Fec = TablaEDatInstBomberos.getValueAt(filainstitucionales, 5).toString();
        String Eda = TablaEDatInstBomberos.getValueAt(filainstitucionales, 6).toString();
        String Tip = TablaEDatInstBomberos.getValueAt(filainstitucionales, 7).toString();
        String Doc = TablaEDatInstBomberos.getValueAt(filainstitucionales, 8).toString();
        String Cal = TablaEDatInstBomberos.getValueAt(filainstitucionales, 9).toString();
        String Nca = TablaEDatInstBomberos.getValueAt(filainstitucionales, 10).toString();
        String Bar = TablaEDatInstBomberos.getValueAt(filainstitucionales, 11).toString();
        String Tel = TablaEDatInstBomberos.getValueAt(filainstitucionales, 12).toString();
        String Raz = TablaEDatInstBomberos.getValueAt(filainstitucionales, 13).toString();
        String Sal = TablaEDatInstBomberos.getValueAt(filainstitucionales, 14).toString();
        // String Mai = TablaClientes.getValueAt(fila, 15).toString();
        
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE cliente SET NumeroCliente ='"+Num+"',ApellidoCliente='"+Ape+"',NombreCliente='"+Nom+"',SexoCliente='"+Sex+"',FechaNacCliente='"+Fec+"',EdadCliente='"+Eda+"',TipoDocumento='"+Tip+"',NumeroDocCliente='"+Doc+"',CalleCliente='"+Cal+"',NumCalleCliente='"+Nca+"',BarrioCliente='"+Bar+"',TelefonoCliente='"+Tel+"',RazonSocialCliente='"+Raz+"',SaldoCliente='"+Sal+"' WHERE IdCliente='"+Id+"'");
            actualizar.executeUpdate();
            mostrarDatosInstitucionales(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
    }
public void actualizardatoslaborales(){
        int filalaborales = TablaEDatLabBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int Id = Integer.parseInt(this.TablaEDatLabBomberos.getValueAt(filalaborales, 0).toString());
        String Num = TablaEDatLabBomberos.getValueAt(filalaborales, 1).toString();
        String Ape = TablaEDatLabBomberos.getValueAt(filalaborales, 2).toString();
        String Nom = TablaEDatLabBomberos.getValueAt(filalaborales, 3).toString();
        String Sex = TablaEDatLabBomberos.getValueAt(filalaborales, 4).toString();
        String Fec = TablaEDatLabBomberos.getValueAt(filalaborales, 5).toString();
        String Eda = TablaEDatLabBomberos.getValueAt(filalaborales, 6).toString();
        String Tip = TablaEDatLabBomberos.getValueAt(filalaborales, 7).toString();
        String Doc = TablaEDatLabBomberos.getValueAt(filalaborales, 8).toString();
        String Cal = TablaEDatLabBomberos.getValueAt(filalaborales, 9).toString();
        String Nca = TablaEDatLabBomberos.getValueAt(filalaborales, 10).toString();
        String Bar = TablaEDatLabBomberos.getValueAt(filalaborales, 11).toString();
        String Tel = TablaEDatLabBomberos.getValueAt(filalaborales, 12).toString();
        String Raz = TablaEDatLabBomberos.getValueAt(filalaborales, 13).toString();
        String Sal = TablaEDatLabBomberos.getValueAt(filalaborales, 14).toString();
        // String Mai = TablaClientes.getValueAt(fila, 15).toString();
        
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE cliente SET NumeroCliente ='"+Num+"',ApellidoCliente='"+Ape+"',NombreCliente='"+Nom+"',SexoCliente='"+Sex+"',FechaNacCliente='"+Fec+"',EdadCliente='"+Eda+"',TipoDocumento='"+Tip+"',NumeroDocCliente='"+Doc+"',CalleCliente='"+Cal+"',NumCalleCliente='"+Nca+"',BarrioCliente='"+Bar+"',TelefonoCliente='"+Tel+"',RazonSocialCliente='"+Raz+"',SaldoCliente='"+Sal+"' WHERE IdCliente='"+Id+"'");
            actualizar.executeUpdate();
            mostrarDatosLaborales(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
    }    
    public void actualizardatosfamiliares(){
        int filafamiliares = TablaEDatFamBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int Id = Integer.parseInt(this.TablaEDatFamBomberos.getValueAt(filafamiliares, 0).toString());
        String Num = TablaEDatFamBomberos.getValueAt(filafamiliares, 1).toString();
        String Ape = TablaEDatFamBomberos.getValueAt(filafamiliares, 2).toString();
        String Nom = TablaEDatFamBomberos.getValueAt(filafamiliares, 3).toString();
        String Sex = TablaEDatFamBomberos.getValueAt(filafamiliares, 4).toString();
        String Fec = TablaEDatFamBomberos.getValueAt(filafamiliares, 5).toString();
        String Eda = TablaEDatFamBomberos.getValueAt(filafamiliares, 6).toString();
        String Tip = TablaEDatFamBomberos.getValueAt(filafamiliares, 7).toString();
        String Doc = TablaEDatFamBomberos.getValueAt(filafamiliares, 8).toString();
        String Cal = TablaEDatFamBomberos.getValueAt(filafamiliares, 9).toString();
        String Nca = TablaEDatFamBomberos.getValueAt(filafamiliares, 10).toString();
        String Bar = TablaEDatFamBomberos.getValueAt(filafamiliares, 11).toString();
        String Tel = TablaEDatFamBomberos.getValueAt(filafamiliares, 12).toString();
        String Raz = TablaEDatFamBomberos.getValueAt(filafamiliares, 13).toString();
        String Sal = TablaEDatFamBomberos.getValueAt(filafamiliares, 14).toString();
        // String Mai = TablaClientes.getValueAt(fila, 15).toString();
        
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE cliente SET NumeroCliente ='"+Num+"',ApellidoCliente='"+Ape+"',NombreCliente='"+Nom+"',SexoCliente='"+Sex+"',FechaNacCliente='"+Fec+"',EdadCliente='"+Eda+"',TipoDocumento='"+Tip+"',NumeroDocCliente='"+Doc+"',CalleCliente='"+Cal+"',NumCalleCliente='"+Nca+"',BarrioCliente='"+Bar+"',TelefonoCliente='"+Tel+"',RazonSocialCliente='"+Raz+"',SaldoCliente='"+Sal+"' WHERE IdCliente='"+Id+"'");
            actualizar.executeUpdate();
            mostrarDatosFamiliares(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
    }
    
    public void actualizardatosmedicos(){
        int filamedicos = TablaEDatMedBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int Id = Integer.parseInt(this.TablaEDatMedBomberos.getValueAt(filamedicos, 0).toString());
        String Num = TablaEDatMedBomberos.getValueAt(filamedicos, 1).toString();
        String Ape = TablaEDatMedBomberos.getValueAt(filamedicos, 2).toString();
        String Nom = TablaEDatMedBomberos.getValueAt(filamedicos, 3).toString();
        String Sex = TablaEDatMedBomberos.getValueAt(filamedicos, 4).toString();
        String Fec = TablaEDatMedBomberos.getValueAt(filamedicos, 5).toString();
        String Eda = TablaEDatMedBomberos.getValueAt(filamedicos, 6).toString();
        String Tip = TablaEDatMedBomberos.getValueAt(filamedicos, 7).toString();
        String Doc = TablaEDatMedBomberos.getValueAt(filamedicos, 8).toString();
        String Cal = TablaEDatMedBomberos.getValueAt(filamedicos, 9).toString();
        String Nca = TablaEDatMedBomberos.getValueAt(filamedicos, 10).toString();
        String Bar = TablaEDatMedBomberos.getValueAt(filamedicos, 11).toString();
        String Tel = TablaEDatMedBomberos.getValueAt(filamedicos, 12).toString();
        String Raz = TablaEDatMedBomberos.getValueAt(filamedicos, 13).toString();
        String Sal = TablaEDatMedBomberos.getValueAt(filamedicos, 14).toString();
        // String Mai = TablaClientes.getValueAt(fila, 15).toString();
        
        
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE cliente SET NumeroCliente ='"+Num+"',ApellidoCliente='"+Ape+"',NombreCliente='"+Nom+"',SexoCliente='"+Sex+"',FechaNacCliente='"+Fec+"',EdadCliente='"+Eda+"',TipoDocumento='"+Tip+"',NumeroDocCliente='"+Doc+"',CalleCliente='"+Cal+"',NumCalleCliente='"+Nca+"',BarrioCliente='"+Bar+"',TelefonoCliente='"+Tel+"',RazonSocialCliente='"+Raz+"',SaldoCliente='"+Sal+"' WHERE IdCliente='"+Id+"'");
            actualizar.executeUpdate();
            mostrarDatosMedicos(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }
    }*/
    
    
    public void eliminardatospersonales(){    
        int fila = TablaEDatPerBomberos.getSelectedRow();
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "ESTA ACCION ELIMINA UN REGISTRO DE UN BOMBERO DE LA BASE DE DATOS DEFINITIVAMENTE, DESEA CONTINUAR");
        
            if (confirmacion == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "SE BORRARA EL REGISTRO DEDATOS PERSONALES DEL BOMBERO SELECCIONADO");
               
               String NumeroLegajoPerBom = TablaEDatPerBomberos.getValueAt(fila, 1). toString();
               String NumeroLegajoInstBom = NumeroLegajoPerBom;
               String NumeroLegajoLabBom = NumeroLegajoPerBom;
               String NumeroLegajoFamBom = NumeroLegajoPerBom;
               String NumeroLegajoMedBom = NumeroLegajoPerBom;
               
             try {
                PreparedStatement elimipersonales = conect.prepareStatement("DELETE FROM datospersonalesbomberos WHERE NumeroLegajoPerBom='"+NumeroLegajoPerBom+"'");
                elimipersonales.executeUpdate();
                PreparedStatement elimiinstit = conect.prepareStatement("DELETE FROM datosinstitucionalesbomberos WHERE NumeroLegajoInstBom='"+NumeroLegajoInstBom+"'");
                elimiinstit.executeUpdate();
                PreparedStatement elimilabo = conect.prepareStatement("DELETE FROM datoslaboralesbomberos WHERE NumeroLegajoLabBom='"+NumeroLegajoLabBom+"'");
                elimilabo.executeUpdate();
                PreparedStatement elimifami = conect.prepareStatement("DELETE FROM datosfamiliaresbomberos WHERE NumeroLegajoFamBom='"+NumeroLegajoFamBom+"'");
                elimifami.executeUpdate();
                PreparedStatement elimimed = conect.prepareStatement("DELETE FROM datosmedicosbomberos WHERE NumeroLegajoMedBom='"+NumeroLegajoMedBom+"'");
                elimimed.executeUpdate();
                
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
    
   /* public void eliminardatosinstitucionales(){    
        int fila = TablaEDatInstBomberos.getSelectedRow();
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "ESTA ACCION ELIMINA UN REGISTRO DE LA BASE DE DATOS INSTITUCIONALES DEFINITIVAMENTE, DESEA CONTINUAR");
        
            if (confirmacion == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "SE BORRARA EL REGISTRO SELECCIONADO");
               String valor = TablaEDatInstBomberos.getValueAt(fila, 0). toString();
        
             try {
                PreparedStatement elimi = conect.prepareStatement("DELETE FROM cliente WHERE IdCliente='"+valor+"'");
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
    
    public void eliminardatoslaborales(){    
        int fila = TablaEDatPerBomberos.getSelectedRow();
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "ESTA ACCION ELIMINA UN REGISTRO DE LA BASE DE DATOS DEFINITIVAMENTE, DESEA CONTINUAR");
        
            if (confirmacion == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "SE BORRARA EL REGISTRO SELECCIONADO");
               String valor = TablaEDatPerBomberos.getValueAt(fila, 0). toString();
        
             try {
                PreparedStatement elimi = conect.prepareStatement("DELETE FROM cliente WHERE IdCliente='"+valor+"'");
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
    public void eliminardatosfamiliares(){    
        int fila = TablaEDatPerBomberos.getSelectedRow();
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "ESTA ACCION ELIMINA UN REGISTRO DE LA BASE DE DATOS DEFINITIVAMENTE, DESEA CONTINUAR");
        
            if (confirmacion == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "SE BORRARA EL REGISTRO SELECCIONADO");
               String valor = TablaEDatPerBomberos.getValueAt(fila, 0). toString();
        
             try {
                PreparedStatement elimi = conect.prepareStatement("DELETE FROM cliente WHERE IdCliente='"+valor+"'");
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
    
    public void eliminardatosmedicos(){    
        int fila = TablaEDatPerBomberos.getSelectedRow();
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "ESTA ACCION ELIMINA UN REGISTRO DE LA BASE DE DATOS DEFINITIVAMENTE, DESEA CONTINUAR");
        
            if (confirmacion == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "SE BORRARA EL REGISTRO SELECCIONADO");
               String valor = TablaEDatPerBomberos.getValueAt(fila, 0). toString();
        
             try {
                PreparedStatement elimi = conect.prepareStatement("DELETE FROM cliente WHERE IdCliente='"+valor+"'");
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
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOpcion = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEDatPerBomberos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Borrado de Datos de Personal / Ayudantia");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Personal por"));

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "NUMERO LEGAJO" }));

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
                .addGap(18, 18, 18)
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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        TablaEDatPerBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaEDatPerBomberos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Personales", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int Opcion = cmbOpcion.getSelectedIndex();
        String ValorBus = txtBuscar.getText();

        mostrarDatosPersonales(Opcion,ValorBus);
        //mostrarDatosInstitucionales(Opcion,ValorBus);
       // mostrarDatosLaborales(Opcion,ValorBus);
        //mostrarDatosFamiliares(Opcion,ValorBus);
        //mostrarDatosMedicos(Opcion,ValorBus); 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminardatospersonales();
        //eliminardatosinstitucionales();
        //eliminardatoslaborales();
        //eliminardatosfamiliares();
        //eliminardatosmedicos();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEDatPerBomberos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    
}
