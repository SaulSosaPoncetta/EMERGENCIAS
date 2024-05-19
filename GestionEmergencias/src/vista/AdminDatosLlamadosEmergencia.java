package vista;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminDatosLlamadosEmergencia extends javax.swing.JInternalFrame {
// Creo variable para la conexion
    Conexion enlace = new Conexion();
// Creo la conexion con la base    
    Connection conect = enlace.conectar();
    
    public AdminDatosLlamadosEmergencia() {
        initComponents();
        mostrarDatosApersib(0, null);
    }
    public void mostrarDatosApersib(int opbuscar, String valorBuscar){
        
        DefaultTableModel tdatosapersib = new DefaultTableModel();                   // DEFINE COLUMNAS DE TABLA EN FORMULARIO
        tdatosapersib.addColumn("");
        tdatosapersib.addColumn("N Legajo");
        tdatosapersib.addColumn("Apellido");
        tdatosapersib.addColumn("InformeElevado");
        tdatosapersib.addColumn("ResolucionApersib");
        TablaDatApersibBomberos.setModel(tdatosapersib);                                         // Agrega el modelo a la tabla
        
        String codigosql;
        
        if (opbuscar == 0 && valorBuscar == null){
            codigosql = "SELECT * FROM apersibimientospersonal";
        }   else {
               if(opbuscar == 1 && valorBuscar != null){
                 codigosql = "SELECT * FROM apersibimientospersonal WHERE NumeroLegajoAperPerBom = '"+valorBuscar+"'";
               } else {
                    if(opbuscar == 2 && valorBuscar != null){
                       codigosql = "SELECT * FROM apersibimientospersonal WHERE ApellidoBom = '"+valorBuscar+"'";
                    }   else {
                              codigosql = "SELECT * FROM apersibimientospersonal";
                               }
                        }
                      }
                 
        String []datosapersib = new String[6];                                        // Crea arreglo para los datos de cada registro
        
        try {
            Statement leer = conect.createStatement();                          //de tipo Statement declaro variable leer y le asigno el metodo para la conexion
            ResultSet resultado = leer.executeQuery(codigosql);                    //de tipo ResultSet creo variable resultado y le asigno la consulta mediante la variable leer
            
            while (resultado.next()){
                datosapersib[0] = resultado.getString(1);
                datosapersib[1] = resultado.getString(2);
                datosapersib[2] = resultado.getString(3);
                datosapersib[3] = resultado.getString(4);
                datosapersib[4] = resultado.getString(5);
                               
                tdatosapersib.addRow(datosapersib);
            }
            TablaDatApersibBomberos.setModel(tdatosapersib);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "ERROR EN CONSULTA DE DATOS");
            
        }
    }
    public void actualizardatosapersib(){
        int filaapersib = TablaDatApersibBomberos.getSelectedRow();                              //guarda en variable fila el numero de fila seleccionada de la tabla
                        
        //JOptionPane.showMessageDialog(this, fila);
        
        int idApersibimientoPersonal = Integer.parseInt(this.TablaDatApersibBomberos.getValueAt(filaapersib, 0).toString());
        String NumeroLegajoAperPerBom = TablaDatApersibBomberos.getValueAt(filaapersib, 1).toString();
        String ApellidoBom = TablaDatApersibBomberos.getValueAt(filaapersib, 2).toString();
        String InformeElevadoApersib = TablaDatApersibBomberos.getValueAt(filaapersib, 3).toString();
        String ResolucionApersib = TablaDatApersibBomberos.getValueAt(filaapersib, 4).toString();
        
        
                
        try {
            PreparedStatement actualizar = conect.prepareStatement("UPDATE apersibimientospersonal SET NumeroLegajoAperPerBom ='"+NumeroLegajoAperPerBom+"',ApellidoBom ='"+ApellidoBom+"',InformeElevadoApersib='"+InformeElevadoApersib+"',ResolucionApersib='"+ResolucionApersib+"' WHERE idApersibimientoPersonal='"+idApersibimientoPersonal+"'");
            actualizar.executeUpdate();
            mostrarDatosApersib(0, null);                                       // actualiza en formulario modificacion en la tabla
            JOptionPane.showMessageDialog(this, "DATOS APERSIBIMIENTOS ACTUALIZADOS CON EXITO");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " NO SE LOGRO ACTUALIZAR LA BASE DE DATOS");
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatApersibBomberos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmbOpcion = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnActualizarDatosPersonales = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Administrar Datos Apersibimientos");
        setPreferredSize(new java.awt.Dimension(1320, 673));

        TablaDatApersibBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatApersibBomberos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Personal por"));

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "NUMERO LEGAJO", "APELLIDO" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar_32.png"))); // NOI18N
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
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel3.setText("PRESIONE ACTUALIZAR PARA TERMINAR EL PROCESO DE MODIFICACION");

        jLabel2.setText("DAR ENTER LUEGO DE MODIFICAR EL DATO SELECCIONADO");

        jLabel1.setText("SELECCIONE CON DOBLE CLICK EL DATO A MODIFICAR");

        btnActualizarDatosPersonales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Valid.png"))); // NOI18N
        btnActualizarDatosPersonales.setText("Actualizar");
        btnActualizarDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosPersonalesActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/principal.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(681, 681, 681))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarDatosPersonales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnActualizarDatosPersonales))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int Opcion = cmbOpcion.getSelectedIndex();
        String ValorBus = txtBuscar.getText();

        mostrarDatosApersib(Opcion,ValorBus);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosPersonalesActionPerformed
        actualizardatosapersib();
    }//GEN-LAST:event_btnActualizarDatosPersonalesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatApersibBomberos;
    private javax.swing.JButton btnActualizarDatosPersonales;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
