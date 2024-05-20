package GestionPersonal2;

import java.sql.*;
import javax.swing.JOptionPane;

public class AltaPersonalAyudantia extends javax.swing.JInternalFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    
    public AltaPersonalAyudantia() {
        initComponents();
            txtNumeroLegajoBom.setText("999999");
            txtNombreBom.setText("xxxx");
            txtApellidoBom.setText("xxxx");
            cmbTipoDocBom.getSelectedItem().toString();
            txtNumDocBom.setText("99999999");
            txtDomCalleBom.setText("xxxx");
            txtDomNumBom.setText("9999");
            txtLocalidadBom.setText("xxxx");
            txtBarrioBom.setText("xxxx");
            txtCodigoPostBom.setText("9999");
            txtTelefonoBom.setText("99999999");
            txtEdadBom.setText("99");
            txtFecNacBom.setText("9999/99/99");
            //cmbSexoBom.getSelectedItem().toString();
            txtEmailBom.setText("xxxxx@xxxxx.xxx.xx");
            
           
            
          
           
           
                       
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtEdadBom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNumeroLegajoBom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreBom = new javax.swing.JTextField();
        txtApellidoBom = new javax.swing.JTextField();
        txtNumDocBom = new javax.swing.JTextField();
        txtDomCalleBom = new javax.swing.JTextField();
        txtDomNumBom = new javax.swing.JTextField();
        txtBarrioBom = new javax.swing.JTextField();
        txtTelefonoBom = new javax.swing.JTextField();
        cmbSexoBom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecNacBom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardarDatosPersonal = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmailBom = new javax.swing.JTextField();
        cmbTipoDocBom = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtLocalidadBom = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoPostBom = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbEstCivilBom = new javax.swing.JComboBox<>();
        txtIdBombero = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alta Personal / Ayudantia");
        setToolTipText("");

        jLabel7.setText("Barrio");

        jLabel8.setText("Telefono");

        jLabel14.setText("Numero de legajo");

        txtNumeroLegajoBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroLegajoBomActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Documento");

        jLabel10.setText("Numero Documento");

        txtApellidoBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoBomActionPerformed(evt);
            }
        });

        cmbSexoBom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MASCULINO", "FEMENINO" }));

        jLabel3.setText("Apellido");

        jLabel11.setText("Sexo");

        jLabel4.setText("Nombre");

        jLabel12.setText("Fecha Nacimiento");

        jLabel5.setText("Calle");

        txtFecNacBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecNacBomActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero");

        jLabel13.setText("Edad");

        btnGuardarDatosPersonal.setText("Guardar");
        btnGuardarDatosPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosPersonalActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel15.setText("AAAA-MM-DD");

        jLabel16.setText("Correo Electronico");

        cmbTipoDocBom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DNI", "CI", "LC", "LE" }));

        jLabel17.setText("Localidad");

        txtLocalidadBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadBomActionPerformed(evt);
            }
        });

        jLabel18.setText("Codigo Postal");

        jLabel22.setText("E Civil");

        cmbEstCivilBom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CASADO", "SOLTERO", "DIVORCIADO", "SEPARADO", "CONCUBINATO" }));

        txtIdBombero.setEditable(false);
        txtIdBombero.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroLegajoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreBom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumDocBom, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDomCalleBom, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDomNumBom, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEstCivilBom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecNacBom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdadBom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSexoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoDocBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailBom, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocalidadBom, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBarrioBom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoPostBom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnGuardarDatosPersonal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumeroLegajoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdBombero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumDocBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDomCalleBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDomNumBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(cmbEstCivilBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtFecNacBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel13)
                        .addComponent(txtEdadBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbSexoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoDocBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtEmailBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtLocalidadBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBarrioBom, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18)
                    .addComponent(txtCodigoPostBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTelefonoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarDatosPersonal)
                            .addComponent(btnNuevo)
                            .addComponent(btnCancelar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoBomActionPerformed

    }//GEN-LAST:event_txtApellidoBomActionPerformed

    private void btnGuardarDatosPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosPersonalActionPerformed
        try {
            PreparedStatement GuardarDatPers = conect.prepareStatement("INSERT INTO datospersonalesbomberos (NumeroLegajoPerBom, NombreBom, ApellidoBom, TipoDocBom, NumDocBom, DomCalleBom, DomNumBom, LocalidaBom, BarrioBom, CodigoPostBomb, TelefonoBom, EstadoCivilBom, FecNacBom, EdadBom, EmailBom, SexoBom) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
// Datos Personales Personal
            GuardarDatPers.setString(1, txtNumeroLegajoBom.getText());
            GuardarDatPers.setString(2, txtNombreBom.getText());
            GuardarDatPers.setString(3, txtApellidoBom.getText());
            GuardarDatPers.setString(4, cmbTipoDocBom.getSelectedItem().toString());
            GuardarDatPers.setString(5, txtNumDocBom.getText());
            GuardarDatPers.setString(6, txtDomCalleBom.getText());
            GuardarDatPers.setString(7, txtDomNumBom.getText());
            GuardarDatPers.setString(8, txtLocalidadBom.getText());
            GuardarDatPers.setString(9, txtBarrioBom.getText());
            GuardarDatPers.setString(10, txtCodigoPostBom.getText());
            GuardarDatPers.setString(11, txtTelefonoBom.getText());
            GuardarDatPers.setString(12, cmbEstCivilBom.getSelectedItem().toString());
            GuardarDatPers.setString(13, txtFecNacBom.getText());
            GuardarDatPers.setString(14, txtEdadBom.getText());
            GuardarDatPers.setString(15, txtEmailBom.getText());
            GuardarDatPers.setString(16, cmbSexoBom.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null , "DATOS PERSONALES GUARDADOS EXITOSAMENTE");
            
            PreparedStatement GuardarDatInst = conect.prepareStatement("INSERT INTO datosinstitucionalesbomberos (NumeroLegajoInstBom, ApellidoBom, PrestaServ, Antig, Jerarquia, SitRevistaBom, FechaIngEscuela, FechaAscCuerAct, FechaIngSistBom, Seccion, Conductor, TipoLicenciaConductor, CategoriasHabilitadas, FechaVencLic, AntOtroCuart, AntSistBomb, FechaPaseReserva, VtoDJ2040Bom, Subsidio13802, IomaLab) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
// Datos INSTITUCIONALES Personal           
            GuardarDatInst.setString(1, txtNumeroLegajoBom.getText());
            GuardarDatInst.setString(2, txtApellidoBom.getText());
            /*GuardarDatInst.setString(3, cmbPrestaServ.getSelectedItem().toString());
            GuardarDatInst.setString(4, txtAntig.getText());
            GuardarDatInst.setString(5, cmbJerarquia.getSelectedItem().toString());
            GuardarDatInst.setString(6, cmbSitRevistaBom.getSelectedItem().toString());
            GuardarDatInst.setString(7, txtFechaIngEscuela.getText());
            GuardarDatInst.setString(8, txtFechaAscCuerAct.getText());
            GuardarDatInst.setString(9, txtFechaIngSistBom.getText());
            GuardarDatInst.setString(10, cmbSeccion.getSelectedItem().toString());
            GuardarDatInst.setString(11, cmbConductor.getSelectedItem().toString());
            GuardarDatInst.setString(12, cmbTipoLicenciaConductor.toString());
            GuardarDatInst.setString(13, txtCategoriasHabilitadas.getText());
            GuardarDatInst.setString(14, txtFechaVencLic.getText());
            GuardarDatInst.setString(15, txtAntOtroCuart.getText());
            GuardarDatInst.setString(16, txtAntSistBomb.getText());
            GuardarDatInst.setString(17, txtFechaPaseReserva.getText());
            GuardarDatInst.setString(18, txtVtoDJ2040Bom.getText());
            GuardarDatInst.setString(19, txtSubsidio13802.getText());
            GuardarDatInst.setString(20, cmbIomaLab.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null , "DATOS INSTITUCIONALES GUARDADOS EXITOSAMENTE");*/
            
            PreparedStatement GuardarDatLab = conect.prepareStatement("INSERT INTO datoslaboralesbomberos (NumeroLegajoLabBom, ApellidoBom, EmpleadorBom, ContactoLaboral, DomicilioLabBom, TipoHorarioLab, HoraInicioJornada, TelLaboralBom) VALUES (?,?,?,?,?,?,?,?)");
// Datos LABORALES Personal            
            GuardarDatLab.setString(1, txtNumeroLegajoBom.getText());
            GuardarDatLab.setString(2, txtApellidoBom.getText());
           /* GuardarDatLab.setString(3, txtEmpleadorBom.getText());
            GuardarDatLab.setString(4, txtContactoLaboral.getText());
            GuardarDatLab.setString(5, txtDomicilioLabBom.getText());
            GuardarDatLab.setString(6, cmbTipoHorarioLab.getSelectedItem().toString());
            GuardarDatLab.setString(7, txtHoraInicioJornada.getText());
            GuardarDatLab.setString(8, txtTelLaboralBom.getText());
            JOptionPane.showMessageDialog(null , "DATOS LABORALES GUARDADOS EXITOSAMENTE");*/
            
            PreparedStatement GuardarDatFam = conect.prepareStatement("INSERT INTO datosfamiliaresbomberos (NumeroLegajoFamBom, ApellidoBom, NomMadre, NomPadre, NomCony, DomMadre, DomPadre, DomCony, TelMadre, TelPadre, TelCony, CantHij, NomHij) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
// Datos FAMILIARES Personal           
           /* GuardarDatFam.setString(1, txtNumeroLegajoBom.getText());
            GuardarDatFam.setString(2, txtApellidoBom.getText());
            GuardarDatFam.setString(3, txtNomMadre.getText());
            GuardarDatFam.setString(4, txtNomPadre.getText());
            GuardarDatFam.setString(5, txtNomCony.getText());
            GuardarDatFam.setString(6, txtDomMadre.getText());
            GuardarDatFam.setString(7, txtDomPadre.getText());
            GuardarDatFam.setString(8, txtDomCony.getText());
            GuardarDatFam.setString(9, txtTelMadre.getText());
            GuardarDatFam.setString(10, txtTelPadre.getText());
            GuardarDatFam.setString(11, txtTelCony.getText());
            GuardarDatFam.setString(12, txtCantHij.getText());
            GuardarDatFam.setString(13, txtNomHij.getText());
            JOptionPane.showMessageDialog(null , "DATOS FAMILIARES GUARDADOS EXITOSAMENTE");*/
            
            PreparedStatement GuardarDatMed = conect.prepareStatement("INSERT INTO datosmedicosbomberos (NumeroLegajoMedBom, ApellidoBom, MedicoCabecera, TelMedicoCabecera, ObraSocPartBomb, FechaUltControl, FechaUltAnalClinico, GrupoSangBom, Donante, PresionArtBom, Alergias, Medicamentos, FechaUltDosGripe, FechaUltDosNeumo, FechaUltDosAntTet, FechaPrimCovid, FechaSegCovid, HistoriaMedica) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            // Datos MEDICOS Personal                       
            /*GuardarDatMed.setString(1, txtNumeroLegajoBom.getText());
            GuardarDatMed.setString(2, txtApellidoBom.getText());
            GuardarDatMed.setString(3, txtMedicoCabecera.getText());
            GuardarDatMed.setString(4, txtTelMedicoCabecera.getText());
            GuardarDatMed.setString(5, txtObraSocPartBomb.getText());
            GuardarDatMed.setString(6, txtFechaUltControl.getText());
            GuardarDatMed.setString(7, FechaUltAnalClinico.getText());
            GuardarDatMed.setString(8, txtGrupoSangBom.getText());
            GuardarDatMed.setString(9, cmbDonante.getSelectedItem().toString());
            GuardarDatMed.setString(10, txtPresionArtBom.getText());
            GuardarDatMed.setString(11, txtAlergias.getText());
            GuardarDatMed.setString(12, txtMedicamentos.toString());
            GuardarDatMed.setString(13, txtFechaUltDosGripe.getText());
            GuardarDatMed.setString(14, txtFechaUltDosNeumo.getText());
            GuardarDatMed.setString(15, txtFechaUltDosAntTet.getText());
            GuardarDatMed.setString(16, txtFechaPrimCovid.getText());
            GuardarDatMed.setString(17, txtFechaSegCovid.getText());
            GuardarDatMed.setString(18, txtHistoriaMedica.getText());
            JOptionPane.showMessageDialog(null , "DATOS MEDICOS GUARDADOS EXITOSAMENTE");*/
           
            GuardarDatPers.executeUpdate();
            //GuardarDatInst.executeUpdate();
            //GuardarDatFam.executeUpdate();
            //GuardarDatLab.executeUpdate();
            //GuardarDatMed.executeUpdate();

            JOptionPane.showMessageDialog(null , "DATOS DE BOMBERO REGISTRADO EXITOSAMENTE");
            
            txtNumeroLegajoBom.setText("999999");
            txtNombreBom.setText("xxxx");
            txtApellidoBom.setText("xxxx");
            cmbTipoDocBom.getSelectedItem().toString();
            txtNumDocBom.setText("99999999");
            txtDomCalleBom.setText("xxxx");
            txtDomNumBom.setText("9999");
            txtLocalidadBom.setText("xxxx");
            txtBarrioBom.setText("xxxx");
            txtCodigoPostBom.setText("9999");
            txtTelefonoBom.setText("99999999");
            txtEdadBom.setText("99");
            txtFecNacBom.setText("9999/99/99");
            //cmbSexoBom.getSelectedItem().toString();
            txtEmailBom.setText("xxxxx@xxxxx.xxx.xx");
            
            //RESETEA TODOS LOS TEXT BOX Y COMBOS
            /*cmbPrestaServ.getSelectedItem().toString();
            txtAntig.setText("99");
            cmbJerarquia.getSelectedItem().toString();
            cmbSitRevistaBom.getSelectedItem().toString();
            txtFechaIngEscuela.setText("9999/99/99");
            txtFechaAscCuerAct.setText("9999/99/99");
            txtFechaIngSistBom.setText("9999/99/99");
            cmbSeccion.getSelectedItem().toString();
            cmbConductor.getSelectedItem().toString();
            cmbTipoLicenciaConductor.getSelectedItem().toString();
            txtCategoriasHabilitadas.setText("xxxx");
            txtFechaVencLic.setText("9999/99/99");
            txtAntOtroCuart.setText("99");
            txtAntSistBomb.setText("99");
            txtFechaPaseReserva.setText("9999/99/99");
            txtVtoDJ2040Bom.setText("9999/99/99");
            txtSubsidio13802.setText("9999/99/99");
            cmbIomaLab.getSelectedItem().toString();*/
            
            /*txtEmpleadorBom.setText("xxxx");
            txtContactoLaboral.setText("xxxx");
            txtDomicilioLabBom.setText("xxxx");
            cmbTipoHorarioLab.getSelectedItem().toString();
            txtHoraInicioJornada.setText("xxxx");
            txtTelLaboralBom.setText("99999999");*/
           
            /*txtNomMadre.setText("xxxx");
            txtNomPadre.setText("xxxx");
            txtNomCony.setText("xxxx");
            txtDomMadre.setText("xxxx");
            txtDomPadre.setText("xxxx");
            txtDomCony.setText("xxxx");
            txtTelMadre.setText("xxxx");
            txtTelPadre.setText("xxxx");
            txtTelCony.setText("xxxx");
            txtCantHij.setText("xxxx");
            txtNomHij.setText("xxxx");*/
                       
            /*txtMedicoCabecera.setText("xxxx");
            txtTelMedicoCabecera.setText("xxxx");
            txtObraSocPartBomb.setText("xxxx");
            txtFechaUltControl.setText("9999/99/99");
            FechaUltAnalClinico.setText("9999/99/99");
            txtGrupoSangBom.setText("xxxxx");
            cmbDonante.getSelectedItem().toString();
            txtPresionArtBom.setText("xxxx");
            txtAlergias.setText("xxxx");
            txtMedicamentos.setText("xxxx");
            txtFechaUltDosGripe.setText("9999/99/99");
            txtFechaUltDosNeumo.setText("9999/99/99");
            txtFechaUltDosAntTet.setText("9999/99/99");
            txtFechaPrimCovid.setText("9999/99/99");
            txtFechaSegCovid.setText("9999/99/99");
            txtHistoriaMedica.setText("9999/99/99"); */
            
            txtNumeroLegajoBom.requestFocus();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , e + "DATOS DEL PERSONAL NO REGISTRADOS");
        }
            
    }//GEN-LAST:event_btnGuardarDatosPersonalActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
           
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFecNacBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecNacBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecNacBomActionPerformed

    private void txtNumeroLegajoBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroLegajoBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLegajoBomActionPerformed

    private void txtLocalidadBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidadBomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarDatosPersonal;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbEstCivilBom;
    private javax.swing.JComboBox<String> cmbSexoBom;
    private javax.swing.JComboBox<String> cmbTipoDocBom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidoBom;
    private javax.swing.JTextField txtBarrioBom;
    private javax.swing.JTextField txtCodigoPostBom;
    private javax.swing.JTextField txtDomCalleBom;
    private javax.swing.JTextField txtDomNumBom;
    private javax.swing.JTextField txtEdadBom;
    private javax.swing.JTextField txtEmailBom;
    private javax.swing.JTextField txtFecNacBom;
    private javax.swing.JTextField txtIdBombero;
    private javax.swing.JTextField txtLocalidadBom;
    private javax.swing.JTextField txtNombreBom;
    private javax.swing.JTextField txtNumDocBom;
    private javax.swing.JTextField txtNumeroLegajoBom;
    private javax.swing.JTextField txtTelefonoBom;
    // End of variables declaration//GEN-END:variables
}
