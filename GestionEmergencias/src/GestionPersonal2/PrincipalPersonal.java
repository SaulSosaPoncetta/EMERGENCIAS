package GestionPersonal2;



import GestionPersonal.ExportarDatos;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrincipalPersonal extends javax.swing.JFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    
    public PrincipalPersonal() {
        initComponents();
        probar_conexion();
        
    }
    
    public void probar_conexion(){
        if(conect == null){
            JOptionPane.showMessageDialog(null,"CONEXION A BASE DE DATOS gestionbomberos NO LOGRADA");
        } else{
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA gestionbomberos LINK OK");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        jsbmMateriales = new javax.swing.JMenuItem();
        jsbmMaquinas = new javax.swing.JMenuItem();
        jsbmSuministros = new javax.swing.JMenuItem();
        jsbmAyudantia = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jsbmServicios = new javax.swing.JMenuItem();
        jsbmGuardias = new javax.swing.JMenuItem();
        jsbmOrdenDia = new javax.swing.JMenuItem();
        jsbmSemana = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jArchivoSalir = new javax.swing.JMenuItem();
        mnuVer = new javax.swing.JMenu();
        jsbmVerMateriales = new javax.swing.JMenuItem();
        jsbmVerMaquinas = new javax.swing.JMenuItem();
        jsbmVerSuministros = new javax.swing.JMenuItem();
        jsbmVerAyudantia = new javax.swing.JMenuItem();
        jsbmVerServicios = new javax.swing.JMenuItem();
        jsbmVerGuardias = new javax.swing.JMenuItem();
        jsbmVerOrdenDelDia = new javax.swing.JMenuItem();
        mnuGuardia = new javax.swing.JMenu();
        sbmnuEmergencias = new javax.swing.JMenu();
        sbmnuServicios = new javax.swing.JMenu();
        sbmnuNovedades = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        sbmnuPartesDeServicio = new javax.swing.JMenu();
        mnuPersonal = new javax.swing.JMenu();
        mnuEventosPersonal = new javax.swing.JMenu();
        mnuAltaNovedadPersonal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        smnuPersonal = new javax.swing.JMenu();
        jAltaPersonal = new javax.swing.JMenuItem();
        jMuestraPersonal = new javax.swing.JMenuItem();
        jModificaPersonal = new javax.swing.JMenuItem();
        jBajaPersonal = new javax.swing.JMenuItem();
        smnuLegajos = new javax.swing.JMenu();
        mnuAltaLegajoPersonal = new javax.swing.JMenuItem();
        mnuMuestraLegajoPersonal = new javax.swing.JMenuItem();
        mnuModificaLegajoPersonal = new javax.swing.JMenuItem();
        mnuBorrarLegajoPersonal = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jAltaPersonal1 = new javax.swing.JMenuItem();
        jMuestraPersonal1 = new javax.swing.JMenuItem();
        jModificaPersonal1 = new javax.swing.JMenuItem();
        jBajaPersonal1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jAltaPersonal2 = new javax.swing.JMenuItem();
        jMuestraPersonal2 = new javax.swing.JMenuItem();
        jModificaPersonal2 = new javax.swing.JMenuItem();
        jBajaPersonal2 = new javax.swing.JMenuItem();
        smnuLibretaSanitaria = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jAltaPersonal4 = new javax.swing.JMenuItem();
        jMuestraPersonal4 = new javax.swing.JMenuItem();
        jModificaPersonal4 = new javax.swing.JMenuItem();
        jBajaPersonal4 = new javax.swing.JMenuItem();
        smnuObraSocial = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jAltaPersonal3 = new javax.swing.JMenuItem();
        jMuestraPersonal3 = new javax.swing.JMenuItem();
        jModificaPersonal3 = new javax.swing.JMenuItem();
        jBajaPersonal3 = new javax.swing.JMenuItem();
        smnuSeguros = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        smnuLisencias = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        smnuMedidasDisciplinarias = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        smnuMasTareas = new javax.swing.JMenu();
        mnuExportarDatos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuMaquinas = new javax.swing.JMenu();
        mnuNuevaMaquina = new javax.swing.JMenuItem();
        mnuBajaMaquina = new javax.swing.JMenuItem();
        mnuModificaMaquina = new javax.swing.JMenuItem();
        mnuLibroMaquinas = new javax.swing.JMenuItem();
        mnuMateriales = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        mnuAltaMaterial = new javax.swing.JMenuItem();
        mnuBajaMaterial = new javax.swing.JMenuItem();
        mnuModificarMaterial = new javax.swing.JMenuItem();
        mnuConsultarMaterial = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem29 = new javax.swing.JMenuItem();
        mnuSuministros = new javax.swing.JMenu();
        jProvAltaProveedor = new javax.swing.JMenuItem();
        jProvBajaProveedor = new javax.swing.JMenuItem();
        jProvModProveedor = new javax.swing.JMenuItem();
        jProvMostrarProveedor = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuGerencia = new javax.swing.JMenu();
        mnuConfiguracion = new javax.swing.JMenu();
        sbmnuDatosCuartel = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        sbmnuReporteHoras = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        jPruebaConect = new javax.swing.JMenuItem();
        jAcercaDe = new javax.swing.JMenuItem();
        jAyudas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Datos del Personal");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        jsbmMateriales.setText("Materiales");
        jsbmMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmMaterialesActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmMateriales);

        jsbmMaquinas.setText("Maquinas");
        jsbmMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmMaquinasActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmMaquinas);

        jsbmSuministros.setText("Suministros");
        jsbmSuministros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmSuministrosActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmSuministros);

        jsbmAyudantia.setText("Ayudantia");
        jsbmAyudantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmAyudantiaActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmAyudantia);
        mnuArchivo.add(jSeparator1);

        jsbmServicios.setText("Servicios");
        jsbmServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmServiciosActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmServicios);

        jsbmGuardias.setText("Guardias");
        jsbmGuardias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmGuardiasActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmGuardias);

        jsbmOrdenDia.setText("Orden del Dia");
        jsbmOrdenDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmOrdenDiaActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmOrdenDia);

        jsbmSemana.setText("Semana");
        jsbmSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmSemanaActionPerformed(evt);
            }
        });
        mnuArchivo.add(jsbmSemana);
        mnuArchivo.add(jSeparator3);

        jArchivoSalir.setText("Salir");
        jArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArchivoSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(jArchivoSalir);

        jMenuBar1.add(mnuArchivo);

        mnuVer.setText("Ver");
        mnuVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerActionPerformed(evt);
            }
        });

        jsbmVerMateriales.setText("Materiales");
        jsbmVerMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerMaterialesActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerMateriales);

        jsbmVerMaquinas.setText("Maquinas");
        jsbmVerMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerMaquinasActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerMaquinas);

        jsbmVerSuministros.setText("Suministros");
        jsbmVerSuministros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerSuministrosActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerSuministros);

        jsbmVerAyudantia.setText("Personal");
        jsbmVerAyudantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerAyudantiaActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerAyudantia);

        jsbmVerServicios.setText("Servicios");
        jsbmVerServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerServiciosActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerServicios);

        jsbmVerGuardias.setText("Guardias");
        jsbmVerGuardias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerGuardiasActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerGuardias);

        jsbmVerOrdenDelDia.setText("Orden del Dia");
        jsbmVerOrdenDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsbmVerOrdenDelDiaActionPerformed(evt);
            }
        });
        mnuVer.add(jsbmVerOrdenDelDia);

        jMenuBar1.add(mnuVer);

        mnuGuardia.setText("Guardia");

        sbmnuEmergencias.setText("Emergencias");
        mnuGuardia.add(sbmnuEmergencias);

        sbmnuServicios.setText("Servicios");
        mnuGuardia.add(sbmnuServicios);

        sbmnuNovedades.setText("Novedades");

        jMenuItem24.setText("Registro Novedad");
        sbmnuNovedades.add(jMenuItem24);

        jMenuItem31.setText("Modificar Novedad");
        sbmnuNovedades.add(jMenuItem31);

        jMenuItem32.setText("Ver Novedades");
        sbmnuNovedades.add(jMenuItem32);

        mnuGuardia.add(sbmnuNovedades);

        sbmnuPartesDeServicio.setText("Partes de Servicio");
        mnuGuardia.add(sbmnuPartesDeServicio);

        jMenuBar1.add(mnuGuardia);

        mnuPersonal.setText("Personal");
        mnuPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPersonalActionPerformed(evt);
            }
        });

        mnuEventosPersonal.setText("Novedades");

        mnuAltaNovedadPersonal.setText("Alta Novedad Personal");
        mnuAltaNovedadPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaNovedadPersonalActionPerformed(evt);
            }
        });
        mnuEventosPersonal.add(mnuAltaNovedadPersonal);

        jMenuItem1.setText("Ver Historico Personal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuEventosPersonal.add(jMenuItem1);

        mnuPersonal.add(mnuEventosPersonal);

        smnuPersonal.setText("Personales");

        jAltaPersonal.setText("Alta Personal");
        jAltaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAltaPersonalActionPerformed(evt);
            }
        });
        smnuPersonal.add(jAltaPersonal);

        jMuestraPersonal.setText("Muestra Personal");
        jMuestraPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMuestraPersonalActionPerformed(evt);
            }
        });
        smnuPersonal.add(jMuestraPersonal);

        jModificaPersonal.setText("Modifica Personal");
        jModificaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificaPersonalActionPerformed(evt);
            }
        });
        smnuPersonal.add(jModificaPersonal);

        jBajaPersonal.setText("Baja Personal");
        jBajaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBajaPersonalActionPerformed(evt);
            }
        });
        smnuPersonal.add(jBajaPersonal);

        mnuPersonal.add(smnuPersonal);

        smnuLegajos.setText("Institucionales");

        mnuAltaLegajoPersonal.setText("Alta");
        mnuAltaLegajoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaLegajoPersonalActionPerformed(evt);
            }
        });
        smnuLegajos.add(mnuAltaLegajoPersonal);

        mnuMuestraLegajoPersonal.setText("Muestra");
        mnuMuestraLegajoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuestraLegajoPersonalActionPerformed(evt);
            }
        });
        smnuLegajos.add(mnuMuestraLegajoPersonal);

        mnuModificaLegajoPersonal.setText("Modificar");
        mnuModificaLegajoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificaLegajoPersonalActionPerformed(evt);
            }
        });
        smnuLegajos.add(mnuModificaLegajoPersonal);

        mnuBorrarLegajoPersonal.setText("Borrar");
        mnuBorrarLegajoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBorrarLegajoPersonalActionPerformed(evt);
            }
        });
        smnuLegajos.add(mnuBorrarLegajoPersonal);

        mnuPersonal.add(smnuLegajos);

        jMenu3.setText("Laborales");

        jAltaPersonal1.setText("Alta ");
        jAltaPersonal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAltaPersonal1ActionPerformed(evt);
            }
        });
        jMenu3.add(jAltaPersonal1);

        jMuestraPersonal1.setText("Muestra");
        jMuestraPersonal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMuestraPersonal1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMuestraPersonal1);

        jModificaPersonal1.setText("Modifica");
        jModificaPersonal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificaPersonal1ActionPerformed(evt);
            }
        });
        jMenu3.add(jModificaPersonal1);

        jBajaPersonal1.setText("Baja");
        jBajaPersonal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBajaPersonal1ActionPerformed(evt);
            }
        });
        jMenu3.add(jBajaPersonal1);

        mnuPersonal.add(jMenu3);

        jMenu4.setText("Familiares");

        jAltaPersonal2.setText("Alta");
        jAltaPersonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAltaPersonal2ActionPerformed(evt);
            }
        });
        jMenu4.add(jAltaPersonal2);

        jMuestraPersonal2.setText("Muestra");
        jMuestraPersonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMuestraPersonal2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMuestraPersonal2);

        jModificaPersonal2.setText("Modifica");
        jModificaPersonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificaPersonal2ActionPerformed(evt);
            }
        });
        jMenu4.add(jModificaPersonal2);

        jBajaPersonal2.setText("Baja");
        jBajaPersonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBajaPersonal2ActionPerformed(evt);
            }
        });
        jMenu4.add(jBajaPersonal2);

        mnuPersonal.add(jMenu4);

        smnuLibretaSanitaria.setText("Medicos");

        jMenu2.setText("Datos Medicos");

        jAltaPersonal4.setText("Alta");
        jAltaPersonal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAltaPersonal4ActionPerformed(evt);
            }
        });
        jMenu2.add(jAltaPersonal4);

        jMuestraPersonal4.setText("Muestra");
        jMuestraPersonal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMuestraPersonal4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMuestraPersonal4);

        jModificaPersonal4.setText("Modifica");
        jModificaPersonal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificaPersonal4ActionPerformed(evt);
            }
        });
        jMenu2.add(jModificaPersonal4);

        jBajaPersonal4.setText("Baja");
        jBajaPersonal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBajaPersonal4ActionPerformed(evt);
            }
        });
        jMenu2.add(jBajaPersonal4);

        smnuLibretaSanitaria.add(jMenu2);

        smnuObraSocial.setText("Obra Social");

        jMenuItem13.setText("Alta");
        smnuObraSocial.add(jMenuItem13);

        jMenuItem14.setText("Modificar");
        smnuObraSocial.add(jMenuItem14);

        jMenuItem15.setText("Baja");
        smnuObraSocial.add(jMenuItem15);

        jMenuItem16.setText("Mostrar");
        smnuObraSocial.add(jMenuItem16);

        smnuLibretaSanitaria.add(smnuObraSocial);

        jMenu1.setText("Libreta Sanitaria");

        jAltaPersonal3.setText("Alta");
        jAltaPersonal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAltaPersonal3ActionPerformed(evt);
            }
        });
        jMenu1.add(jAltaPersonal3);

        jMuestraPersonal3.setText("Muestra");
        jMuestraPersonal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMuestraPersonal3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMuestraPersonal3);

        jModificaPersonal3.setText("Modifica");
        jModificaPersonal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificaPersonal3ActionPerformed(evt);
            }
        });
        jMenu1.add(jModificaPersonal3);

        jBajaPersonal3.setText("Baja");
        jBajaPersonal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBajaPersonal3ActionPerformed(evt);
            }
        });
        jMenu1.add(jBajaPersonal3);

        smnuLibretaSanitaria.add(jMenu1);

        mnuPersonal.add(smnuLibretaSanitaria);

        smnuSeguros.setText("Seguros");

        jMenuItem17.setText("Alta");
        smnuSeguros.add(jMenuItem17);

        jMenuItem18.setText("Modificar");
        smnuSeguros.add(jMenuItem18);

        jMenuItem19.setText("Eliminar");
        smnuSeguros.add(jMenuItem19);

        jMenuItem20.setText("Mostrar");
        smnuSeguros.add(jMenuItem20);

        mnuPersonal.add(smnuSeguros);

        smnuLisencias.setText("Lisencias");

        jMenuItem9.setText("Alta");
        smnuLisencias.add(jMenuItem9);

        jMenuItem10.setText("Modificar");
        smnuLisencias.add(jMenuItem10);

        jMenuItem11.setText("Baja");
        smnuLisencias.add(jMenuItem11);

        jMenuItem12.setText("Mostrar");
        smnuLisencias.add(jMenuItem12);

        mnuPersonal.add(smnuLisencias);

        smnuMedidasDisciplinarias.setText("Medidas Disciplinarias");

        jMenu10.setText("Apercibimientos");

        jMenuItem21.setText("Aplicar Apercibimiento");
        jMenu10.add(jMenuItem21);

        smnuMedidasDisciplinarias.add(jMenu10);

        jMenu11.setText("Sanciones");

        jMenuItem22.setText("Aplicar Sancion");
        jMenu11.add(jMenuItem22);

        smnuMedidasDisciplinarias.add(jMenu11);

        mnuPersonal.add(smnuMedidasDisciplinarias);

        smnuMasTareas.setText("Mas Tareas");

        mnuExportarDatos.setText("Exportar");
        mnuExportarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExportarDatosActionPerformed(evt);
            }
        });
        smnuMasTareas.add(mnuExportarDatos);

        jMenuItem2.setText("Imprimir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        smnuMasTareas.add(jMenuItem2);

        jMenuItem3.setText("Arma Grupos Semana");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        smnuMasTareas.add(jMenuItem3);

        jMenuItem4.setText("Arma Orden Dia");
        smnuMasTareas.add(jMenuItem4);

        mnuPersonal.add(smnuMasTareas);

        jMenuBar1.add(mnuPersonal);

        mnuMaquinas.setText("Maquinas");

        mnuNuevaMaquina.setText("Nueva Maquina");
        mnuNuevaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuevaMaquinaActionPerformed(evt);
            }
        });
        mnuMaquinas.add(mnuNuevaMaquina);

        mnuBajaMaquina.setText("Baja Maquina");
        mnuBajaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaMaquinaActionPerformed(evt);
            }
        });
        mnuMaquinas.add(mnuBajaMaquina);

        mnuModificaMaquina.setText("Modifica Maquina");
        mnuModificaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificaMaquinaActionPerformed(evt);
            }
        });
        mnuMaquinas.add(mnuModificaMaquina);

        mnuLibroMaquinas.setText("Libro Maquinas");
        mnuLibroMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLibroMaquinasActionPerformed(evt);
            }
        });
        mnuMaquinas.add(mnuLibroMaquinas);

        jMenuBar1.add(mnuMaquinas);

        mnuMateriales.setText("Materiales");

        jMenu15.setText("Material General");

        mnuAltaMaterial.setText("Alta Material");
        mnuAltaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaMaterialActionPerformed(evt);
            }
        });
        jMenu15.add(mnuAltaMaterial);

        mnuBajaMaterial.setText("Baja Material");
        mnuBajaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaMaterialActionPerformed(evt);
            }
        });
        jMenu15.add(mnuBajaMaterial);

        mnuModificarMaterial.setText("Modificar Material");
        mnuModificarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarMaterialActionPerformed(evt);
            }
        });
        jMenu15.add(mnuModificarMaterial);

        mnuConsultarMaterial.setText("Consultar Material");
        mnuConsultarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarMaterialActionPerformed(evt);
            }
        });
        jMenu15.add(mnuConsultarMaterial);

        mnuMateriales.add(jMenu15);

        jMenu12.setText("Materiales / Unidades");
        mnuMateriales.add(jMenu12);

        jMenu13.setText("Controles");

        jMenuItem25.setText("Nuevo Control");
        jMenu13.add(jMenuItem25);

        jMenuItem26.setText("Ver Controles");
        jMenu13.add(jMenuItem26);

        jMenuItem27.setText("Modificar Control");
        jMenu13.add(jMenuItem27);

        jMenuItem28.setText("Borrar Control");
        jMenu13.add(jMenuItem28);

        mnuMateriales.add(jMenu13);

        jMenu14.setText("Extintores");
        mnuMateriales.add(jMenu14);
        mnuMateriales.add(jSeparator5);

        jMenuItem29.setText("Estadistica");
        mnuMateriales.add(jMenuItem29);

        jMenuBar1.add(mnuMateriales);

        mnuSuministros.setText("Suministros");
        mnuSuministros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSuministrosActionPerformed(evt);
            }
        });

        jProvAltaProveedor.setText("Alta Proveedor");
        jProvAltaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProvAltaProveedorActionPerformed(evt);
            }
        });
        mnuSuministros.add(jProvAltaProveedor);

        jProvBajaProveedor.setText("Baja Proveedor");
        jProvBajaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProvBajaProveedorActionPerformed(evt);
            }
        });
        mnuSuministros.add(jProvBajaProveedor);

        jProvModProveedor.setText("Modificar Proveedor");
        jProvModProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProvModProveedorActionPerformed(evt);
            }
        });
        mnuSuministros.add(jProvModProveedor);

        jProvMostrarProveedor.setText("Consultar Proveedor");
        jProvMostrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProvMostrarProveedorActionPerformed(evt);
            }
        });
        mnuSuministros.add(jProvMostrarProveedor);
        mnuSuministros.add(jSeparator6);

        jMenuItem5.setText("Stock");
        mnuSuministros.add(jMenuItem5);

        jMenuBar1.add(mnuSuministros);

        mnuGerencia.setText("Gerencia");
        mnuGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGerenciaActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuGerencia);

        mnuConfiguracion.setText("Configuracion");

        sbmnuDatosCuartel.setText("Datos Cuartel");
        sbmnuDatosCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmnuDatosCuartelActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(sbmnuDatosCuartel);

        jMenuBar1.add(mnuConfiguracion);

        mnuReportes.setText("Reportes");
        mnuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportesActionPerformed(evt);
            }
        });

        sbmnuReporteHoras.setText("Reporte Horas");
        sbmnuReporteHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmnuReporteHorasActionPerformed(evt);
            }
        });
        mnuReportes.add(sbmnuReporteHoras);

        jMenuBar1.add(mnuReportes);

        mnuAyuda.setText("Ayuda");
        mnuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaActionPerformed(evt);
            }
        });

        jPruebaConect.setText("Prueba Conect");
        jPruebaConect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPruebaConectActionPerformed(evt);
            }
        });
        mnuAyuda.add(jPruebaConect);

        jAcercaDe.setText("Acerca de..");
        jAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(jAcercaDe);

        jAyudas.setText("Ayuda");
        jAyudas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAyudasActionPerformed(evt);
            }
        });
        mnuAyuda.add(jAyudas);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    /*public void btnstrasparentes(){
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        
        btn2.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);
    }*/
    
        
    private void mnuModificaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificaMaquinaActionPerformed
      //  AdminMaquinas vermaquinas = new AdminMaquinas();
     //   escritorio.add(vermaquinas);
     //   vermaquinas.show();
    }//GEN-LAST:event_mnuModificaMaquinaActionPerformed

    private void mnuModificarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificarMaterialActionPerformed
       // AdminMateriales vermaterial = new AdminMateriales();
      //  escritorio.add(vermaterial);
      //  vermaterial.show();
    }//GEN-LAST:event_mnuModificarMaterialActionPerformed

    private void mnuAltaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaMaterialActionPerformed
     //   AltaMaterial vernuevomaterial = new AltaMaterial();
      //  escritorio.add(vernuevomaterial);
      //  vernuevomaterial.show();
    }//GEN-LAST:event_mnuAltaMaterialActionPerformed

    private void mnuBajaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaMaterialActionPerformed
      //  BajaMaterial vermaterial = new BajaMaterial();
      //  escritorio.add(vermaterial);
      //  vermaterial.show();
    }//GEN-LAST:event_mnuBajaMaterialActionPerformed

    private void mnuConsultarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarMaterialActionPerformed
       // VerMateriales vermateriales = new VerMateriales();
      //  escritorio.add(vermateriales);
      //  vermateriales.show();
    }//GEN-LAST:event_mnuConsultarMaterialActionPerformed

    private void mnuSuministrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSuministrosActionPerformed
        
    }//GEN-LAST:event_mnuSuministrosActionPerformed

    private void jProvAltaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProvAltaProveedorActionPerformed
//        Guardias verdatosproveedor = new Guardias();
       // escritorio.add(verdatosproveedor);
       // verdatosproveedor.show();
    }//GEN-LAST:event_jProvAltaProveedorActionPerformed

    private void jProvBajaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProvBajaProveedorActionPerformed
        //BajaProveedor verdatosbajaproveedor = new BajaProveedor();
        //escritorio.add(verdatosbajaproveedor);
        //verdatosbajaproveedor.show();
    }//GEN-LAST:event_jProvBajaProveedorActionPerformed

    private void jProvModProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProvModProveedorActionPerformed
        //MuestraProveedor verproveedor = new MuestraProveedor();
     //   escritorio.add(verproveedor);
     //   verproveedor.show();
    }//GEN-LAST:event_jProvModProveedorActionPerformed

    private void jProvMostrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProvMostrarProveedorActionPerformed
     //   MuestraProveedores verproveedores = new MuestraProveedores();
      //  escritorio.add(verproveedores);
      //  verproveedores.show();        
    }//GEN-LAST:event_jProvMostrarProveedorActionPerformed

    private void mnuNuevaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuevaMaquinaActionPerformed
       // AltaMaquina verdatosmaquina = new AltaMaquina();
       // escritorio.add(verdatosmaquina);
       // verdatosmaquina.show();
    }//GEN-LAST:event_mnuNuevaMaquinaActionPerformed

    private void mnuLibroMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLibroMaquinasActionPerformed
       // LibroDeMaquinas vermantmaquinas = new LibroDeMaquinas();
       // escritorio.add(vermantmaquinas);
       // vermantmaquinas.show();
    }//GEN-LAST:event_mnuLibroMaquinasActionPerformed

    private void sbmnuDatosCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmnuDatosCuartelActionPerformed
        //DatosInstitucionalesCuartel verdatosempresa = new DatosInstitucionalesCuartel();
       // escritorio.add(verdatosempresa);
       // verdatosempresa.show();
    }//GEN-LAST:event_sbmnuDatosCuartelActionPerformed

    private void jAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcercaDeActionPerformed
        //AcercaDe verAcercaDe = new AcercaDe();
        //escritorio.add(verAcercaDe);
        //verAcercaDe.show();
    }//GEN-LAST:event_jAcercaDeActionPerformed

    private void jAyudasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAyudasActionPerformed
        
    }//GEN-LAST:event_jAyudasActionPerformed

    private void mnuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaActionPerformed
        //Ayuda verAyuda = new Ayuda();
        //escritorio.add(verAyuda);
        //verAyuda.show();
    }//GEN-LAST:event_mnuAyudaActionPerformed

    private void jAltaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAltaPersonalActionPerformed
        AltaPersonalAyudantia verdatoscliente = new AltaPersonalAyudantia();
        escritorio.add(verdatoscliente);
        verdatoscliente.show();
    }//GEN-LAST:event_jAltaPersonalActionPerformed

    private void jPruebaConectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPruebaConectActionPerformed
        probar_conexion();
    }//GEN-LAST:event_jPruebaConectActionPerformed

    private void mnuPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPersonalActionPerformed
        AdminPersonalAyudantia verdatoscliente = new AdminPersonalAyudantia();
        escritorio.add(verdatoscliente);
        verdatoscliente.show();
    }//GEN-LAST:event_mnuPersonalActionPerformed

    private void jMuestraPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMuestraPersonalActionPerformed
        MuestraPersonalAyudantia verclientes = new MuestraPersonalAyudantia();
        escritorio.add(verclientes);
        verclientes.show();
    }//GEN-LAST:event_jMuestraPersonalActionPerformed

    private void mnuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportesActionPerformed
        
    }//GEN-LAST:event_mnuReportesActionPerformed

    private void sbmnuReporteHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmnuReporteHorasActionPerformed
        //Reportes verventanarep = new Reportes();
        //escritorio.add(verventanarep);
        //verventanarep.show();
    }//GEN-LAST:event_sbmnuReporteHorasActionPerformed

    private void jBajaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBajaPersonalActionPerformed
        BajaPersonal verventana = new BajaPersonal();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_jBajaPersonalActionPerformed

    private void jModificaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificaPersonalActionPerformed
        AdminPersonalAyudantia verventana = new AdminPersonalAyudantia();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_jModificaPersonalActionPerformed

    private void jsbmMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmMaterialesActionPerformed
      //  Materiales verdatosnuevaventa = new Materiales();
      //  escritorio.add(verdatosnuevaventa);
      //  verdatosnuevaventa.show();
    }//GEN-LAST:event_jsbmMaterialesActionPerformed

    private void jsbmMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmMaquinasActionPerformed
        //Maquinas verdatosnuevacompra = new Maquinas();
        //escritorio.add(verdatosnuevacompra);
        //verdatosnuevacompra.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jsbmMaquinasActionPerformed

    private void jsbmSuministrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmSuministrosActionPerformed
        //NuevoProducto verdatosnuevoproducto = new NuevoProducto();
        //escritorio.add(verdatosnuevoproducto);
        //verdatosnuevoproducto.show();
    }//GEN-LAST:event_jsbmSuministrosActionPerformed

    private void jsbmAyudantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmAyudantiaActionPerformed
        //VerPersonal verpersonal = new VerPersonal();
        //escritorio.add(verpersonal);
        //verpersonal.show();
    }//GEN-LAST:event_jsbmAyudantiaActionPerformed

    private void jsbmServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmServiciosActionPerformed
        //Servicios verservicios = new Servicios();
        //escritorio.add(verservicios);
        //verservicios.show();
    }//GEN-LAST:event_jsbmServiciosActionPerformed

    private void jsbmGuardiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmGuardiasActionPerformed
        //Guardias verguardias = new Guardias();
        //escritorio.add(verguardias);
        //verguardias.show();
    }//GEN-LAST:event_jsbmGuardiasActionPerformed

    private void jsbmSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmSemanaActionPerformed
        //Semana versemana = new Semana();
        //escritorio.add(versemana);
        //versemana.show();
    }//GEN-LAST:event_jsbmSemanaActionPerformed

    private void jsbmOrdenDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmOrdenDiaActionPerformed
        //OrdenDelDia verordendeldia = new OrdenDelDia();
        //escritorio.add(verordendeldia);
        //verordendeldia.show();
    }//GEN-LAST:event_jsbmOrdenDiaActionPerformed

    private void jsbmVerSuministrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerSuministrosActionPerformed
        //VerSuministros versuministros = new VerSuministros();
        //escritorio.add(versuministros);
        //versuministros.show();
    }//GEN-LAST:event_jsbmVerSuministrosActionPerformed

    private void jsbmVerMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerMaterialesActionPerformed
        //VerMateriales vermateriales = new VerMateriales();
        //escritorio.add(vermateriales);
        //vermateriales.show();
    }//GEN-LAST:event_jsbmVerMaterialesActionPerformed

    private void jsbmVerAyudantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerAyudantiaActionPerformed
//        MuestraPersonalAyudantia verpersonal = new MuestraPersonalAyudantia();
  //      escritorio.add(verpersonal);
    //    verpersonal.show();
    }//GEN-LAST:event_jsbmVerAyudantiaActionPerformed

    private void jsbmVerMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerMaquinasActionPerformed
        //VerMaquinas vercompras = new VerMaquinas();
       // escritorio.add(vercompras);
       // vercompras.show();
    }//GEN-LAST:event_jsbmVerMaquinasActionPerformed

    private void jsbmVerServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerServiciosActionPerformed
        //MuestraProveedores verproveedores = new MuestraProveedores();
        //escritorio.add(verproveedores);
        //verproveedores.show();
    }//GEN-LAST:event_jsbmVerServiciosActionPerformed

    private void jsbmVerGuardiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerGuardiasActionPerformed
        //MuestraStock verstock = new MuestraStock();
        //escritorio.add(verstock);
        //verstock.show();
    }//GEN-LAST:event_jsbmVerGuardiasActionPerformed

    private void jsbmVerOrdenDelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsbmVerOrdenDelDiaActionPerformed
        //MuestraEmpleados verempleados = new MuestraEmpleados();
        //escritorio.add(verempleados);
        //verempleados.show();
    }//GEN-LAST:event_jsbmVerOrdenDelDiaActionPerformed

    private void jArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jArchivoSalirActionPerformed

    private void mnuExportarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExportarDatosActionPerformed
        ExportarDatos verExportarDatos = new ExportarDatos();
        escritorio.add(verExportarDatos);
        verExportarDatos.show();
    }//GEN-LAST:event_mnuExportarDatosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       // Impresion verImprimir = new Impresion();
       // escritorio.add(verImprimir);
      //  verImprimir.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuBajaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaMaquinaActionPerformed
        //BajaMaquina verdatosmaquina = new BajaMaquina();
       // escritorio.add(verdatosmaquina);
       // verdatosmaquina.show();
    }//GEN-LAST:event_mnuBajaMaquinaActionPerformed

    private void mnuVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuVerActionPerformed

    private void mnuGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuGerenciaActionPerformed

    private void mnuMuestraLegajoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuestraLegajoPersonalActionPerformed
        MuestraLegajoPersonal verdatoslegajo = new MuestraLegajoPersonal();
        escritorio.add(verdatoslegajo);
        verdatoslegajo.show();
    }//GEN-LAST:event_mnuMuestraLegajoPersonalActionPerformed

    private void mnuAltaLegajoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaLegajoPersonalActionPerformed
        AltaDatosInsPersonal veraltadatoslegajo = new AltaDatosInsPersonal();
        escritorio.add(veraltadatoslegajo);
        veraltadatoslegajo.show();
    }//GEN-LAST:event_mnuAltaLegajoPersonalActionPerformed

    private void mnuModificaLegajoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificaLegajoPersonalActionPerformed
       ModificaLegajoPersonal verdatoslegajo = new ModificaLegajoPersonal();
        escritorio.add(verdatoslegajo);
        verdatoslegajo.show();
    }//GEN-LAST:event_mnuModificaLegajoPersonalActionPerformed

    private void mnuBorrarLegajoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBorrarLegajoPersonalActionPerformed
        BajaLegajoPersonal verdatoslegajo = new BajaLegajoPersonal();
        escritorio.add(verdatoslegajo);
        verdatoslegajo.show();
    }//GEN-LAST:event_mnuBorrarLegajoPersonalActionPerformed

    private void mnuAltaNovedadPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaNovedadPersonalActionPerformed
        AltaEventosPersonal veraltaeventospersonal = new AltaEventosPersonal();
        escritorio.add(veraltaeventospersonal);
        veraltaeventospersonal.show();
    }//GEN-LAST:event_mnuAltaNovedadPersonalActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //VerHistoricoPersonal verhiseventospersonal = new VerHistoricoPersonal();
        //escritorio.add(verhiseventospersonal);
        //verhiseventospersonal.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jAltaPersonal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAltaPersonal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAltaPersonal1ActionPerformed

    private void jMuestraPersonal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMuestraPersonal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMuestraPersonal1ActionPerformed

    private void jModificaPersonal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificaPersonal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jModificaPersonal1ActionPerformed

    private void jBajaPersonal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBajaPersonal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBajaPersonal1ActionPerformed

    private void jAltaPersonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAltaPersonal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAltaPersonal2ActionPerformed

    private void jMuestraPersonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMuestraPersonal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMuestraPersonal2ActionPerformed

    private void jModificaPersonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificaPersonal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jModificaPersonal2ActionPerformed

    private void jBajaPersonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBajaPersonal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBajaPersonal2ActionPerformed

    private void jAltaPersonal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAltaPersonal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAltaPersonal3ActionPerformed

    private void jMuestraPersonal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMuestraPersonal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMuestraPersonal3ActionPerformed

    private void jModificaPersonal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificaPersonal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jModificaPersonal3ActionPerformed

    private void jBajaPersonal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBajaPersonal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBajaPersonal3ActionPerformed

    private void jAltaPersonal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAltaPersonal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAltaPersonal4ActionPerformed

    private void jMuestraPersonal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMuestraPersonal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMuestraPersonal4ActionPerformed

    private void jModificaPersonal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificaPersonal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jModificaPersonal4ActionPerformed

    private void jBajaPersonal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBajaPersonal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBajaPersonal4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalPersonal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jAcercaDe;
    private javax.swing.JMenuItem jAltaPersonal;
    private javax.swing.JMenuItem jAltaPersonal1;
    private javax.swing.JMenuItem jAltaPersonal2;
    private javax.swing.JMenuItem jAltaPersonal3;
    private javax.swing.JMenuItem jAltaPersonal4;
    private javax.swing.JMenuItem jArchivoSalir;
    private javax.swing.JMenuItem jAyudas;
    private javax.swing.JMenuItem jBajaPersonal;
    private javax.swing.JMenuItem jBajaPersonal1;
    private javax.swing.JMenuItem jBajaPersonal2;
    private javax.swing.JMenuItem jBajaPersonal3;
    private javax.swing.JMenuItem jBajaPersonal4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jModificaPersonal;
    private javax.swing.JMenuItem jModificaPersonal1;
    private javax.swing.JMenuItem jModificaPersonal2;
    private javax.swing.JMenuItem jModificaPersonal3;
    private javax.swing.JMenuItem jModificaPersonal4;
    private javax.swing.JMenuItem jMuestraPersonal;
    private javax.swing.JMenuItem jMuestraPersonal1;
    private javax.swing.JMenuItem jMuestraPersonal2;
    private javax.swing.JMenuItem jMuestraPersonal3;
    private javax.swing.JMenuItem jMuestraPersonal4;
    private javax.swing.JMenuItem jProvAltaProveedor;
    private javax.swing.JMenuItem jProvBajaProveedor;
    private javax.swing.JMenuItem jProvModProveedor;
    private javax.swing.JMenuItem jProvMostrarProveedor;
    private javax.swing.JMenuItem jPruebaConect;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem jsbmAyudantia;
    private javax.swing.JMenuItem jsbmGuardias;
    private javax.swing.JMenuItem jsbmMaquinas;
    private javax.swing.JMenuItem jsbmMateriales;
    private javax.swing.JMenuItem jsbmOrdenDia;
    private javax.swing.JMenuItem jsbmSemana;
    private javax.swing.JMenuItem jsbmServicios;
    private javax.swing.JMenuItem jsbmSuministros;
    private javax.swing.JMenuItem jsbmVerAyudantia;
    private javax.swing.JMenuItem jsbmVerGuardias;
    private javax.swing.JMenuItem jsbmVerMaquinas;
    private javax.swing.JMenuItem jsbmVerMateriales;
    private javax.swing.JMenuItem jsbmVerOrdenDelDia;
    private javax.swing.JMenuItem jsbmVerServicios;
    private javax.swing.JMenuItem jsbmVerSuministros;
    private javax.swing.JMenuItem mnuAltaLegajoPersonal;
    private javax.swing.JMenuItem mnuAltaMaterial;
    private javax.swing.JMenuItem mnuAltaNovedadPersonal;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuBajaMaquina;
    private javax.swing.JMenuItem mnuBajaMaterial;
    private javax.swing.JMenuItem mnuBorrarLegajoPersonal;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuConsultarMaterial;
    private javax.swing.JMenu mnuEventosPersonal;
    private javax.swing.JMenuItem mnuExportarDatos;
    private javax.swing.JMenu mnuGerencia;
    private javax.swing.JMenu mnuGuardia;
    private javax.swing.JMenuItem mnuLibroMaquinas;
    private javax.swing.JMenu mnuMaquinas;
    private javax.swing.JMenu mnuMateriales;
    private javax.swing.JMenuItem mnuModificaLegajoPersonal;
    private javax.swing.JMenuItem mnuModificaMaquina;
    private javax.swing.JMenuItem mnuModificarMaterial;
    private javax.swing.JMenuItem mnuMuestraLegajoPersonal;
    private javax.swing.JMenuItem mnuNuevaMaquina;
    private javax.swing.JMenu mnuPersonal;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuSuministros;
    private javax.swing.JMenu mnuVer;
    private javax.swing.JMenuItem sbmnuDatosCuartel;
    private javax.swing.JMenu sbmnuEmergencias;
    private javax.swing.JMenu sbmnuNovedades;
    private javax.swing.JMenu sbmnuPartesDeServicio;
    private javax.swing.JMenuItem sbmnuReporteHoras;
    private javax.swing.JMenu sbmnuServicios;
    private javax.swing.JMenu smnuLegajos;
    private javax.swing.JMenu smnuLibretaSanitaria;
    private javax.swing.JMenu smnuLisencias;
    private javax.swing.JMenu smnuMasTareas;
    private javax.swing.JMenu smnuMedidasDisciplinarias;
    private javax.swing.JMenu smnuObraSocial;
    private javax.swing.JMenu smnuPersonal;
    private javax.swing.JMenu smnuSeguros;
    // End of variables declaration//GEN-END:variables

    

   
}
