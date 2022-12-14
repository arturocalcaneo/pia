package pia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.google.gson.Gson;
import java.awt.EventQueue;

/**
 *
 * @author HP
 */
public class Habitaciones extends javax.swing.JFrame {
    
    private final modelos.Habitaciones mHabitaciones= new modelos.Habitaciones();
    
    private final Gson gson= new Gson();
    private Dashboard dash= new Dashboard();

    /**
     * Creates new form Habitaciones
     */
    public Habitaciones() {
        initComponents();
        setTitle("Gestión de Habitaciones | Hotelería");
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        EventQueue.invokeLater(() -> {
            this.panelHabitaciones.remove(this.labelCargando);
            this.cargarHabitaciones();
        });
    }
    
    private void cargarHabitaciones(){
        // Consultar lista de habitaciones
        var habitaciones= mHabitaciones.consultarHabitaciones();
        
        // Establecer cantidad de filas en GridLayout del Panel de Habitaciones
        var gridLayout= new java.awt.GridLayout();
        gridLayout.setRows(habitaciones.size() + 1);
        gridLayout.setColumns(0);
        gridLayout.setVgap(10);
        
        panelHabitaciones.setLayout(gridLayout);
        
        for(int i=0; i < habitaciones.size(); i++){
            /**
              * Convertir JSON de Habitación a su respectiva Clase.
             */
            String jsonHabitacion= gson.toJson(habitaciones.get(i));
            var habitacion= gson.fromJson(jsonHabitacion, modelos.Habitaciones.class);
            /**
              * Representar datos de la habitación con su respectivo componente.
             */
            var panelHabitacion= new pia.componentes.PanelHabitacion();
            
                panelHabitacion.setCLAVE_CATHAB( habitacion.getCLAVE_CATHAB() );
                panelHabitacion.setTITULO( habitacion.getTIPO_HABIT() );
                panelHabitacion.setPRECIO( habitacion.getPRECIO() );
                
                // Evento del Botón "Ver Habitacion"
                panelHabitacion.getVerHabitacion().addActionListener((e) -> {
                    VerHabitacion vistaHabitacion= new VerHabitacion();
                    vistaHabitacion.setVisible(true);

                    vistaHabitacion.setInfoHabitacion( habitacion );
                });
                
                if( habitacion.getESTATUS_CATHAB() == 0 ){
                    // Evento del Botón "Asignar Habitación"
                    panelHabitacion.getAsignarHuesped().addActionListener((e)->{
                        Reservacion reserv= new Reservacion();
                                    reserv.setVisible(true);
                    });
                }else{
                    panelHabitacion.getAsignarHuesped().setEnabled(false);
                }
                
            this.panelHabitaciones.add(panelHabitacion);
        }
    }

    // Este metodo se usa en la clase Dashboard para manipularse desde esta clase "Habitaciones"
    public void setDash(Dashboard dash) {
        this.dash = dash;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelHabitaciones = new javax.swing.JPanel();
        labelCargando = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Source Serif Pro Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("HABITACIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 630, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f7466070eb37c5755385a73515ee5844.jpg"))); // NOI18N
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 0, 10));

        jScrollPane1.setBorder(null);

        panelHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelHabitaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(24, 0, 0, 0));
        panelHabitaciones.setLayout(new java.awt.GridLayout(3, 0));

        labelCargando.setFont(new java.awt.Font("Calibri Light", 2, 44)); // NOI18N
        labelCargando.setForeground(new java.awt.Color(234, 234, 234));
        labelCargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargando.setText("Cargando...");
        panelHabitaciones.add(labelCargando);

        jScrollPane1.setViewportView(panelHabitaciones);

        jPanel3.add(jScrollPane1);

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 630, 410));

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 630, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dash.getBtnGestionarHabitaciones().setEnabled(true);
        
        this.dash.getMenuItemNuevaHabitacion().setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCargando;
    private javax.swing.JPanel panelHabitaciones;
    // End of variables declaration//GEN-END:variables
}
