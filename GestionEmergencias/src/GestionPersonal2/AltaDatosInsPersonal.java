
package GestionPersonal2;


public class AltaDatosInsPersonal extends javax.swing.JInternalFrame {

    
    public AltaDatosInsPersonal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbJerarquia = new javax.swing.JComboBox<>();
        txtFechaPaseReserva = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFechaIngEscuela = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtVtoDJ2040Bom = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtFechaIngSistBom = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cmbSeccion = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cmbConductor = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtFechaAscCuerAct = new javax.swing.JTextField();
        cmbTipoLicenciaConductor = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        txtCategoriasHabilitadas = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cmbPrestaServ = new javax.swing.JComboBox<>();
        txtAntOtroCuart = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtAntig = new javax.swing.JTextField();
        txtAntSistBomb = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cmbSitRevistaBom = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txtFechaVencLic = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSubsidio13802 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cmbIomaLab = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtNumeroLegajoBom = new javax.swing.JTextField();
        txtApellidoBom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Alta de Datos Institucionales");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");

        cmbJerarquia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "COMANDANTE GENERAL", "COMANDANTE MAYOR", "COMANDANTE", "SUBCOMANDANTE", "OFICIAL DE DOTACION", "OFICIAL DE ESCUADRA", "OFICIAL AUXILIAR", "SUB OFICIAL MAYOR", "SUB OFICIAL AYTE PRIMERA", "SUB OFICIAL AYTE PRINCIPAL", "SUB OFICIAL AYUDANTE", "SUB OFICIAL SUB AYDANTE", "BOMBERO" }));

        txtFechaPaseReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaPaseReservaActionPerformed(evt);
            }
        });

        jLabel23.setText("Fecha Ingreso BBVVO (Comienzo Escuela)");

        jLabel24.setText("Vto DJ 2040");

        jLabel25.setText("Situacion Revista");

        jLabel27.setText("Fecha ingreso Sist Bomberos");

        jLabel29.setText("Seccion");

        cmbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "AYUDANTIA", "EDIFICIOS", "MAQUINAS", "MATERIALES", "OF TECNICA", "SIN ASIGNAR" }));
        cmbSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeccionActionPerformed(evt);
            }
        });

        jLabel30.setText("Conductor");

        cmbConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "REALIZANDO CURSO", "NO EVALUADO", "EVALUADO", "APROBADO", "CON AUTORIZACION", "SOLO UNID LIVIANA", "SERV NO URGENTES", "SI EMERGENCIA", "NO" }));

        jLabel31.setText("Fecha Ascenso Cuerpo Activo");

        jLabel32.setText("Tipo Licencia");

        cmbTipoLicenciaConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "COMUN", "PROFESIONAL" }));
        cmbTipoLicenciaConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoLicenciaConductorActionPerformed(evt);
            }
        });

        jLabel33.setText("Categoria Habilitada");

        txtCategoriasHabilitadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriasHabilitadasActionPerformed(evt);
            }
        });

        jLabel35.setText("Presta Servicio en:");

        jLabel36.setText("Antiguedad otro Cuartel");

        cmbPrestaServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CUARTEL CENTRAL", "DESTACAMENTO 1", "DESTACAMENTO 2", "DESTACAMENTO 3" }));
        cmbPrestaServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrestaServActionPerformed(evt);
            }
        });

        jLabel37.setText("Antiguedad");

        jLabel38.setText("Antiguedad Sistema Bomberos");

        jLabel39.setText("Jerarquia");

        jLabel40.setText("Fecha pase a Reserva");

        cmbSitRevistaBom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "RESERVA", "ACTIVO", "CADETE", "ASPIRANTE", "LICENCIA", " " }));
        cmbSitRevistaBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSitRevistaBomActionPerformed(evt);
            }
        });

        jLabel34.setText("Fecha Vencimiento Licencia");

        jLabel26.setText("Subsidio 13802");

        jLabel28.setText("IOMA Laboral");

        cmbIomaLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SI", "NO" }));

        jLabel14.setText("Numero de legajo");

        txtNumeroLegajoBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroLegajoBomActionPerformed(evt);
            }
        });

        txtApellidoBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoBomActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroLegajoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoriasHabilitadas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaVencLic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSitRevistaBom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaIngSistBom, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtVtoDJ2040Bom, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSubsidio13802, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbIomaLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPrestaServ, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAntig, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaIngEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaAscCuerAct, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoLicenciaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAntOtroCuart, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAntSistBomb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaPaseReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumeroLegajoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(cmbPrestaServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txtAntig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(cmbJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtFechaIngEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtFechaAscCuerAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(cmbTipoLicenciaConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtAntOtroCuart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(txtAntSistBomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtFechaPaseReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(cmbSitRevistaBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(txtCategoriasHabilitadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(txtFechaVencLic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtVtoDJ2040Bom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtSubsidio13802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(cmbIomaLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(txtFechaIngSistBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFechaPaseReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaPaseReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaPaseReservaActionPerformed

    private void cmbSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSeccionActionPerformed

    private void cmbTipoLicenciaConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoLicenciaConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoLicenciaConductorActionPerformed

    private void txtCategoriasHabilitadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriasHabilitadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriasHabilitadasActionPerformed

    private void cmbPrestaServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrestaServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPrestaServActionPerformed

    private void cmbSitRevistaBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSitRevistaBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSitRevistaBomActionPerformed

    private void txtNumeroLegajoBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroLegajoBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLegajoBomActionPerformed

    private void txtApellidoBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoBomActionPerformed

    }//GEN-LAST:event_txtApellidoBomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbConductor;
    private javax.swing.JComboBox<String> cmbIomaLab;
    private javax.swing.JComboBox<String> cmbJerarquia;
    private javax.swing.JComboBox<String> cmbPrestaServ;
    private javax.swing.JComboBox<String> cmbSeccion;
    private javax.swing.JComboBox<String> cmbSitRevistaBom;
    private javax.swing.JComboBox<String> cmbTipoLicenciaConductor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JTextField txtAntOtroCuart;
    private javax.swing.JTextField txtAntSistBomb;
    private javax.swing.JTextField txtAntig;
    private javax.swing.JTextField txtApellidoBom;
    private javax.swing.JTextField txtCategoriasHabilitadas;
    private javax.swing.JTextField txtFechaAscCuerAct;
    private javax.swing.JTextField txtFechaIngEscuela;
    private javax.swing.JTextField txtFechaIngSistBom;
    private javax.swing.JTextField txtFechaPaseReserva;
    private javax.swing.JTextField txtFechaVencLic;
    private javax.swing.JTextField txtNumeroLegajoBom;
    private javax.swing.JTextField txtSubsidio13802;
    private javax.swing.JTextField txtVtoDJ2040Bom;
    // End of variables declaration//GEN-END:variables
}
