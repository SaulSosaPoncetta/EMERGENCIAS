package vista;

import Modelo.Conexion;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrincipalEmergencias extends javax.swing.JFrame {

    Conexion enlace = new Conexion();
    Connection conect = enlace.conectar();
    
    public PrincipalEmergencias() {
        initComponents();
        this.setExtendedState(6);
        probar_conexion();
    
        String NumeroLegajoBom;
        String ApellidoBom;
        
        mnuArchivo.setEnabled(true);
        mnuVer.setEnabled(false);
        mnuGuardia.setEnabled(false);
        mnuPersonal.setEnabled(true);
        mnuOficinaTecnica.setEnabled(false);
        mnuMaquinas.setEnabled(false);
        mnuMateriales.setEnabled(false);
        mnuSuministros.setEnabled(false);
        mnuGerencia.setEnabled(false);
        mnuConfiguracion.setEnabled(false);
        mnuReportes.setEnabled(false);
        
    }
    
    public void probar_conexion(){
        if(conect == null){
            JOptionPane.showMessageDialog(null,"CONEXION A BASE DE DATOS DEL PERSONAL NO LOGRADA");
        } else{
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA A BASE DATOS DE PERSONAL LINK OK");
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
        smnuAltaLegajo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem27 = new javax.swing.JMenuItem();
        smnuAltaDatoMedico = new javax.swing.JMenuItem();
        smnuAltaNovedadPersonal = new javax.swing.JMenuItem();
        smnuAltaLibSanit = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        smnuPersonal = new javax.swing.JMenu();
        smnuMuestraPersonal = new javax.swing.JMenuItem();
        smnuModificaPersonal = new javax.swing.JMenuItem();
        smnuMostrarHistoricoPerosonal = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        smnuMuestraLaborales = new javax.swing.JMenuItem();
        smnuModificaLaborales = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        smnuDatosFamiliares = new javax.swing.JMenu();
        smnuMuestraFamiliares = new javax.swing.JMenuItem();
        smnuModificaFamiliares = new javax.swing.JMenuItem();
        smnuDatosHijos = new javax.swing.JMenu();
        smnuAltaDatosHijos = new javax.swing.JMenuItem();
        smnuVerDatosHijos = new javax.swing.JMenuItem();
        smnuModificarDatosHijos = new javax.swing.JMenuItem();
        smnuBorrarDatosHijos = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        smnuMostrarForFor = new javax.swing.JMenuItem();
        smnuModificarForFor = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        smnuMostrarIntereses = new javax.swing.JMenuItem();
        smnuModificarIntereses = new javax.swing.JMenuItem();
        sMnuBancarizacion = new javax.swing.JMenu();
        smnuMostrarFinancieros = new javax.swing.JMenuItem();
        smnuModificarFinancieros = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        smnuLibretaSanitaria = new javax.swing.JMenu();
        smnuDatosMedicos = new javax.swing.JMenu();
        smnuMuestraMedicos = new javax.swing.JMenuItem();
        smnuModificaMedicos = new javax.swing.JMenuItem();
        smnuIoma = new javax.swing.JMenu();
        smnuMuestraIoma = new javax.swing.JMenuItem();
        smnuModificaIoma = new javax.swing.JMenuItem();
        mnuLibretaSanitaria = new javax.swing.JMenu();
        smnuMuestraLibSanit = new javax.swing.JMenuItem();
        smnuModifLibSanit = new javax.swing.JMenuItem();
        mnuHistorialMedico = new javax.swing.JMenu();
        smnuMostrarHistorialMedico = new javax.swing.JMenuItem();
        smnuModificarHistMed = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        smnuLegajos = new javax.swing.JMenu();
        smnuMuestraInstitucionales = new javax.swing.JMenuItem();
        smnuModificaInstitucionales = new javax.swing.JMenuItem();
        smnuMostrarSeguros = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        smnuModificarSeguros = new javax.swing.JMenuItem();
        smnuLisencias = new javax.swing.JMenu();
        smnuMostrarLicencias = new javax.swing.JMenuItem();
        smnuModificarLisencias = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        smnuMedidasDisciplinarias = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        smnuAplicarApersibimiento = new javax.swing.JMenuItem();
        smnuMostrarApersibimientos = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        smnuAplicarSancion = new javax.swing.JMenuItem();
        smnuMostrarSanciones = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        smnuMostrarCursos = new javax.swing.JMenuItem();
        smnuModificarCursos = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        smnuMasTareas = new javax.swing.JMenu();
        mnuExportarDatos = new javax.swing.JMenuItem();
        smnuImprimir = new javax.swing.JMenuItem();
        smnuGruposSemana = new javax.swing.JMenuItem();
        smnuOrdenDia = new javax.swing.JMenuItem();
        mnuOficinaTecnica = new javax.swing.JMenu();
        mnuMaquinas = new javax.swing.JMenu();
        mnuNuevaMaquina = new javax.swing.JMenuItem();
        mnuBajaMaquina = new javax.swing.JMenuItem();
        mnuModificaMaquina = new javax.swing.JMenuItem();
        mnuLibroMaquinas = new javax.swing.JMenuItem();
        mnuMateriales = new javax.swing.JMenu();
        mnuHistoriaNovedadesMateriales = new javax.swing.JMenu();
        mnuAltaHistoriaMaterial = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        mnuBorrarHistoriaMaterial = new javax.swing.JMenuItem();
        mnuVerHistoriaMaterial = new javax.swing.JMenuItem();
        mnuBitacoraTareas = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        smnuAltaCargaTubosERA = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuInventarioGeneralMateriales = new javax.swing.JMenu();
        mnuAltaMaterialInventario = new javax.swing.JMenuItem();
        mnuBajaMaterial1 = new javax.swing.JMenuItem();
        mnuModificarMaterial1 = new javax.swing.JMenuItem();
        mnuConsultarMaterial1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuMaterialesUnidades = new javax.swing.JMenu();
        mnuAltaMaterialUnidad = new javax.swing.JMenuItem();
        mnuBorraMaterialUnidad = new javax.swing.JMenuItem();
        mnuModificaMaterialUnidad = new javax.swing.JMenuItem();
        mnuMuestraMaterialesUnidad = new javax.swing.JMenuItem();
        mnuMaterialesGruposEspeciales = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        mnuExtintores = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        mnuEstadistica = new javax.swing.JMenuItem();
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
            .addGap(0, 1266, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Box.png"))); // NOI18N
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

        mnuVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ver_recibo.png"))); // NOI18N
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

        mnuGuardia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/asistencia_m.png"))); // NOI18N
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

        mnuPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cliente_m.png"))); // NOI18N
        mnuPersonal.setText("Personal");
        mnuPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPersonalActionPerformed(evt);
            }
        });

        smnuAltaLegajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        smnuAltaLegajo.setText("Ingreso y Alta Legajo Personal");
        smnuAltaLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAltaLegajoActionPerformed(evt);
            }
        });
        mnuPersonal.add(smnuAltaLegajo);

        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mnuPersonal.add(jSeparator2);

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar_p1.png"))); // NOI18N
        jMenuItem27.setText("Bitacora Historial Laboral");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        mnuPersonal.add(jMenuItem27);

        smnuAltaDatoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar_p1.png"))); // NOI18N
        smnuAltaDatoMedico.setText("Bitacora Historial Medico");
        smnuAltaDatoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAltaDatoMedicoActionPerformed(evt);
            }
        });
        mnuPersonal.add(smnuAltaDatoMedico);

        smnuAltaNovedadPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar_p1.png"))); // NOI18N
        smnuAltaNovedadPersonal.setText("Bitacora Novedad Personal");
        smnuAltaNovedadPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAltaNovedadPersonalActionPerformed(evt);
            }
        });
        mnuPersonal.add(smnuAltaNovedadPersonal);

        smnuAltaLibSanit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar_p1.png"))); // NOI18N
        smnuAltaLibSanit.setText("Bitacora Libreta Sanitaria");
        smnuAltaLibSanit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAltaLibSanitActionPerformed(evt);
            }
        });
        mnuPersonal.add(smnuAltaLibSanit);
        mnuPersonal.add(jSeparator4);

        smnuPersonal.setText("Personales");

        smnuMuestraPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/report.png"))); // NOI18N
        smnuMuestraPersonal.setText("Mostrar");
        smnuMuestraPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraPersonalActionPerformed(evt);
            }
        });
        smnuPersonal.add(smnuMuestraPersonal);

        smnuModificaPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        smnuModificaPersonal.setText("Modificar");
        smnuModificaPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificaPersonalActionPerformed(evt);
            }
        });
        smnuPersonal.add(smnuModificaPersonal);

        mnuPersonal.add(smnuPersonal);

        smnuMostrarHistoricoPerosonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busca_p1.png"))); // NOI18N
        smnuMostrarHistoricoPerosonal.setText("Historial Personal");
        smnuMostrarHistoricoPerosonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarHistoricoPerosonalActionPerformed(evt);
            }
        });
        mnuPersonal.add(smnuMostrarHistoricoPerosonal);
        mnuPersonal.add(jSeparator8);

        jMenu3.setText("Laborales / Empleador");

        smnuMuestraLaborales.setText("Mostrar");
        smnuMuestraLaborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraLaboralesActionPerformed(evt);
            }
        });
        jMenu3.add(smnuMuestraLaborales);

        smnuModificaLaborales.setText("Modificar");
        smnuModificaLaborales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificaLaboralesActionPerformed(evt);
            }
        });
        jMenu3.add(smnuModificaLaborales);

        mnuPersonal.add(jMenu3);

        jMenu13.setText("Historial Laboral / Curiculum Laboral");

        jMenuItem26.setText("Mostrar");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem26);

        jMenuItem28.setText("Modificar");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem28);

        mnuPersonal.add(jMenu13);
        mnuPersonal.add(jSeparator12);

        smnuDatosFamiliares.setText("Familiares");

        smnuMuestraFamiliares.setText("Mostrar");
        smnuMuestraFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraFamiliaresActionPerformed(evt);
            }
        });
        smnuDatosFamiliares.add(smnuMuestraFamiliares);

        smnuModificaFamiliares.setText("Modificar");
        smnuModificaFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificaFamiliaresActionPerformed(evt);
            }
        });
        smnuDatosFamiliares.add(smnuModificaFamiliares);

        smnuDatosHijos.setText("Datos de Hijos");

        smnuAltaDatosHijos.setText("Alta Hijos");
        smnuAltaDatosHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAltaDatosHijosActionPerformed(evt);
            }
        });
        smnuDatosHijos.add(smnuAltaDatosHijos);

        smnuVerDatosHijos.setText("Ver Hijos");
        smnuVerDatosHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuVerDatosHijosActionPerformed(evt);
            }
        });
        smnuDatosHijos.add(smnuVerDatosHijos);

        smnuModificarDatosHijos.setText("Modificar Hijos");
        smnuModificarDatosHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarDatosHijosActionPerformed(evt);
            }
        });
        smnuDatosHijos.add(smnuModificarDatosHijos);

        smnuBorrarDatosHijos.setText("Borrar Hijos");
        smnuBorrarDatosHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuBorrarDatosHijosActionPerformed(evt);
            }
        });
        smnuDatosHijos.add(smnuBorrarDatosHijos);

        smnuDatosFamiliares.add(smnuDatosHijos);

        mnuPersonal.add(smnuDatosFamiliares);

        jMenu7.setText("Estudios Formales");

        smnuMostrarForFor.setText("Mostrar");
        smnuMostrarForFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarForForActionPerformed(evt);
            }
        });
        jMenu7.add(smnuMostrarForFor);

        smnuModificarForFor.setText("Modificar");
        smnuModificarForFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarForForActionPerformed(evt);
            }
        });
        jMenu7.add(smnuModificarForFor);

        jMenuItem15.setText("Nuevo");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        mnuPersonal.add(jMenu7);

        jMenu6.setText("Intereses");

        smnuMostrarIntereses.setText("Mostrar");
        smnuMostrarIntereses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarInteresesActionPerformed(evt);
            }
        });
        jMenu6.add(smnuMostrarIntereses);

        smnuModificarIntereses.setText("Modificar");
        smnuModificarIntereses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarInteresesActionPerformed(evt);
            }
        });
        jMenu6.add(smnuModificarIntereses);

        mnuPersonal.add(jMenu6);

        sMnuBancarizacion.setText("Bancarizacion");

        smnuMostrarFinancieros.setText("Mostrar");
        smnuMostrarFinancieros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarFinancierosActionPerformed(evt);
            }
        });
        sMnuBancarizacion.add(smnuMostrarFinancieros);

        smnuModificarFinancieros.setText("Modificar");
        smnuModificarFinancieros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarFinancierosActionPerformed(evt);
            }
        });
        sMnuBancarizacion.add(smnuModificarFinancieros);

        mnuPersonal.add(sMnuBancarizacion);
        mnuPersonal.add(jSeparator9);

        smnuLibretaSanitaria.setText("Salud");

        smnuDatosMedicos.setText("Datos Medicos");

        smnuMuestraMedicos.setText("Mostrar");
        smnuMuestraMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraMedicosActionPerformed(evt);
            }
        });
        smnuDatosMedicos.add(smnuMuestraMedicos);

        smnuModificaMedicos.setText("Modificar");
        smnuModificaMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificaMedicosActionPerformed(evt);
            }
        });
        smnuDatosMedicos.add(smnuModificaMedicos);

        smnuLibretaSanitaria.add(smnuDatosMedicos);

        smnuIoma.setText("IOMA ");

        smnuMuestraIoma.setText("Mostrar");
        smnuMuestraIoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraIomaActionPerformed(evt);
            }
        });
        smnuIoma.add(smnuMuestraIoma);

        smnuModificaIoma.setText("Modificar");
        smnuModificaIoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificaIomaActionPerformed(evt);
            }
        });
        smnuIoma.add(smnuModificaIoma);

        smnuLibretaSanitaria.add(smnuIoma);

        mnuLibretaSanitaria.setText("Libreta Sanitaria");

        smnuMuestraLibSanit.setText("Mostrar");
        smnuMuestraLibSanit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraLibSanitActionPerformed(evt);
            }
        });
        mnuLibretaSanitaria.add(smnuMuestraLibSanit);

        smnuModifLibSanit.setText("Modificar");
        smnuModifLibSanit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModifLibSanitActionPerformed(evt);
            }
        });
        mnuLibretaSanitaria.add(smnuModifLibSanit);

        smnuLibretaSanitaria.add(mnuLibretaSanitaria);

        mnuHistorialMedico.setText("Historial Medico");

        smnuMostrarHistorialMedico.setText("Mostrar");
        smnuMostrarHistorialMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarHistorialMedicoActionPerformed(evt);
            }
        });
        mnuHistorialMedico.add(smnuMostrarHistorialMedico);

        smnuModificarHistMed.setText("Modificar");
        smnuModificarHistMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarHistMedActionPerformed(evt);
            }
        });
        mnuHistorialMedico.add(smnuModificarHistMed);

        smnuLibretaSanitaria.add(mnuHistorialMedico);

        mnuPersonal.add(smnuLibretaSanitaria);
        mnuPersonal.add(jSeparator10);

        jMenu14.setText("Ingresos a BBVVO");

        jMenuItem6.setText("Mostrar");
        jMenu14.add(jMenuItem6);

        jMenuItem8.setText("Modificar");
        jMenu14.add(jMenuItem8);

        mnuPersonal.add(jMenu14);

        smnuLegajos.setText("Institucionales");

        smnuMuestraInstitucionales.setText("Mostrar");
        smnuMuestraInstitucionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMuestraInstitucionalesActionPerformed(evt);
            }
        });
        smnuLegajos.add(smnuMuestraInstitucionales);

        smnuModificaInstitucionales.setText("Modificar");
        smnuModificaInstitucionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificaInstitucionalesActionPerformed(evt);
            }
        });
        smnuLegajos.add(smnuModificaInstitucionales);

        mnuPersonal.add(smnuLegajos);

        smnuMostrarSeguros.setText("Seguros");

        jMenuItem20.setText("Mostrar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        smnuMostrarSeguros.add(jMenuItem20);

        smnuModificarSeguros.setText("Modificar");
        smnuModificarSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarSegurosActionPerformed(evt);
            }
        });
        smnuMostrarSeguros.add(smnuModificarSeguros);

        mnuPersonal.add(smnuMostrarSeguros);

        smnuLisencias.setText("Lisencias");

        smnuMostrarLicencias.setText("Mostrar");
        smnuMostrarLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarLicenciasActionPerformed(evt);
            }
        });
        smnuLisencias.add(smnuMostrarLicencias);

        smnuModificarLisencias.setText("Modificar");
        smnuModificarLisencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarLisenciasActionPerformed(evt);
            }
        });
        smnuLisencias.add(smnuModificarLisencias);

        jMenuItem14.setText("Nueva");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        smnuLisencias.add(jMenuItem14);

        mnuPersonal.add(smnuLisencias);

        smnuMedidasDisciplinarias.setText("Medidas Disciplinarias");

        jMenu10.setText("Apercibimientos");

        smnuAplicarApersibimiento.setText("Aplicar Apercibimiento");
        smnuAplicarApersibimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAplicarApersibimientoActionPerformed(evt);
            }
        });
        jMenu10.add(smnuAplicarApersibimiento);

        smnuMostrarApersibimientos.setText("Mostrar Apersibimientos");
        smnuMostrarApersibimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarApersibimientosActionPerformed(evt);
            }
        });
        jMenu10.add(smnuMostrarApersibimientos);

        smnuMedidasDisciplinarias.add(jMenu10);

        jMenu11.setText("Sanciones");

        smnuAplicarSancion.setText("Aplicar Sancion");
        smnuAplicarSancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAplicarSancionActionPerformed(evt);
            }
        });
        jMenu11.add(smnuAplicarSancion);

        smnuMostrarSanciones.setText("Mostrar Sanciones");
        smnuMostrarSanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarSancionesActionPerformed(evt);
            }
        });
        jMenu11.add(smnuMostrarSanciones);

        smnuMedidasDisciplinarias.add(jMenu11);

        mnuPersonal.add(smnuMedidasDisciplinarias);

        jMenu5.setText("Cursos");

        smnuMostrarCursos.setText("Mostrar");
        smnuMostrarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuMostrarCursosActionPerformed(evt);
            }
        });
        jMenu5.add(smnuMostrarCursos);

        smnuModificarCursos.setText("Modificar");
        smnuModificarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuModificarCursosActionPerformed(evt);
            }
        });
        jMenu5.add(smnuModificarCursos);

        jMenuItem12.setText("Nuevo");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        mnuPersonal.add(jMenu5);

        jMenu1.setText("Documentos Personal");

        jMenuItem2.setText("Mostrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Modificar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem10.setText("Nuevo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        mnuPersonal.add(jMenu1);

        jMenu2.setText("Conductores");

        jMenuItem1.setText("Mostrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Modificar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        mnuPersonal.add(jMenu2);
        mnuPersonal.add(jSeparator11);

        smnuMasTareas.setText("Mas Tareas");

        mnuExportarDatos.setText("Exportar");
        mnuExportarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExportarDatosActionPerformed(evt);
            }
        });
        smnuMasTareas.add(mnuExportarDatos);

        smnuImprimir.setText("Imprimir");
        smnuImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuImprimirActionPerformed(evt);
            }
        });
        smnuMasTareas.add(smnuImprimir);

        smnuGruposSemana.setText("Arma Grupos Semana");
        smnuGruposSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuGruposSemanaActionPerformed(evt);
            }
        });
        smnuMasTareas.add(smnuGruposSemana);

        smnuOrdenDia.setText("Arma Orden Dia");
        smnuMasTareas.add(smnuOrdenDia);

        mnuPersonal.add(smnuMasTareas);

        jMenuBar1.add(mnuPersonal);

        mnuOficinaTecnica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/proveedores_m.png"))); // NOI18N
        mnuOficinaTecnica.setText("Oficina Tecnica");
        jMenuBar1.add(mnuOficinaTecnica);

        mnuMaquinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Operaciones.png"))); // NOI18N
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

        mnuMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Mantenimiento.png"))); // NOI18N
        mnuMateriales.setText("Materiales");

        mnuHistoriaNovedadesMateriales.setText("Historia / Novedades de Materiales");
        mnuHistoriaNovedadesMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHistoriaNovedadesMaterialesActionPerformed(evt);
            }
        });

        mnuAltaHistoriaMaterial.setText("Alta Historia");
        mnuAltaHistoriaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaHistoriaMaterialActionPerformed(evt);
            }
        });
        mnuHistoriaNovedadesMateriales.add(mnuAltaHistoriaMaterial);

        jMenuItem30.setText("Modifica Historia");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        mnuHistoriaNovedadesMateriales.add(jMenuItem30);

        mnuBorrarHistoriaMaterial.setText("Borrar Historia");
        mnuBorrarHistoriaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBorrarHistoriaMaterialActionPerformed(evt);
            }
        });
        mnuHistoriaNovedadesMateriales.add(mnuBorrarHistoriaMaterial);

        mnuVerHistoriaMaterial.setText("Ver Historia");
        mnuVerHistoriaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerHistoriaMaterialActionPerformed(evt);
            }
        });
        mnuHistoriaNovedadesMateriales.add(mnuVerHistoriaMaterial);

        mnuMateriales.add(mnuHistoriaNovedadesMateriales);

        mnuBitacoraTareas.setText("Bitacora de Tareas");

        jMenuItem35.setText("Nueva Tarea");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        mnuBitacoraTareas.add(jMenuItem35);

        jMenuItem36.setText("Ver Tareas");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        mnuBitacoraTareas.add(jMenuItem36);

        jMenuItem39.setText("Modificar Tarea");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        mnuBitacoraTareas.add(jMenuItem39);

        jMenuItem41.setText("Borrar Tarea");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        mnuBitacoraTareas.add(jMenuItem41);

        mnuMateriales.add(mnuBitacoraTareas);

        jMenu8.setText("Bitacora de Carga de Tubos / ERA");

        smnuAltaCargaTubosERA.setText("Registrar Carga Tubos ERA");
        smnuAltaCargaTubosERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuAltaCargaTubosERAActionPerformed(evt);
            }
        });
        jMenu8.add(smnuAltaCargaTubosERA);

        jMenuItem42.setText("Modificar Datos Carga ERA");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem42);

        jMenuItem43.setText("Borrar Datos Carga ERA");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem43);

        jMenuItem44.setText("Ver Datos Carga ERA");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem44);

        mnuMateriales.add(jMenu8);
        mnuMateriales.add(jSeparator5);

        mnuInventarioGeneralMateriales.setText("Inventario General Materiales");

        mnuAltaMaterialInventario.setText("Alta Material de Inventario");
        mnuAltaMaterialInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaMaterialInventarioActionPerformed(evt);
            }
        });
        mnuInventarioGeneralMateriales.add(mnuAltaMaterialInventario);

        mnuBajaMaterial1.setText("Baja Material de Inventario");
        mnuBajaMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaMaterial1ActionPerformed(evt);
            }
        });
        mnuInventarioGeneralMateriales.add(mnuBajaMaterial1);

        mnuModificarMaterial1.setText("Modificar Material de Inventario");
        mnuModificarMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarMaterial1ActionPerformed(evt);
            }
        });
        mnuInventarioGeneralMateriales.add(mnuModificarMaterial1);

        mnuConsultarMaterial1.setText("Consultar Material de Inventario");
        mnuConsultarMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarMaterial1ActionPerformed(evt);
            }
        });
        mnuInventarioGeneralMateriales.add(mnuConsultarMaterial1);
        mnuInventarioGeneralMateriales.add(jSeparator7);

        mnuMateriales.add(mnuInventarioGeneralMateriales);

        mnuMaterialesUnidades.setText("Materiales / Unidades");
        mnuMaterialesUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMaterialesUnidadesActionPerformed(evt);
            }
        });

        mnuAltaMaterialUnidad.setText("Alta de Material a Unidad");
        mnuAltaMaterialUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaMaterialUnidadActionPerformed(evt);
            }
        });
        mnuMaterialesUnidades.add(mnuAltaMaterialUnidad);

        mnuBorraMaterialUnidad.setText("Borrar Material de Unidad");
        mnuBorraMaterialUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBorraMaterialUnidadActionPerformed(evt);
            }
        });
        mnuMaterialesUnidades.add(mnuBorraMaterialUnidad);

        mnuModificaMaterialUnidad.setText("Modifica Material de Unidad");
        mnuModificaMaterialUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificaMaterialUnidadActionPerformed(evt);
            }
        });
        mnuMaterialesUnidades.add(mnuModificaMaterialUnidad);

        mnuMuestraMaterialesUnidad.setText("Ver Materiales de Unidad");
        mnuMuestraMaterialesUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuestraMaterialesUnidadActionPerformed(evt);
            }
        });
        mnuMaterialesUnidades.add(mnuMuestraMaterialesUnidad);

        mnuMateriales.add(mnuMaterialesUnidades);

        mnuMaterialesGruposEspeciales.setText("Material Grupos Especiales");

        jMenu9.setText("Resc. Vehicular");
        mnuMaterialesGruposEspeciales.add(jMenu9);

        jMenu16.setText("Cuerdas");
        mnuMaterialesGruposEspeciales.add(jMenu16);

        jMenu17.setText("HAZ MAT");
        mnuMaterialesGruposEspeciales.add(jMenu17);

        jMenu18.setText("BREC");
        mnuMaterialesGruposEspeciales.add(jMenu18);

        jMenu19.setText("Incendio");
        mnuMaterialesGruposEspeciales.add(jMenu19);

        mnuMateriales.add(mnuMaterialesGruposEspeciales);

        jMenu20.setText("ERA Equipos Autonomos");

        jMenuItem45.setText("Alta ERA Equipo Autonomo");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem45);

        jMenuItem46.setText("Baja ERA Equipo Autonomo");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem46);

        jMenuItem47.setText("Modif. ERA Equipo Autonomo");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem47);

        jMenuItem48.setText("Ver ERA Equipo Autonomo");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem48);

        mnuMateriales.add(jMenu20);

        mnuExtintores.setText("Extintores");

        jMenuItem7.setText("Alta Extintor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnuExtintores.add(jMenuItem7);

        jMenuItem9.setText("Modif. Extintor");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnuExtintores.add(jMenuItem9);

        jMenuItem11.setText("Borra Extintor");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        mnuExtintores.add(jMenuItem11);

        jMenuItem13.setText("Ver Extintor");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        mnuExtintores.add(jMenuItem13);

        mnuMateriales.add(mnuExtintores);

        mnuEstadistica.setText("Estadistica");
        mnuEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEstadisticaActionPerformed(evt);
            }
        });
        mnuMateriales.add(mnuEstadistica);

        jMenuBar1.add(mnuMateriales);

        mnuSuministros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/productos_m.png"))); // NOI18N
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

        mnuGerencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ventasdetalladas.png"))); // NOI18N
        mnuGerencia.setText("Gerencia");
        mnuGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGerenciaActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuGerencia);

        mnuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cog.png"))); // NOI18N
        mnuConfiguracion.setText("Configuracion");

        sbmnuDatosCuartel.setText("Datos Cuartel");
        sbmnuDatosCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmnuDatosCuartelActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(sbmnuDatosCuartel);

        jMenuBar1.add(mnuConfiguracion);

        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/report.png"))); // NOI18N
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

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/help.png"))); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
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

    private void jPruebaConectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPruebaConectActionPerformed
        probar_conexion();
    }//GEN-LAST:event_jPruebaConectActionPerformed

    private void mnuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportesActionPerformed
        
    }//GEN-LAST:event_mnuReportesActionPerformed

    private void sbmnuReporteHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmnuReporteHorasActionPerformed
        //Reportes verventanarep = new Reportes();
        //escritorio.add(verventanarep);
        //verventanarep.show();
    }//GEN-LAST:event_sbmnuReporteHorasActionPerformed

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
//        MuestraDatosPersonales verpersonal = new MuestraDatosPersonales();
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

    private void mnuPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPersonalActionPerformed
       
    }//GEN-LAST:event_mnuPersonalActionPerformed

    private void smnuMostrarSancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarSancionesActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_smnuMostrarSancionesActionPerformed

    private void smnuAplicarSancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAplicarSancionActionPerformed
        AltaDatosSanciones verdatossanciones = new AltaDatosSanciones();
        escritorio.add(verdatossanciones);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatossanciones.getSize();
        verdatossanciones.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatossanciones.show();
    }//GEN-LAST:event_smnuAplicarSancionActionPerformed

    private void smnuMostrarApersibimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarApersibimientosActionPerformed
        MuestraDatosllamadosDeEmergencias verdatosapersib = new MuestraDatosllamadosDeEmergencias();
        escritorio.add(verdatosapersib);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosapersib.getSize();
        verdatosapersib.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosapersib.show();
    }//GEN-LAST:event_smnuMostrarApersibimientosActionPerformed

    private void smnuAplicarApersibimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAplicarApersibimientoActionPerformed
        AltaDatosLlamadoEmergencia verdatosapersib = new AltaDatosLlamadoEmergencia();
        escritorio.add(verdatosapersib);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosapersib.getSize();
        verdatosapersib.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosapersib.show();
    }//GEN-LAST:event_smnuAplicarApersibimientoActionPerformed

    private void smnuModificarLisenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarLisenciasActionPerformed
        AdminDatosLisencias verdatoslisencia = new AdminDatosLisencias();
        escritorio.add(verdatoslisencia);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslisencia.getSize();
        verdatoslisencia.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslisencia.show();
    }//GEN-LAST:event_smnuModificarLisenciasActionPerformed

    private void smnuModificarSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarSegurosActionPerformed
        AdminDatosSeguro verdatosseguro = new AdminDatosSeguro();
        escritorio.add(verdatosseguro);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosseguro.getSize();
        verdatosseguro.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosseguro.show();
    }//GEN-LAST:event_smnuModificarSegurosActionPerformed

    private void smnuModifLibSanitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModifLibSanitActionPerformed
        AdminDatosLibSanit verdatoslibsanit = new AdminDatosLibSanit();
        escritorio.add(verdatoslibsanit);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslibsanit.getSize();
        verdatoslibsanit.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslibsanit.show();
    }//GEN-LAST:event_smnuModifLibSanitActionPerformed

    private void smnuMuestraLibSanitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraLibSanitActionPerformed
        MuestraDatosLibSanit verdatoslibsanit = new MuestraDatosLibSanit();
        escritorio.add(verdatoslibsanit);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslibsanit.getSize();
        verdatoslibsanit.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslibsanit.show();
    }//GEN-LAST:event_smnuMuestraLibSanitActionPerformed

    private void smnuModificaIomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificaIomaActionPerformed
        AdminDatosIoma verdatosioma = new AdminDatosIoma();
        escritorio.add(verdatosioma);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosioma.getSize();
        verdatosioma.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosioma.show();
    }//GEN-LAST:event_smnuModificaIomaActionPerformed

    private void smnuModificaMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificaMedicosActionPerformed
        AdminDatosMedicos verdatosmedicos = new AdminDatosMedicos();
        escritorio.add(verdatosmedicos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosmedicos.getSize();
        verdatosmedicos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosmedicos.show();
    }//GEN-LAST:event_smnuModificaMedicosActionPerformed

    private void smnuMuestraMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraMedicosActionPerformed
        MuestraDatosMedicos verdatosmedicos = new MuestraDatosMedicos();
        escritorio.add(verdatosmedicos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosmedicos.getSize();
        verdatosmedicos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosmedicos.show();
    }//GEN-LAST:event_smnuMuestraMedicosActionPerformed

    private void smnuMuestraFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraFamiliaresActionPerformed
        MuestraDatosFamiliares verdatosFamiliares = new MuestraDatosFamiliares();
        escritorio.add(verdatosFamiliares);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosFamiliares.getSize();
        verdatosFamiliares.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosFamiliares.show();
    }//GEN-LAST:event_smnuMuestraFamiliaresActionPerformed

    private void smnuModificaFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificaFamiliaresActionPerformed
        AdminDatosFamiliares verdatosfamiliares = new AdminDatosFamiliares();
        escritorio.add(verdatosfamiliares);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosfamiliares.getSize();
        verdatosfamiliares.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosfamiliares.show();
    }//GEN-LAST:event_smnuModificaFamiliaresActionPerformed

    private void smnuMuestraLaboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraLaboralesActionPerformed
        MuestraDatosLaborales verdatoslaborales = new MuestraDatosLaborales();
        escritorio.add(verdatoslaborales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslaborales.getSize();
        verdatoslaborales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslaborales.show();
    }//GEN-LAST:event_smnuMuestraLaboralesActionPerformed

    private void smnuModificaLaboralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificaLaboralesActionPerformed
        AdminDatosLaborales verdatoslaborales = new AdminDatosLaborales();
        escritorio.add(verdatoslaborales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslaborales.getSize();
        verdatoslaborales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslaborales.show();
    }//GEN-LAST:event_smnuModificaLaboralesActionPerformed

    private void smnuModificaInstitucionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificaInstitucionalesActionPerformed
        AdminDatosInstitucionales verDatosInstitucionales = new AdminDatosInstitucionales();
        escritorio.add(verDatosInstitucionales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verDatosInstitucionales.getSize();
        verDatosInstitucionales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verDatosInstitucionales.show();
    }//GEN-LAST:event_smnuModificaInstitucionalesActionPerformed

    private void smnuMuestraInstitucionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraInstitucionalesActionPerformed
        MuestraDatosInstitucionales verdatosinstit = new MuestraDatosInstitucionales();
        escritorio.add(verdatosinstit);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosinstit.getSize();
        verdatosinstit.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosinstit.show();
    }//GEN-LAST:event_smnuMuestraInstitucionalesActionPerformed

    private void smnuMuestraPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraPersonalActionPerformed
        MuestraDatosPersonales verdatospersonal = new MuestraDatosPersonales();
        escritorio.add(verdatospersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatospersonal.getSize();
        verdatospersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatospersonal.show();
    }//GEN-LAST:event_smnuMuestraPersonalActionPerformed

    private void smnuModificaPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificaPersonalActionPerformed
        AdminDatosPersonales verdatospersonal = new AdminDatosPersonales();
        escritorio.add(verdatospersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatospersonal.getSize();
        verdatospersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatospersonal.show();
    }//GEN-LAST:event_smnuModificaPersonalActionPerformed

    private void smnuAltaLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAltaLegajoActionPerformed
        AltaLegajoPersonal verdatospersona = new AltaLegajoPersonal();
        escritorio.add(verdatospersona);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatospersona.getSize();
        verdatospersona.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatospersona.show();
        
        /*AltaPersonalAyudantia verdatospersonal = new AltaPersonalAyudantia();
        escritorio.add(verdatospersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatospersonal.getSize();
        verdatospersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatospersonal.show();*/
    }//GEN-LAST:event_smnuAltaLegajoActionPerformed

    private void smnuGruposSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuGruposSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smnuGruposSemanaActionPerformed

    private void smnuImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuImprimirActionPerformed
        // Impresion verImprimir = new Impresion();
        // escritorio.add(verImprimir);
        //  verImprimir.show();
    }//GEN-LAST:event_smnuImprimirActionPerformed

    private void mnuExportarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExportarDatosActionPerformed
        ExportarDatos verExportarDatos = new ExportarDatos();
        escritorio.add(verExportarDatos);
        verExportarDatos.show();
    }//GEN-LAST:event_mnuExportarDatosActionPerformed

    private void smnuMostrarHistoricoPerosonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarHistoricoPerosonalActionPerformed
        MuestraEventosPersonal vereventospersonal = new MuestraEventosPersonal();
        escritorio.add(vereventospersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vereventospersonal.getSize();
        vereventospersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vereventospersonal.show();
    }//GEN-LAST:event_smnuMostrarHistoricoPerosonalActionPerformed

    private void smnuAltaNovedadPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAltaNovedadPersonalActionPerformed
        AltaEventosPersonal veraltaeventospersonal = new AltaEventosPersonal();
        escritorio.add(veraltaeventospersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veraltaeventospersonal.getSize();
        veraltaeventospersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veraltaeventospersonal.show();
    }//GEN-LAST:event_smnuAltaNovedadPersonalActionPerformed

    private void smnuModificarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarCursosActionPerformed
        AdminDatosCursos admindatoscursos = new AdminDatosCursos();
        escritorio.add(admindatoscursos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = admindatoscursos.getSize();
        admindatoscursos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        admindatoscursos.show();
    }//GEN-LAST:event_smnuModificarCursosActionPerformed

    private void smnuModificarInteresesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarInteresesActionPerformed
        AdminDatosIntereses admindatosintereses = new AdminDatosIntereses();
        escritorio.add(admindatosintereses);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = admindatosintereses.getSize();
        admindatosintereses.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        admindatosintereses.show();
    }//GEN-LAST:event_smnuModificarInteresesActionPerformed

    private void smnuModificarForForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarForForActionPerformed
        AdminDatosForFor admindatosforfor = new AdminDatosForFor();
        escritorio.add(admindatosforfor);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = admindatosforfor.getSize();
        admindatosforfor.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        admindatosforfor.show();
    }//GEN-LAST:event_smnuModificarForForActionPerformed

    private void smnuMuestraIomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMuestraIomaActionPerformed
        MuestraDatosIoma verdatosioma = new MuestraDatosIoma();
        escritorio.add(verdatosioma);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosioma.getSize();
        verdatosioma.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosioma.show();
    }//GEN-LAST:event_smnuMuestraIomaActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        MuestraDatosSeguros verdatoseguro = new MuestraDatosSeguros();
        escritorio.add(verdatoseguro);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoseguro.getSize();
        verdatoseguro.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoseguro.show();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void smnuMostrarLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarLicenciasActionPerformed
        MuestraDatosLisencias verdatoslisencia = new MuestraDatosLisencias();
        escritorio.add(verdatoslisencia);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslisencia.getSize();
        verdatoslisencia.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslisencia.show();
    }//GEN-LAST:event_smnuMostrarLicenciasActionPerformed

    private void smnuMostrarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarCursosActionPerformed
        MuestraDatosCursos verdatoscursos = new MuestraDatosCursos();
        escritorio.add(verdatoscursos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoscursos.getSize();
        verdatoscursos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoscursos.show();
    }//GEN-LAST:event_smnuMostrarCursosActionPerformed

    private void smnuMostrarInteresesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarInteresesActionPerformed
        MuestraDatosIntereses verdatosintereses = new MuestraDatosIntereses();
        escritorio.add(verdatosintereses);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosintereses.getSize();
        verdatosintereses.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosintereses.show();
    }//GEN-LAST:event_smnuMostrarInteresesActionPerformed

    private void smnuMostrarForForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarForForActionPerformed
        MuestraDatosForFor verdatosforfor = new MuestraDatosForFor();
        escritorio.add(verdatosforfor);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosforfor.getSize();
        verdatosforfor.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosforfor.show();
    }//GEN-LAST:event_smnuMostrarForForActionPerformed

    private void smnuMostrarFinancierosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarFinancierosActionPerformed
        MuestraDatosFinancieros verdatosfinancieros = new MuestraDatosFinancieros();
        escritorio.add(verdatosfinancieros);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosfinancieros.getSize();
        verdatosfinancieros.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosfinancieros.show();
    }//GEN-LAST:event_smnuMostrarFinancierosActionPerformed

    private void mnuAltaHistoriaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaHistoriaMaterialActionPerformed
        /*AltaHistoriaMateriales verTrazabilidadMateriales = new AltaHistoriaMateriales();
        escritorio.add(verTrazabilidadMateriales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verTrazabilidadMateriales.getSize();
        verTrazabilidadMateriales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verTrazabilidadMateriales.show();*/
    }//GEN-LAST:event_mnuAltaHistoriaMaterialActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        /*AdminHistoriaMateriales veradminhistoriamateriales = new AdminHistoriaMateriales();
        escritorio.add(veradminhistoriamateriales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veradminhistoriamateriales.getSize();
        veradminhistoriamateriales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veradminhistoriamateriales.show();*/
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void mnuBorrarHistoriaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBorrarHistoriaMaterialActionPerformed
        /*BajaHistoriaMateriales verbajahistoriamateriales = new BajaHistoriaMateriales();
        escritorio.add(verbajahistoriamateriales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verbajahistoriamateriales.getSize();
        verbajahistoriamateriales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verbajahistoriamateriales.show();*/
    }//GEN-LAST:event_mnuBorrarHistoriaMaterialActionPerformed

    private void mnuVerHistoriaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerHistoriaMaterialActionPerformed
        /*VerHistoriaMateriales verHistoriaMateriales = new VerHistoriaMateriales();
        escritorio.add(verHistoriaMateriales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verHistoriaMateriales.getSize();
        verHistoriaMateriales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verHistoriaMateriales.show();*/
    }//GEN-LAST:event_mnuVerHistoriaMaterialActionPerformed

    private void mnuHistoriaNovedadesMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHistoriaNovedadesMaterialesActionPerformed

    }//GEN-LAST:event_mnuHistoriaNovedadesMaterialesActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        /*AltaTareasSeccionMateriales verTareasMateriales = new AltaTareasSeccionMateriales();
        escritorio.add(verTareasMateriales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verTareasMateriales.getSize();
        verTareasMateriales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verTareasMateriales.show();*/
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        /*VerTareasSeccionMateriales vernuevatarea = new VerTareasSeccionMateriales();
        escritorio.add(vernuevatarea);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vernuevatarea.getSize();
        vernuevatarea.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vernuevatarea.show();*/
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        /*AdminTareasSeccionMateriales veradmintareasmateriales = new AdminTareasSeccionMateriales();
        escritorio.add(veradmintareasmateriales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veradmintareasmateriales.getSize();
        veradmintareasmateriales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veradmintareasmateriales.show();*/
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        /*BajaTareasSeccionMateriales vernuevatarea = new BajaTareasSeccionMateriales();
        escritorio.add(vernuevatarea);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vernuevatarea.getSize();
        vernuevatarea.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vernuevatarea.show();*/
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void smnuAltaCargaTubosERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAltaCargaTubosERAActionPerformed
        /*AltaCargaTubosERA veraltacargatubosera = new AltaCargaTubosERA();
        escritorio.add(veraltacargatubosera);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veraltacargatubosera.getSize();
        veraltacargatubosera.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veraltacargatubosera.show();*/
    }//GEN-LAST:event_smnuAltaCargaTubosERAActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        /*AdminDatosCargaTubosERA veradmincargatubos = new AdminDatosCargaTubosERA();
        escritorio.add(veradmincargatubos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veradmincargatubos.getSize();
        veradmincargatubos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veradmincargatubos.show();*/
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        /*BajaDatosCargaTubosERA verbajacargatubos = new BajaDatosCargaTubosERA();
        escritorio.add(verbajacargatubos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verbajacargatubos.getSize();
        verbajacargatubos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verbajacargatubos.show();*/
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        /*VerCargasDeTubosERA vercargatubos = new VerCargasDeTubosERA();
        escritorio.add(vercargatubos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vercargatubos.getSize();
        vercargatubos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vercargatubos.show();*/
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void mnuAltaMaterialInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaMaterialInventarioActionPerformed
        /*AltaMaterialInventario vernuevomaterial = new AltaMaterialInventario();
        escritorio.add(vernuevomaterial);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vernuevomaterial.getSize();
        vernuevomaterial.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vernuevomaterial.show();*/
    }//GEN-LAST:event_mnuAltaMaterialInventarioActionPerformed

    private void mnuBajaMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaMaterial1ActionPerformed
        /*BajaMaterialInventario verborramaterial = new BajaMaterialInventario();
        escritorio.add(verborramaterial);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verborramaterial.getSize();
        verborramaterial.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verborramaterial.show();*/
    }//GEN-LAST:event_mnuBajaMaterial1ActionPerformed

    private void mnuModificarMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificarMaterial1ActionPerformed
        /*AdminMaterialInventario veramaterial = new AdminMaterialInventario();
        escritorio.add(veramaterial);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veramaterial.getSize();
        veramaterial.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veramaterial.show();*/
    }//GEN-LAST:event_mnuModificarMaterial1ActionPerformed

    private void mnuConsultarMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarMaterial1ActionPerformed
        /*VerMaterialInventario veramaterial = new VerMaterialInventario();
        escritorio.add(veramaterial);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veramaterial.getSize();
        veramaterial.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veramaterial.show();*/
    }//GEN-LAST:event_mnuConsultarMaterial1ActionPerformed

    private void mnuAltaMaterialUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaMaterialUnidadActionPerformed
        /*AltaMaterialUnidad vernuevomaterialUnidad = new AltaMaterialUnidad();
        escritorio.add(vernuevomaterialUnidad);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vernuevomaterialUnidad.getSize();
        vernuevomaterialUnidad.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vernuevomaterialUnidad.show();*/
    }//GEN-LAST:event_mnuAltaMaterialUnidadActionPerformed

    private void mnuBorraMaterialUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBorraMaterialUnidadActionPerformed
        /*BajaMaterialUnidad verbajamaterialUnidad = new BajaMaterialUnidad();
        escritorio.add(verbajamaterialUnidad);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verbajamaterialUnidad.getSize();
        verbajamaterialUnidad.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verbajamaterialUnidad.show();*/
    }//GEN-LAST:event_mnuBorraMaterialUnidadActionPerformed

    private void mnuModificaMaterialUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificaMaterialUnidadActionPerformed
        /*AdminMaterialUnidad adminmaterialUnidad = new AdminMaterialUnidad();
        escritorio.add(adminmaterialUnidad);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = adminmaterialUnidad.getSize();
        adminmaterialUnidad.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        adminmaterialUnidad.show();*/
    }//GEN-LAST:event_mnuModificaMaterialUnidadActionPerformed

    private void mnuMuestraMaterialesUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuestraMaterialesUnidadActionPerformed
        /*VerMaterialUnidad muestramaterialUnidad = new VerMaterialUnidad();
        escritorio.add(muestramaterialUnidad);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = muestramaterialUnidad.getSize();
        muestramaterialUnidad.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        muestramaterialUnidad.show();*/
    }//GEN-LAST:event_mnuMuestraMaterialesUnidadActionPerformed

    private void mnuMaterialesUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMaterialesUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMaterialesUnidadesActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        /*AltaEquiposAutonomosERA vernuevoera = new AltaEquiposAutonomosERA();
        escritorio.add(vernuevoera);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = vernuevoera.getSize();
        vernuevoera.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        vernuevoera.show();*/
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        /*BajaEquiposAutonomosERA verbajaera = new BajaEquiposAutonomosERA();
        escritorio.add(verbajaera);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verbajaera.getSize();
        verbajaera.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verbajaera.show();*/
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        /*AdminEquiposAutonomosERA veradminera = new AdminEquiposAutonomosERA();
        escritorio.add(veradminera);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veradminera.getSize();
        veradminera.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veradminera.show();*/
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        /*VerEquiposAutonomosERA ververera = new VerEquiposAutonomosERA();
        escritorio.add(ververera);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = ververera.getSize();
        ververera.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ververera.show();*/
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        /*AltaExtintores veraltaextintor = new AltaExtintores();
        escritorio.add(veraltaextintor);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veraltaextintor.getSize();
        veraltaextintor.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veraltaextintor.show();*/
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        /*AdminExtintores veradminextintor = new AdminExtintores();
        escritorio.add(veradminextintor);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veradminextintor.getSize();
        veradminextintor.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veradminextintor.show();*/
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        /*BajaExtintores verbajaextintor = new BajaExtintores();
        escritorio.add(verbajaextintor);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verbajaextintor.getSize();
        verbajaextintor.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verbajaextintor.show();*/
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        /*VerExtintores ververextintor = new VerExtintores();
        escritorio.add(ververextintor);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = ververextintor.getSize();
        ververextintor.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ververextintor.show();*/
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void mnuEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEstadisticaActionPerformed
        /*EstadisticasMateriales verestadistica = new EstadisticasMateriales();
        escritorio.add(verestadistica);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verestadistica.getSize();
        verestadistica.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verestadistica.show();*/
    }//GEN-LAST:event_mnuEstadisticaActionPerformed

    private void smnuMostrarHistorialMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuMostrarHistorialMedicoActionPerformed
        MuestraHistorialMedico verhistorialmedico = new MuestraHistorialMedico();
        escritorio.add(verhistorialmedico);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verhistorialmedico.getSize();
        verhistorialmedico.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verhistorialmedico.show();
    }//GEN-LAST:event_smnuMostrarHistorialMedicoActionPerformed

    private void smnuAltaLibSanitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAltaLibSanitActionPerformed
        AltaDatosLibretaSanitaria verdatoslibsanit = new AltaDatosLibretaSanitaria();
        escritorio.add(verdatoslibsanit);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoslibsanit.getSize();
        verdatoslibsanit.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoslibsanit.show();
    }//GEN-LAST:event_smnuAltaLibSanitActionPerformed

    private void smnuAltaDatoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAltaDatoMedicoActionPerformed
        AltaHistorialMedico verdatosmedicos = new AltaHistorialMedico();
        escritorio.add(verdatosmedicos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosmedicos.getSize();
        verdatosmedicos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosmedicos.show();
    }//GEN-LAST:event_smnuAltaDatoMedicoActionPerformed

    private void smnuModificarHistMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarHistMedActionPerformed
        AdminDatosHistorialMedico verdatosmedicos = new AdminDatosHistorialMedico();
        escritorio.add(verdatosmedicos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosmedicos.getSize();
        verdatosmedicos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosmedicos.show();
    }//GEN-LAST:event_smnuModificarHistMedActionPerformed

    private void smnuModificarFinancierosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarFinancierosActionPerformed
        AdminDatosFinancieros verdatosfinancieros = new AdminDatosFinancieros();
        escritorio.add(verdatosfinancieros);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosfinancieros.getSize();
        verdatosfinancieros.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosfinancieros.show();
    }//GEN-LAST:event_smnuModificarFinancierosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MuestraDatosDocPersonal verdatosdocumentos = new MuestraDatosDocPersonal();
        escritorio.add(verdatosdocumentos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosdocumentos.getSize();
        verdatosdocumentos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosdocumentos.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MuestraDatosConductores verdatosconductores = new MuestraDatosConductores();
        escritorio.add(verdatosconductores);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosconductores.getSize();
        verdatosconductores.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosconductores.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AdminDocumentosPersonal verdatosdocumentos = new AdminDocumentosPersonal();
        escritorio.add(verdatosdocumentos);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosdocumentos.getSize();
        verdatosdocumentos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosdocumentos.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AdminDatosConductores verdatosconductores = new AdminDatosConductores();
        escritorio.add(verdatosconductores);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatosconductores.getSize();
        verdatosconductores.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatosconductores.show(); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        AltaDatosHistorialLaboral veraltaeventoslaborales = new AltaDatosHistorialLaboral();
        escritorio.add(veraltaeventoslaborales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veraltaeventoslaborales.getSize();
        veraltaeventoslaborales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veraltaeventoslaborales.show();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        MuestraDatosHistorialLaboral veraltaeventoslaborales = new MuestraDatosHistorialLaboral();
        escritorio.add(veraltaeventoslaborales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veraltaeventoslaborales.getSize();
        veraltaeventoslaborales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veraltaeventoslaborales.show();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        AdminDatosHistorialLaboral veraltaeventoslaborales = new AdminDatosHistorialLaboral();
        escritorio.add(veraltaeventoslaborales);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = veraltaeventoslaborales.getSize();
        veraltaeventoslaborales.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        veraltaeventoslaborales.show();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        AltaDatosLlamadoEmergencia verAltaDatosCursosPersonal = new AltaDatosLlamadoEmergencia();
        escritorio.add(verAltaDatosCursosPersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verAltaDatosCursosPersonal.getSize();
        verAltaDatosCursosPersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verAltaDatosCursosPersonal.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        AltaDatosDocumentoPersonal verAltaDatosDocumentoPersonal = new AltaDatosDocumentoPersonal();
        escritorio.add(verAltaDatosDocumentoPersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verAltaDatosDocumentoPersonal.getSize();
        verAltaDatosDocumentoPersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verAltaDatosDocumentoPersonal.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        AltaDatosLisencias verAltaDatosLisenciaPersonal = new AltaDatosLisencias();
        escritorio.add(verAltaDatosLisenciaPersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verAltaDatosLisenciaPersonal.getSize();
        verAltaDatosLisenciaPersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verAltaDatosLisenciaPersonal.show();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        AltaDatosEstudiosPersonal verAltaDatosEstudiosPersonal = new AltaDatosEstudiosPersonal();
        escritorio.add(verAltaDatosEstudiosPersonal);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verAltaDatosEstudiosPersonal.getSize();
        verAltaDatosEstudiosPersonal.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verAltaDatosEstudiosPersonal.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void smnuAltaDatosHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAltaDatosHijosActionPerformed
        AltaDatosHijos verdatoshijo = new AltaDatosHijos();
        escritorio.add(verdatoshijo);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoshijo.getSize();
        verdatoshijo.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoshijo.show();
    }//GEN-LAST:event_smnuAltaDatosHijosActionPerformed

    private void smnuVerDatosHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuVerDatosHijosActionPerformed
        MuestraDatosHijos verdatoshijo = new MuestraDatosHijos();
        escritorio.add(verdatoshijo);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoshijo.getSize();
        verdatoshijo.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoshijo.show();
    }//GEN-LAST:event_smnuVerDatosHijosActionPerformed

    private void smnuModificarDatosHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuModificarDatosHijosActionPerformed
        AdminDatosHijos verdatoshijo = new AdminDatosHijos();
        escritorio.add(verdatoshijo);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoshijo.getSize();
        verdatoshijo.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoshijo.show();
    }//GEN-LAST:event_smnuModificarDatosHijosActionPerformed

    private void smnuBorrarDatosHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuBorrarDatosHijosActionPerformed
        BorraDatosLlamadoEmergencia verdatoshijo = new BorraDatosLlamadoEmergencia();
        escritorio.add(verdatoshijo);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verdatoshijo.getSize();
        verdatoshijo.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        verdatoshijo.show();
    }//GEN-LAST:event_smnuBorrarDatosHijosActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalEmergencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalEmergencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalEmergencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalEmergencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalEmergencias().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jAcercaDe;
    private javax.swing.JMenuItem jArchivoSalir;
    private javax.swing.JMenuItem jAyudas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jProvAltaProveedor;
    private javax.swing.JMenuItem jProvBajaProveedor;
    private javax.swing.JMenuItem jProvModProveedor;
    private javax.swing.JMenuItem jProvMostrarProveedor;
    private javax.swing.JMenuItem jPruebaConect;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
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
    private javax.swing.JMenuItem mnuAltaHistoriaMaterial;
    private javax.swing.JMenuItem mnuAltaMaterialInventario;
    private javax.swing.JMenuItem mnuAltaMaterialUnidad;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuBajaMaquina;
    private javax.swing.JMenuItem mnuBajaMaterial1;
    private javax.swing.JMenu mnuBitacoraTareas;
    private javax.swing.JMenuItem mnuBorraMaterialUnidad;
    private javax.swing.JMenuItem mnuBorrarHistoriaMaterial;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuConsultarMaterial1;
    private javax.swing.JMenuItem mnuEstadistica;
    private javax.swing.JMenuItem mnuExportarDatos;
    private javax.swing.JMenu mnuExtintores;
    private javax.swing.JMenu mnuGerencia;
    private javax.swing.JMenu mnuGuardia;
    private javax.swing.JMenu mnuHistoriaNovedadesMateriales;
    private javax.swing.JMenu mnuHistorialMedico;
    private javax.swing.JMenu mnuInventarioGeneralMateriales;
    private javax.swing.JMenu mnuLibretaSanitaria;
    private javax.swing.JMenuItem mnuLibroMaquinas;
    private javax.swing.JMenu mnuMaquinas;
    private javax.swing.JMenu mnuMateriales;
    private javax.swing.JMenu mnuMaterialesGruposEspeciales;
    private javax.swing.JMenu mnuMaterialesUnidades;
    private javax.swing.JMenuItem mnuModificaMaquina;
    private javax.swing.JMenuItem mnuModificaMaterialUnidad;
    private javax.swing.JMenuItem mnuModificarMaterial1;
    private javax.swing.JMenuItem mnuMuestraMaterialesUnidad;
    private javax.swing.JMenuItem mnuNuevaMaquina;
    private javax.swing.JMenu mnuOficinaTecnica;
    private javax.swing.JMenu mnuPersonal;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuSuministros;
    private javax.swing.JMenu mnuVer;
    private javax.swing.JMenuItem mnuVerHistoriaMaterial;
    private javax.swing.JMenu sMnuBancarizacion;
    private javax.swing.JMenuItem sbmnuDatosCuartel;
    private javax.swing.JMenu sbmnuEmergencias;
    private javax.swing.JMenu sbmnuNovedades;
    private javax.swing.JMenu sbmnuPartesDeServicio;
    private javax.swing.JMenuItem sbmnuReporteHoras;
    private javax.swing.JMenu sbmnuServicios;
    private javax.swing.JMenuItem smnuAltaCargaTubosERA;
    private javax.swing.JMenuItem smnuAltaDatoMedico;
    private javax.swing.JMenuItem smnuAltaDatosHijos;
    private javax.swing.JMenuItem smnuAltaLegajo;
    private javax.swing.JMenuItem smnuAltaLibSanit;
    private javax.swing.JMenuItem smnuAltaNovedadPersonal;
    private javax.swing.JMenuItem smnuAplicarApersibimiento;
    private javax.swing.JMenuItem smnuAplicarSancion;
    private javax.swing.JMenuItem smnuBorrarDatosHijos;
    private javax.swing.JMenu smnuDatosFamiliares;
    private javax.swing.JMenu smnuDatosHijos;
    private javax.swing.JMenu smnuDatosMedicos;
    private javax.swing.JMenuItem smnuGruposSemana;
    private javax.swing.JMenuItem smnuImprimir;
    private javax.swing.JMenu smnuIoma;
    private javax.swing.JMenu smnuLegajos;
    private javax.swing.JMenu smnuLibretaSanitaria;
    private javax.swing.JMenu smnuLisencias;
    private javax.swing.JMenu smnuMasTareas;
    private javax.swing.JMenu smnuMedidasDisciplinarias;
    private javax.swing.JMenuItem smnuModifLibSanit;
    private javax.swing.JMenuItem smnuModificaFamiliares;
    private javax.swing.JMenuItem smnuModificaInstitucionales;
    private javax.swing.JMenuItem smnuModificaIoma;
    private javax.swing.JMenuItem smnuModificaLaborales;
    private javax.swing.JMenuItem smnuModificaMedicos;
    private javax.swing.JMenuItem smnuModificaPersonal;
    private javax.swing.JMenuItem smnuModificarCursos;
    private javax.swing.JMenuItem smnuModificarDatosHijos;
    private javax.swing.JMenuItem smnuModificarFinancieros;
    private javax.swing.JMenuItem smnuModificarForFor;
    private javax.swing.JMenuItem smnuModificarHistMed;
    private javax.swing.JMenuItem smnuModificarIntereses;
    private javax.swing.JMenuItem smnuModificarLisencias;
    private javax.swing.JMenuItem smnuModificarSeguros;
    private javax.swing.JMenuItem smnuMostrarApersibimientos;
    private javax.swing.JMenuItem smnuMostrarCursos;
    private javax.swing.JMenuItem smnuMostrarFinancieros;
    private javax.swing.JMenuItem smnuMostrarForFor;
    private javax.swing.JMenuItem smnuMostrarHistorialMedico;
    private javax.swing.JMenuItem smnuMostrarHistoricoPerosonal;
    private javax.swing.JMenuItem smnuMostrarIntereses;
    private javax.swing.JMenuItem smnuMostrarLicencias;
    private javax.swing.JMenuItem smnuMostrarSanciones;
    private javax.swing.JMenu smnuMostrarSeguros;
    private javax.swing.JMenuItem smnuMuestraFamiliares;
    private javax.swing.JMenuItem smnuMuestraInstitucionales;
    private javax.swing.JMenuItem smnuMuestraIoma;
    private javax.swing.JMenuItem smnuMuestraLaborales;
    private javax.swing.JMenuItem smnuMuestraLibSanit;
    private javax.swing.JMenuItem smnuMuestraMedicos;
    private javax.swing.JMenuItem smnuMuestraPersonal;
    private javax.swing.JMenuItem smnuOrdenDia;
    private javax.swing.JMenu smnuPersonal;
    private javax.swing.JMenuItem smnuVerDatosHijos;
    // End of variables declaration//GEN-END:variables

    

   
}
