package GestionPersonal2;



import GestionPersonal2.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MuestraPersonalAyudantia extends javax.swing.JInternalFrame {
// Creo variable para la conexion
    Conexion enlace = new Conexion();
// Creo la conexion con la base    
    Connection conect = enlace.conectar();
   
    public MuestraPersonalAyudantia() {
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
        TablaMDatPerBomberos.setModel(tdatospersonales);                                         // Agrega el modelo a la tabla
        
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
            TablaMDatPerBomberos.setModel(tdatospersonales);
            
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
        TablaMDatInstBomberos.setModel(tdatosInstitucionales);                                         // Agrega el modelo a la tabla
        
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
            TablaMDatInstBomberos.setModel(tdatosInstitucionales);
            
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
        TablaMDatLabBomberos.setModel(tdatosLaborales);                                         // Agrega el modelo a la tabla
        
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
            TablaMDatLabBomberos.setModel(tdatosLaborales);
            
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

        TablaMDatFamBomberos.setModel(tdatosfamiliares);                                         // Agrega el modelo a la tabla
        
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
            TablaMDatFamBomberos.setModel(tdatosfamiliares);
            
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
        TablaMDatMedBomberos.setModel(tdatosmedicos);                                         // Agrega el modelo a la tabla
        
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
            TablaMDatMedBomberos.setModel(tdatosmedicos);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOpcion = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMDatPerBomberos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMDatInstBomberos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaMDatLabBomberos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaMDatFamBomberos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaMDatMedBomberos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Busqueda y Muestra de Personal / Ayudantia");
        setToolTipText("");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TablaMDatPerBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaMDatPerBomberos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Personales", jPanel2);

        TablaMDatInstBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaMDatInstBomberos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Institucionales", jPanel3);

        TablaMDatLabBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaMDatLabBomberos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Laborales", jPanel4);

        TablaMDatFamBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(TablaMDatFamBomberos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Familiares", jPanel5);

        TablaMDatMedBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TablaMDatMedBomberos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos Medicos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BtnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
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

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JTable TablaMDatFamBomberos;
    private javax.swing.JTable TablaMDatInstBomberos;
    private javax.swing.JTable TablaMDatLabBomberos;
    private javax.swing.JTable TablaMDatMedBomberos;
    private javax.swing.JTable TablaMDatPerBomberos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

   
}
