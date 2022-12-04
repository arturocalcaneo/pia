/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pia;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelos.Habitaciones;

/**
 *
 * @author HP
 */
public class AlterarDatosHabitacion extends javax.swing.JFrame {

    /**
     * Creates new form registrohabitaciones
     */
    public AlterarDatosHabitacion() {
        initComponents();
        setTitle("Nueva Habitacion | Hotelería");
        this.setLocationRelativeTo(null);
        
        EventQueue.invokeLater(() -> cargarDatosHabitacion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinnerPiso = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        boxEstadoHabitacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        boxTipoHabitacion = new javax.swing.JComboBox<>();
        textPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Piso");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo de Habitación");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripción");

        textAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        textAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(textAreaDescripcion);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio");

        boxEstadoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        boxEstadoHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        boxEstadoHabitacion.setMaximumRowCount(2);
        boxEstadoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liberada", "Ocupada" }));
        boxEstadoHabitacion.setToolTipText("");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado de la Habitación");

        btnGuardar.setBackground(new java.awt.Color(0, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        boxTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        boxTipoHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        boxTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Dobles", "Cuádruples", "Matrimonial", "Otro" }));

        textPrecio.setBackground(new java.awt.Color(255, 255, 255));
        textPrecio.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(boxTipoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxEstadoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEstadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatosHabitacion(){
        this.spinnerPiso.setValue( this.infoHabitacion.getPISO() );
        this.boxTipoHabitacion.setSelectedItem( this.infoHabitacion.getTIPO_HABIT() );
        this.textAreaDescripcion.setText( this.infoHabitacion.getTIPO_HABIT_OTRO_DESCRIPCION() );
        this.textPrecio.setText( String.valueOf( (float)this.infoHabitacion.getPRECIO() ) );
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private modelos.Habitaciones infoHabitacion= new modelos.Habitaciones();
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        modelos.Habitaciones habs= new modelos.Habitaciones();
        
        habs.setCLAVE_CATHAB( this.infoHabitacion.getCLAVE_CATHAB() );
        habs.setPISO( (int)this.spinnerPiso.getValue() );
        habs.setTIPO_HABIT((String) this.boxTipoHabitacion.getSelectedItem());
        habs.setTIPO_HABIT_OTRO_DESCRIPCION( this.textAreaDescripcion.getText() );
        habs.setPRECIO( Float.parseFloat( this.textPrecio.getText() ) );
        habs.setESTATUS_CATHAB( obtenerEstadoHabitacionComboBox() );
        
        // Si la clave de habitacion auxiliar es "-1" --> INSERTAR
        if(this.infoHabitacion.getCLAVE_CATHAB() == -1){
            if(habs.crearHabitacion()){
                JOptionPane.showMessageDialog(this.jPanel1, "La habitación ha sido creada con éxito.", "Habitación Creada", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(this.infoHabitacion.getCLAVE_CATHAB() > -1){ // MODIFICAR
            var respuesta= habs.actualizarHabitacion();
            System.out.println(respuesta);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private Byte obtenerEstadoHabitacionComboBox(){
        switch(String.valueOf( this.boxEstadoHabitacion.getSelectedItem() ).toLowerCase()){
            case "liberada":
                return 0;
            default:
                return 1;
        }
    }

    public void setInfoHabitacion(Habitaciones infoHabitacion) {
        this.infoHabitacion = infoHabitacion;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstadoHabitacion;
    private javax.swing.JComboBox<String> boxTipoHabitacion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerPiso;
    private javax.swing.JTextArea textAreaDescripcion;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}