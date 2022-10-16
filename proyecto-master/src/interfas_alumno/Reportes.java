/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author liooficial
 */
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Reportes(final String nom) {
        initComponents(); 
        lb_nombreDelUsuario.setText(nom);
        llenar((String) cb_tipo.getSelectedItem());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principal = new javax.swing.JPanel();
        pn_menuLateral = new javax.swing.JPanel();
        pn_rojo = new javax.swing.JPanel();
        lb_usuario = new javax.swing.JLabel();
        lb_nombreDelUsuario = new javax.swing.JLabel();
        lb_usuarioImg = new javax.swing.JLabel();
        lb_logoImg = new javax.swing.JLabel();
        bt_administrar_Horarios = new javax.swing.JToggleButton();
        bt_administrar_Usuarios = new javax.swing.JToggleButton();
        bt_rondines = new javax.swing.JToggleButton();
        bt_inventario = new javax.swing.JToggleButton();
        bt_notificaciones = new javax.swing.JToggleButton();
        bt_reportes = new javax.swing.JButton();
        panelRound1 = new Clases.PanelRound();
        bt_generarReporte = new javax.swing.JButton();
        cb_tipo = new javax.swing.JComboBox<>();
        cb_tipoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_extra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date_inicio = new com.toedter.calendar.JDateChooser();
        date_fin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_menuLateral.setBackground(new java.awt.Color(255, 255, 255));
        pn_menuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_rojo.setBackground(new java.awt.Color(107, 8, 48));
        pn_rojo.setForeground(new java.awt.Color(255, 0, 153));

        lb_usuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuario.setText("usuario:");

        lb_nombreDelUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_nombreDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombreDelUsuario.setText("Administrador");

        lb_usuarioImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrador.png"))); // NOI18N

        javax.swing.GroupLayout pn_rojoLayout = new javax.swing.GroupLayout(pn_rojo);
        pn_rojo.setLayout(pn_rojoLayout);
        pn_rojoLayout.setHorizontalGroup(
            pn_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_rojoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_usuarioImg, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_rojoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lb_usuario))
                    .addGroup(pn_rojoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lb_nombreDelUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_rojoLayout.setVerticalGroup(
            pn_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_rojoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_nombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(pn_rojoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_usuarioImg, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_menuLateral.add(pn_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 350, 160));

        lb_logoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isc350X140.png"))); // NOI18N
        pn_menuLateral.add(lb_logoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 140));

        bt_administrar_Horarios.setBackground(new java.awt.Color(255, 255, 255));
        bt_administrar_Horarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administrar_Horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario60X60.png"))); // NOI18N
        bt_administrar_Horarios.setText("   Administrar horarios");
        bt_administrar_Horarios.setBorder(null);
        bt_administrar_Horarios.setContentAreaFilled(false);
        bt_administrar_Horarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_administrar_Horarios.setFocusPainted(false);
        bt_administrar_Horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administrar_HorariosActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_administrar_Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 60));

        bt_administrar_Usuarios.setBackground(new java.awt.Color(204, 204, 204));
        bt_administrar_Usuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administrar_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grupo-de-usuarios60X60.png"))); // NOI18N
        bt_administrar_Usuarios.setText("   Administrar usuarios");
        bt_administrar_Usuarios.setContentAreaFilled(false);
        bt_administrar_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_administrar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administrar_UsuariosActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_administrar_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 350, 60));

        bt_rondines.setBackground(new java.awt.Color(255, 255, 255));
        bt_rondines.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_rondines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ronda60X60.png"))); // NOI18N
        bt_rondines.setText("Rondines                   ");
        bt_rondines.setContentAreaFilled(false);
        bt_rondines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_rondines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rondinesActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_rondines, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 350, 60));

        bt_inventario.setBackground(new java.awt.Color(255, 255, 255));
        bt_inventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_notificaciones.setContentAreaFilled(false);
        bt_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario60X60.png"))); // NOI18N
        bt_inventario.setText(" Inventario                ");
        bt_inventario.setBorder(null);
        bt_inventario.setBorderPainted(false);
        bt_inventario.setContentAreaFilled(false);
        bt_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inventarioActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 350, 60));

        bt_notificaciones.setBackground(new java.awt.Color(255, 255, 255));
        bt_notificaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correo60X60.png"))); // NOI18N
        bt_notificaciones.setText("Notificaciones             ");
        bt_notificaciones.setContentAreaFilled(false);
        bt_notificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_notificacionesActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_notificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 350, 60));

        bt_reportes.setBackground(new java.awt.Color(204, 204, 204));
        bt_reportes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte2_60X60.png"))); // NOI18N
        bt_reportes.setText("Reportes                     ");
        bt_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reportesActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 360, 59));

        pn_principal.add(pn_menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 762));

        panelRound1.setBackground(new java.awt.Color(107, 8, 48));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        bt_generarReporte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bt_generarReporte.setForeground(new java.awt.Color(255, 255, 255));
        bt_generarReporte.setText("generar reporte");
        bt_generarReporte.setContentAreaFilled(false);
        bt_generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_generarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_generarReporte)
                .addGap(18, 18, 18))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_generarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pn_principal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 648, 233, -1));

        cb_tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos", "Salones", "Profesores", "Equipo" }));
        cb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoItemStateChanged(evt);
            }
        });
        pn_principal.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        cb_tipoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb_tipoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pn_principal.add(cb_tipoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 512, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Reportes");
        pn_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Tipo:");
        pn_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 431, -1, -1));

        lb_extra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_extra.setText("jLabel2");
        pn_principal.add(lb_extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 431, 290, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Fecha de inicio");
        pn_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 141, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Fecha de fin");
        pn_principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 141, -1, -1));

        date_inicio.setBackground(new java.awt.Color(255, 255, 255));
        date_inicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pn_principal.add(date_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 201, 56));

        date_fin.setBackground(new java.awt.Color(255, 255, 255));
        date_fin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pn_principal.add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 240, 201, 56));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_administrar_HorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administrar_HorariosActionPerformed
        Administrar_horario2 ventana = new Administrar_horario2(lb_nombreDelUsuario.getText() );
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_administrar_HorariosActionPerformed

    private void bt_administrar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administrar_UsuariosActionPerformed
        Usuarios ventana = new Usuarios( );
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_administrar_UsuariosActionPerformed

    private void bt_rondinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rondinesActionPerformed
        Rondines ventana = new Rondines(lb_nombreDelUsuario.getText() );
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_rondinesActionPerformed

    private void bt_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_notificacionesActionPerformed
        Notificaciones ventana = new Notificaciones( );
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_notificacionesActionPerformed

    private void bt_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inventarioActionPerformed
        Inventario ventana = new Inventario(lb_nombreDelUsuario.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_inventarioActionPerformed

    private void bt_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reportesActionPerformed
        Reportes ventana = new Reportes(lb_nombreDelUsuario.getText() );
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_reportesActionPerformed

    private void bt_generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_generarReporteActionPerformed
        
        cb_tipo.getSelectedItem();
        cb_tipoc.getSelectedItem();
    }//GEN-LAST:event_bt_generarReporteActionPerformed

    private void cb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoItemStateChanged
        llenar((String) cb_tipo.getSelectedItem());
    }//GEN-LAST:event_cb_tipoItemStateChanged
    
    
    
    //aqui se llenan el combobox de tipo equipo
    private ArrayList<Integer> llena_equ() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  laboratorios =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Id FROM Equipos");
            while (rs.next()) {
                laboratorios.add(rs.getString("Id"));
            }
        } catch (SQLException ex) {
            
        }
        return laboratorios;
    }
    private void llenar_Equipos(){
        ArrayList equipos = llena_equ();
        try {
            cb_tipoc.removeAllItems();
                 for (int i = 0; i <= equipos.size(); i++) {
                cb_tipoc.addItem(equipos.get(i).toString());
            }
        } catch (Exception ex) {
          
        }
    }
    
    //aqui se llenan el combobox de tipo equipo
    private ArrayList<Integer> llena_alum() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  laboratorios =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Nombre FROM Usuarios WHERE TipoUsuario='Estudiante'");
            while (rs.next()) {
                laboratorios.add(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
           
        }
        return laboratorios;
    }
    private void llenar_Alumnos(){
        ArrayList equipos = llena_alum();
        try {
            cb_tipoc.removeAllItems();
                 for (int i = 0; i <= equipos.size(); i++) {
                cb_tipoc.addItem(equipos.get(i).toString());
            }
        } catch (Exception ex) {
           
        }
    }
    //aqui se llenan el combobox de tipo salones
    private ArrayList<Integer> llena_Salone() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  laboratorios =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Id FROM Salones");
            while (rs.next()) {
                laboratorios.add(rs.getString("Id"));
            }
        } catch (SQLException ex) {
            
        }
        return laboratorios;
    }
    private void llenar_Salones(){
        ArrayList equipos = llena_Salone();
        try {
            cb_tipoc.removeAllItems();
                 for (int i = 0; i <= equipos.size(); i++) {
                cb_tipoc.addItem(equipos.get(i).toString());
            }
        } catch (Exception ex) {
            
        }
    }
    //aqui se llenan el combobox de tipo equipo
    private ArrayList<Integer> llena_Profesore() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  laboratorios =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Nombre FROM Usuarios WHERE TipoUsuario='Docente'");
            while (rs.next()) {
                laboratorios.add(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {
           
        }
        return laboratorios;
    }
    private void llenar_Profesores(){
        ArrayList equipos = llena_Profesore();
        try {
            cb_tipoc.removeAllItems();
                 for (int i = 0; i <= equipos.size(); i++) {
                cb_tipoc.addItem(equipos.get(i).toString());
            }
        } catch (Exception ex) {
            
        }
    }
    
    
    
    
    
    private void llenar(String c){
    switch (c) { 
    case "Alumnos":
     lb_extra.setText("Seleciona el Alumnos:");
     llenar_Alumnos();
     break;
    case "Salones":
     lb_extra.setText("Seleciona el Salones:");
     llenar_Salones();
     break;
    case "Profesores":
     lb_extra.setText("Seleciona al Profesores:");
     llenar_Profesores();
     break;
     case "Equipo": 
     lb_extra.setText("Seleciona el equipo:");
     llenar_Equipos( );
     break;
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bt_administrar_Horarios;
    private javax.swing.JToggleButton bt_administrar_Usuarios;
    private javax.swing.JButton bt_generarReporte;
    private javax.swing.JToggleButton bt_inventario;
    private javax.swing.JToggleButton bt_notificaciones;
    private javax.swing.JButton bt_reportes;
    private javax.swing.JToggleButton bt_rondines;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JComboBox<String> cb_tipoc;
    private com.toedter.calendar.JDateChooser date_fin;
    private com.toedter.calendar.JDateChooser date_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_extra;
    private javax.swing.JLabel lb_logoImg;
    private javax.swing.JLabel lb_nombreDelUsuario;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JLabel lb_usuarioImg;
    private Clases.PanelRound panelRound1;
    private javax.swing.JPanel pn_menuLateral;
    private javax.swing.JPanel pn_principal;
    private javax.swing.JPanel pn_rojo;
    // End of variables declaration//GEN-END:variables
}
