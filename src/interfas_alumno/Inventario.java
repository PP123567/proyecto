/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author liooficial
 */
public class Inventario extends javax.swing.JFrame {

    
    public Inventario(final String nom) {
        initComponents();
        lb_nombreDelUsuario.setText(nom);
        llenar_laboratorios();
        llenar_Equipos();
        rsscalelabel.RSScaleLabel.setScaleLabel(lb_computadoraimg,"src/img/Computadora_Inventario.png");  
        rsscalelabel.RSScaleLabel.setScaleLabel(lb_fondoimg,"src/img/fondopc.png");     
    }

    
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
        bt_reportes = new javax.swing.JToggleButton();
        bt_rondines = new javax.swing.JToggleButton();
        bt_inventario = new javax.swing.JToggleButton();
        bt_notificaciones = new javax.swing.JToggleButton();
        lb_inventario = new javax.swing.JLabel();
        pn_gris = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_fondoimg = new javax.swing.JLabel();
        lb_computadoraimg = new javax.swing.JLabel();
        lb_caracteristicas = new javax.swing.JLabel();
        cb_laboratorios = new javax.swing.JComboBox<>();
        lb_laboratorios = new javax.swing.JLabel();
        lb_equipoDeComputo = new javax.swing.JLabel();
        cb_equipoDeComputo = new javax.swing.JComboBox<>();
        bt_consultar = new javax.swing.JToggleButton();
        bt_limpiar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));

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
        bt_administrar_Horarios.setText(" Administrar horarios");
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

        bt_administrar_Usuarios.setBackground(new java.awt.Color(255, 255, 255));
        bt_administrar_Usuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administrar_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grupo-de-usuarios60X60.png"))); // NOI18N
        bt_administrar_Usuarios.setText("Administrar usuarios");
        bt_administrar_Usuarios.setContentAreaFilled(false);
        bt_administrar_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_administrar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administrar_UsuariosActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_administrar_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 350, 60));

        bt_reportes.setBackground(new java.awt.Color(255, 255, 255));
        bt_reportes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte2_60X60.png"))); // NOI18N
        bt_reportes.setText("Reportes                ");
        bt_reportes.setContentAreaFilled(false);
        bt_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reportesActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 350, 60));

        bt_rondines.setBackground(new java.awt.Color(255, 255, 255));
        bt_rondines.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_rondines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ronda60X60.png"))); // NOI18N
        bt_rondines.setText("Rondines                 ");
        bt_rondines.setContentAreaFilled(false);
        bt_rondines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_rondines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rondinesActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_rondines, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 350, 60));

        bt_inventario.setBackground(new java.awt.Color(204, 204, 204));
        bt_inventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario60X60.png"))); // NOI18N
        bt_inventario.setText(" Inventario           ");
        bt_inventario.setBorder(null);
        bt_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inventarioActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 350, 60));

        bt_notificaciones.setBackground(new java.awt.Color(255, 255, 255));
        bt_notificaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correo60X60.png"))); // NOI18N
        bt_notificaciones.setText("Notificaciones        ");
        bt_notificaciones.setContentAreaFilled(false);
        bt_notificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_notificacionesActionPerformed(evt);
            }
        });
        pn_menuLateral.add(bt_notificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 350, 60));

        lb_inventario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_inventario.setText("Inventario");

        pn_gris.setBackground(new java.awt.Color(204, 204, 204));
        pn_gris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pn_gris.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 330, 30));

        lb_fondoimg.setBackground(new java.awt.Color(204, 204, 204));
        pn_gris.add(lb_fondoimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 350, 150));

        lb_computadoraimg.setBackground(new java.awt.Color(204, 204, 204));
        pn_gris.add(lb_computadoraimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 370, 270));

        lb_caracteristicas.setBackground(new java.awt.Color(204, 204, 204));
        lb_caracteristicas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_caracteristicas.setText(" ");
        pn_gris.add(lb_caracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 330, 210));

        cb_laboratorios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_laboratorios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_laboratorios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_laboratoriosItemStateChanged(evt);
            }
        });

        lb_laboratorios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_laboratorios.setText("Laboratorio:");

        lb_equipoDeComputo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_equipoDeComputo.setText("Equipo de computo:");

        cb_equipoDeComputo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_equipoDeComputo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bt_consultar.setBackground(new java.awt.Color(107, 8, 48));
        bt_consultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_consultar.setText("Consultar");
        bt_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarActionPerformed(evt);
            }
        });

        bt_limpiar.setBackground(new java.awt.Color(107, 8, 48));
        bt_limpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_limpiar.setText("Limpiar");
        bt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_principalLayout = new javax.swing.GroupLayout(pn_principal);
        pn_principal.setLayout(pn_principalLayout);
        pn_principalLayout.setHorizontalGroup(
            pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addComponent(pn_menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_principalLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_principalLayout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(lb_inventario))
                            .addGroup(pn_principalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lb_laboratorios)
                                .addGap(19, 19, 19)
                                .addComponent(cb_laboratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232)
                                .addComponent(lb_equipoDeComputo)
                                .addGap(21, 21, 21)
                                .addComponent(cb_equipoDeComputo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pn_gris, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_principalLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(bt_consultar)
                        .addGap(281, 281, 281)
                        .addComponent(bt_limpiar)))
                .addGap(60, 60, 60))
        );
        pn_principalLayout.setVerticalGroup(
            pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_principalLayout.createSequentialGroup()
                .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_principalLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lb_inventario)
                        .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_principalLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_laboratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_equipoDeComputo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_principalLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_laboratorios)
                                            .addComponent(lb_equipoDeComputo))))
                                .addGap(123, 123, 123)
                                .addComponent(pn_gris, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 99, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_consultar)
                                    .addComponent(bt_limpiar))
                                .addGap(20, 20, 20))))
                    .addComponent(pn_menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_administrar_HorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administrar_HorariosActionPerformed
        Administrar_horario2 ventana = new Administrar_horario2( lb_nombreDelUsuario.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_administrar_HorariosActionPerformed

    private void bt_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reportesActionPerformed
        Reportes ventana = new Reportes( lb_nombreDelUsuario.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_reportesActionPerformed

    private void bt_administrar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administrar_UsuariosActionPerformed
        Usuarios ventana = new Usuarios( );
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_administrar_UsuariosActionPerformed

    private void bt_rondinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rondinesActionPerformed
       Rondines ventana = new Rondines( lb_nombreDelUsuario.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_rondinesActionPerformed

    private void bt_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_notificacionesActionPerformed
        Notificaciones ventana = new Notificaciones( );
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_notificacionesActionPerformed

    private void bt_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarActionPerformed
        consulta();
    }//GEN-LAST:event_bt_consultarActionPerformed

    private void bt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarActionPerformed
        lb_caracteristicas.setText("");
        jLabel2.setText("");
    }//GEN-LAST:event_bt_limpiarActionPerformed

    private void bt_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inventarioActionPerformed
        Inventario ventana = new Inventario( lb_nombreDelUsuario.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_inventarioActionPerformed

    private void cb_laboratoriosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_laboratoriosItemStateChanged
        llenar_Equipos();
    }//GEN-LAST:event_cb_laboratoriosItemStateChanged
    //aqui se llenan el combobox de laboratorios
    private ArrayList<Integer> llena_lab() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  laboratorios =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Id FROM Salones ");
            while (rs.next()) {
                laboratorios.add(rs.getString("Id"));
            }
        } catch (SQLException ex) {
        }
        return laboratorios;
    }
    private void llenar_laboratorios(){
        ArrayList laboratorios = llena_lab();
        try {
            cb_laboratorios.removeAllItems();
                 for (int i = 0; i <= laboratorios.size(); i++) {
                cb_laboratorios.addItem(laboratorios.get(i).toString());
            }
        } catch (Exception ex) {
        }
    }
    
    //aqui se llenan el combobox de equipos
    private ArrayList<Integer> llena_equ() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  laboratorios =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Id FROM Equipos WHERE Salon='"+cb_laboratorios.getSelectedItem()+"'");
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
            cb_equipoDeComputo.removeAllItems();
                 for (int i = 0; i <= equipos.size(); i++) {
                cb_equipoDeComputo.addItem(equipos.get(i).toString());
            }
        } catch (Exception ex) {
        }
    }
    
    //esta es la funcion de el boton consultar manda a traer toda la informacion del equipo
    private void consulta() {
         try {
            String Id="",Estado="",Teclado="",Mouse="",Monitor="",Procesador="",Almacenamiento="";
            Connection connection = Base_datos.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            ps = connection.prepareStatement("SELECT * FROM Equipos WHERE Salon='"+cb_laboratorios.getSelectedItem()+"' AND Id='"+cb_equipoDeComputo.getSelectedItem()+"'");
            rs = ps.executeQuery();
            while(rs.next()){
            Id=rs.getString("Id");
            Estado=rs.getString("Estado");
            Teclado=rs.getString("Teclado");
            Mouse=rs.getString("Mouse");
            Monitor=rs.getString("Monitor");
            Procesador=rs.getString("Procesador");
            Almacenamiento=rs.getString("Almacenamiento");
            jLabel2.setText("Equipo: "+Id);
            lb_caracteristicas.setText("<HTML>ESTADO DEL EQUIPO ACTUALMENTE: "+Estado+"<P>"+"Teclado: "+Teclado+"<P>"+"Mouse: "+Mouse+"<P>"+"Monitor: "+Monitor+"<P>"+"Procesador: "+Procesador+"<P>"+"Almacenamiento: "+Almacenamiento);
            }
        } catch (Exception ex) {
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bt_administrar_Horarios;
    private javax.swing.JToggleButton bt_administrar_Usuarios;
    private javax.swing.JToggleButton bt_consultar;
    private javax.swing.JToggleButton bt_inventario;
    private javax.swing.JToggleButton bt_limpiar;
    private javax.swing.JToggleButton bt_notificaciones;
    private javax.swing.JToggleButton bt_reportes;
    private javax.swing.JToggleButton bt_rondines;
    private javax.swing.JComboBox<String> cb_equipoDeComputo;
    private javax.swing.JComboBox<String> cb_laboratorios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_caracteristicas;
    private javax.swing.JLabel lb_computadoraimg;
    private javax.swing.JLabel lb_equipoDeComputo;
    private javax.swing.JLabel lb_fondoimg;
    private javax.swing.JLabel lb_inventario;
    private javax.swing.JLabel lb_laboratorios;
    private javax.swing.JLabel lb_logoImg;
    private javax.swing.JLabel lb_nombreDelUsuario;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JLabel lb_usuarioImg;
    private javax.swing.JPanel pn_gris;
    private javax.swing.JPanel pn_menuLateral;
    private javax.swing.JPanel pn_principal;
    private javax.swing.JPanel pn_rojo;
    // End of variables declaration//GEN-END:variables
}
