/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author liooficial
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel_principalImagen,"src/img/lab.jpg");
        
    }
    private void verificar() {
       String usuario= TextField_usuario.getText();
       String contraseña=txtfid_contraseña.getText();
        try {
            String usuario1="",contraseña1="",tipo="",nom="";
            Connection connection = Base_datos.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            ps = connection.prepareStatement("SELECT * FROM Usuarios");
            rs = ps.executeQuery();
            while(rs.next()){
            usuario1=rs.getString("Id");
            contraseña1=rs.getString("Contraseña");
            tipo=rs.getString("TipoUsuario");
            nom=rs.getString("Nombre");
            }
            if (usuario1.equals(usuario)) {
                if (contraseña1.equals(contraseña)) {
                Reservar_salon ventana = new Reservar_salon( );
                ventana.setVisible(true);
                this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "contraseña Incorecta","ERROR",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/img/contrasena-incorrecta.png"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Usuario No Existe","ERROR",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/img/desconocido.png"));
            } 
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.toString());
        }
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
        jPanel_elementos = new javax.swing.JPanel();
        btn_ingreso = new javax.swing.JButton();
        txtfid_contraseña = new javax.swing.JPasswordField();
        TextField_usuario = new javax.swing.JTextField();
        jlabel_acceso = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jLabel_contraseña = new javax.swing.JLabel();
        CheckBox_mostrarContraseña = new javax.swing.JCheckBox();
        jLabel_candadoImagen = new javax.swing.JLabel();
        jpanel_imagenes = new javax.swing.JPanel();
        jLabel_iscImagen = new javax.swing.JLabel();
        jLabel_logoImagen = new javax.swing.JLabel();
        jLabel_principalImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(23, 23, 23));

        jPanel_elementos.setBackground(new java.awt.Color(27, 27, 27));

        btn_ingreso.setBackground(new java.awt.Color(101, 0, 11));
        btn_ingreso.setFont(new java.awt.Font("Century Schoolbook", 0, 15)); // NOI18N
        btn_ingreso.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingreso.setText("INGRESAR");
        btn_ingreso.setBorder(null);
        btn_ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresoMouseEntered(evt);
            }
        });
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });

        txtfid_contraseña.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtfid_contraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtfid_contraseña.setText("******");
        txtfid_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfid_contraseñaMousePressed(evt);
            }
        });
        txtfid_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfid_contraseñaActionPerformed(evt);
            }
        });

        TextField_usuario.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        TextField_usuario.setForeground(new java.awt.Color(204, 204, 204));
        TextField_usuario.setText("Ingrese su usuario");
        TextField_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextField_usuarioMousePressed(evt);
            }
        });
        TextField_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_usuarioKeyTyped(evt);
            }
        });

        jlabel_acceso.setFont(new java.awt.Font("Arial Black", 0, 21)); // NOI18N
        jlabel_acceso.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_acceso.setText("Acceso");

        jLabel_usuario.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_usuario.setText("USUARIO:");

        jLabel_contraseña.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_contraseña.setText("CONTRASEÑA:");

        CheckBox_mostrarContraseña.setBackground(new java.awt.Color(27, 27, 27));
        CheckBox_mostrarContraseña.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        CheckBox_mostrarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox_mostrarContraseña.setText("MOSTRAR");
        CheckBox_mostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_mostrarContraseñaActionPerformed(evt);
            }
        });

        jLabel_candadoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_elementosLayout = new javax.swing.GroupLayout(jPanel_elementos);
        jPanel_elementos.setLayout(jPanel_elementosLayout);
        jPanel_elementosLayout.setHorizontalGroup(
            jPanel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_elementosLayout.createSequentialGroup()
                .addGroup(jPanel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_elementosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_mostrarContraseña)
                            .addGroup(jPanel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_contraseña)
                                .addComponent(jLabel_usuario)
                                .addComponent(txtfid_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(TextField_usuario))))
                    .addGroup(jPanel_elementosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btn_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_elementosLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_candadoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel_acceso))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel_elementosLayout.setVerticalGroup(
            jPanel_elementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_elementosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlabel_acceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_candadoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_usuario)
                .addGap(18, 18, 18)
                .addComponent(TextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel_contraseña)
                .addGap(18, 18, 18)
                .addComponent(txtfid_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckBox_mostrarContraseña)
                .addGap(18, 18, 18)
                .addComponent(btn_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jpanel_imagenes.setBackground(new java.awt.Color(27, 27, 27));
        jpanel_imagenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_iscImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isc100X50.png"))); // NOI18N
        jpanel_imagenes.add(jLabel_iscImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        jLabel_logoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jpanel_imagenes.add(jLabel_logoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 110));
        jpanel_imagenes.add(jLabel_principalImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 370));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jpanel_imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jPanel_elementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_elementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_imagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
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

    private void CheckBox_mostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_mostrarContraseñaActionPerformed
        if(CheckBox_mostrarContraseña.isSelected()){
        txtfid_contraseña.setEchoChar((char)0);
        }else{  
        txtfid_contraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBox_mostrarContraseñaActionPerformed

    private void TextField_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextField_usuarioMousePressed
        if(TextField_usuario.getText().equals("Ingrese su usuario")){
        TextField_usuario.setText("");
        TextField_usuario.setForeground(Color.black);
        }
        if(String.valueOf(txtfid_contraseña.getPassword()).isEmpty()){
        txtfid_contraseña.setText("******");
        txtfid_contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TextField_usuarioMousePressed

    private void txtfid_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfid_contraseñaMousePressed
        if(String.valueOf(txtfid_contraseña.getPassword()).equals("******")){
        txtfid_contraseña.setText("");
        txtfid_contraseña.setForeground(Color.black);
        }
         if(TextField_usuario.getText().isEmpty()){
        TextField_usuario.setText("Ingrese su usuario");
        TextField_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtfid_contraseñaMousePressed

    private void TextField_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_usuarioKeyTyped
         int key = evt.getKeyChar();
    boolean numeros = key >= 48 && key <= 57;
     if (!(numeros ))
    {
        evt.consume();
    }
    }//GEN-LAST:event_TextField_usuarioKeyTyped

    private void btn_ingresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresoMouseEntered

    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed
        if(TextField_usuario.getText().equals("Ingrese su usuario") ||  String.valueOf(txtfid_contraseña.getPassword()).equals("******")){
            JOptionPane.showMessageDialog(null,"Campos vacios","Campos vacios",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/img/documento.png"));
            }else{
        verificar();
        }
    }//GEN-LAST:event_btn_ingresoActionPerformed

    private void txtfid_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfid_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfid_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_mostrarContraseña;
    private javax.swing.JTextField TextField_usuario;
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JLabel jLabel_candadoImagen;
    private javax.swing.JLabel jLabel_contraseña;
    private javax.swing.JLabel jLabel_iscImagen;
    private javax.swing.JLabel jLabel_logoImagen;
    private javax.swing.JLabel jLabel_principalImagen;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_elementos;
    private javax.swing.JLabel jlabel_acceso;
    private javax.swing.JPanel jpanel_imagenes;
    private javax.swing.JPasswordField txtfid_contraseña;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeto(login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
