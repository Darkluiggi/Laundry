/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidateLogin;
import Control.changePanels;
import DAO.DAOUser;
import Entidad.User;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author leons
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    
      
    public Login() {
        initComponents();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AcceptB = new javax.swing.JButton();
        NameTF = new javax.swing.JTextField();
        PassTF = new javax.swing.JTextField();
        userL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        LoginL = new javax.swing.JLabel();
        ExceptionField = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setPreferredSize(new java.awt.Dimension(400, 300));

        AcceptB.setText("Aceptar");
        AcceptB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBActionPerformed(evt);
            }
        });

        PassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTFActionPerformed(evt);
            }
        });
        PassTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassTFKeyReleased(evt);
            }
        });

        userL.setText("Usuario");

        passL.setText("Contraseña");

        LoginL.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(LoginL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(AcceptB)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userL)
                        .addGap(56, 56, 56)
                        .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passL)
                        .addGap(31, 31, 31)
                        .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(ExceptionField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(LoginL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(userL))
                            .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passL)))
                    .addComponent(ExceptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(AcceptB)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBActionPerformed
    User user = new User();
    user.setUserName(NameTF.getText());
    user.setPassword(PassTF.getText());
    
    ValidateLogin validate = new ValidateLogin();
    String result = validate.verifyLogin(user);
    if (result.equals("Administrador")){
        changePanels.change(MainFrame.MainPanel, MainFrame.admin);
        
    } if(result.equals("Encargado de cabina")){
        
        changePanels.change(MainFrame.MainPanel, MainFrame.user);
        
    }else{
        ExceptionField.setText(result);
    }
      MainFrame.ExitB.setVisible(true);
      MainFrame.LoginB.setVisible(false);
    }//GEN-LAST:event_AcceptBActionPerformed

    private void PassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTFActionPerformed

    private void PassTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassTFKeyReleased
             if(evt.getKeyCode()==KeyEvent.VK_ENTER){
               AcceptBActionPerformed(null);                                   //al presionar enter creando el género presiona aceptar y guarda el dato
                      }        // TODO add your handling code here:
    }//GEN-LAST:event_PassTFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptB;
    private javax.swing.JLabel ExceptionField;
    private javax.swing.JLabel LoginL;
    private javax.swing.JTextField NameTF;
    private javax.swing.JTextField PassTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passL;
    private javax.swing.JLabel userL;
    // End of variables declaration//GEN-END:variables
}
