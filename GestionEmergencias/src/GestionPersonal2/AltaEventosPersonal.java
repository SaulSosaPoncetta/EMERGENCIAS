package GestionPersonal2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AltaEventosPersonal extends javax.swing.JInternalFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();

    public AltaEventosPersonal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroLegajoBom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaEvento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionEvento = new javax.swing.JTextArea();
        btnGuardarEventoPersonal = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Alta de Evento del Personal");
        setToolTipText("Este formulario incorpora datos al historial del personal");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de Legajo");

        jLabel2.setText("Fecha");

        txtFechaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEventoActionPerformed(evt);
            }
        });

        jLabel3.setText("Novedad");

        txtDescripcionEvento.setColumns(20);
        txtDescripcionEvento.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionEvento);

        btnGuardarEventoPersonal.setText("Guardar");
        btnGuardarEventoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEventoPersonalActionPerformed(evt);
            }
        });

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarEventoPersonal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(2, 2, 2)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroLegajoBom, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 207, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroLegajoBom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGuardarEventoPersonal)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFechaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEventoActionPerformed

    private void btnGuardarEventoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEventoPersonalActionPerformed
        try {
            PreparedStatement GuardarDatEvento = conect.prepareStatement("INSERT INTO bitacoranovedadestareaspersonal (NumeroLegajoOperador, FechaTarea, DescripcionTareaRealizada) VALUES (?,?,?)");
            // Datos Personales Personal
            GuardarDatEvento.setString(1, txtNumeroLegajoBom.getText());
            GuardarDatEvento.setString(2, txtFechaEvento.getText());
            GuardarDatEvento.setString(3, txtDescripcionEvento.getText());

            JOptionPane.showMessageDialog(null, "DATOS HISTORICOS GUARDADOS EXITOSAMENTE");

            GuardarDatEvento.executeUpdate();
            
            txtNumeroLegajoBom.setText("");
            txtFechaEvento.setText("");
            txtDescripcionEvento.setText("");
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null , e + "DATOS DEL HISTORIAL NO REGISTRADOS");
        }
            
    }//GEN-LAST:event_btnGuardarEventoPersonalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            txtNumeroLegajoBom.setText("");
            txtFechaEvento.setText("");
            txtDescripcionEvento.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarEventoPersonal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcionEvento;
    private javax.swing.JTextField txtFechaEvento;
    private javax.swing.JTextField txtNumeroLegajoBom;
    // End of variables declaration//GEN-END:variables
}
