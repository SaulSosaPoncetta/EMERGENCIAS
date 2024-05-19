package GestionPersonal2;

/*


import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ExportarDatos extends javax.swing.JInternalFrame {
    Exportar obj;
    
    Conexion enlace = new Conexion();// Creo variable para la conexion
    Connection conect = enlace.conectar();// Creo la conexion con la base
    
    public ExportarDatos() {
        initComponents();
        mostrarDatosPersonales(0, null);
        mostrarDatosInstitucionales(0, null);
        mostrarDatosLaborales(0, null);
        mostrarDatosFamiliares(0, null);
        mostrarDatosMedicos(0, null);
    }
public void mostrarDatosPersonales(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatospersonales = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatospersonales.addColumn("IdBombero");
        tdatospersonales.addColumn("NumeroLegajo");
        tdatospersonales.addColumn("Nombre");
        tdatospersonales.addColumn("Apellido");
        tdatospersonales.addColumn("TipoDoc");
        tdatospersonales.addColumn("NumDoc");
        tdatospersonales.addColumn("DomCalle");
        tdatospersonales.addColumn("DomNum");
        tdatospersonales.addColumn("Localidad");
        tdatospersonales.addColumn("Barrio");
        tdatospersonales.addColumn("CodigoPost");
        tdatospersonales.addColumn("Telefono");
        tdatospersonales.addColumn("EstadoCivil");
        tdatospersonales.addColumn("FecNac");
        tdatospersonales.addColumn("Edad");
        tdatospersonales.addColumn("Email");
        tdatospersonales.addColumn("Sexo");
        TablaDatPerExportar.setModel(tdatospersonales);                                         // Agrega el modelo a la tabla
        
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
            TablaDatPerExportar.setModel(tdatospersonales);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    
    public void mostrarDatosInstitucionales(int opbuscar, String valorBuscar){
        
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
        TablaDatInstExportar.setModel(tdatosInstitucionales);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosinstitucionalesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datosinstitucionalesbomberos WHERE NumeroLegajoInstBom = '"+valorBuscar+"'";
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
            TablaDatInstExportar.setModel(tdatosInstitucionales);
            
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
        TablaDatLabExportar.setModel(tdatosLaborales);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datoslaboralesbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datoslaboralesbomberos WHERE NumeroLegajoLabBom = '"+valorBuscar+"'";
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
            TablaDatLabExportar.setModel(tdatosLaborales);
            
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

        TablaDatFamExportar.setModel(tdatosfamiliares);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM datosfamiliaresbomberos";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                  codigosql = "SELECT * FROM datosfamiliaresbomberos WHERE NumeroLegajoFamBom = '"+valorBuscar+"'";
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
            TablaDatFamExportar.setModel(tdatosfamiliares);
            
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
        TablaDatMedExportar.setModel(tdatosmedicos);                                         // Agrega el modelo a la tabla
        
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
            TablaDatMedExportar.setModel(tdatosmedicos);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOpcionExpDatos = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarExpDatos = new javax.swing.JButton();
        BtnCancelarExpDatos = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatPerExportar = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaDatInstExportar = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDatLabExportar = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaDatFamExportar = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaDatMedExportar = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Exportar Datos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Personal por"));

        cmbOpcionExpDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "NUMERO LEGAJO", "APELLIDO" }));

        btnBuscarExpDatos.setText("Buscar");
        btnBuscarExpDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarExpDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbOpcionExpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarExpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cmbOpcionExpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnBuscarExpDatos))
        );

        BtnCancelarExpDatos.setText("Cancelar");
        BtnCancelarExpDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarExpDatosActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar Datos P/TIPO ");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        TablaDatPerExportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaDatPerExportar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Datos Personales", jPanel3);

        TablaDatInstExportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaDatInstExportar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Datos Institucionales", jPanel4);

        TablaDatLabExportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaDatLabExportar);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Datos Laborales", jPanel5);

        TablaDatFamExportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(TablaDatFamExportar);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Datos Familiares", jPanel6);

        TablaDatMedExportar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TablaDatMedExportar);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Datos Medicos", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelarExpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane2)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                .addComponent(BtnCancelarExpDatos)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(84, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarExpDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarExpDatosActionPerformed
        int Opcion = cmbOpcionExpDatos.getSelectedIndex();
        String ValorBus = txtBuscar.getText();
    
        mostrarDatosPersonales(Opcion,ValorBus);
        mostrarDatosInstitucionales(Opcion,ValorBus);
        mostrarDatosLaborales(Opcion,ValorBus);
        mostrarDatosFamiliares(Opcion,ValorBus);
        mostrarDatosMedicos(Opcion,ValorBus);
    }//GEN-LAST:event_btnBuscarExpDatosActionPerformed

    private void BtnCancelarExpDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarExpDatosActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCancelarExpDatosActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            obj = new Exportar(); //Llamo a la clase exportar.
            obj.exportarExcel(TablaDatPerExportar); //llamo el metodo exportar a excel.
            JOptionPane.showMessageDialog(null, "Datos exportados con exito");
            obj.exportarExcel(TablaDatInstExportar);
            JOptionPane.showMessageDialog(null, "Datos exportados con exito");
            obj.exportarExcel(TablaDatLabExportar);
            JOptionPane.showMessageDialog(null, "Datos exportados con exito");
            obj.exportarExcel(TablaDatFamExportar);
            JOptionPane.showMessageDialog(null, "Datos exportados con exito");
            obj.exportarExcel(TablaDatMedExportar);
            JOptionPane.showMessageDialog(null, "Datos exportados con exito");
        } catch (IOException ex){
            
        }
    }//GEN-LAST:event_btnExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarExpDatos;
    private javax.swing.JTable TablaDatFamExportar;
    private javax.swing.JTable TablaDatInstExportar;
    private javax.swing.JTable TablaDatLabExportar;
    private javax.swing.JTable TablaDatMedExportar;
    private javax.swing.JTable TablaDatPerExportar;
    private javax.swing.JButton btnBuscarExpDatos;
    private javax.swing.JButton btnExportar;
    private javax.swing.JComboBox<String> cmbOpcionExpDatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}*/
