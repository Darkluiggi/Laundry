/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.DAOUser;
import Entidad.User;
import java.awt.event.KeyEvent;

/**
 *
 * @author leoleguizamon
 */
public class CreateAccount extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccount
     */
    
    
   
    private DAOUser dao = new DAOUser();
    private User usera = new User();
    private User userb = new User(); 
    private User userc = new User(); 
    
    public CreateAccount() {
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

        confirmCreate = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        AceptarBDialogo = new javax.swing.JButton();
        CancelarBDialogo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDNUsuarioLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ContraseñaNUsuarioLabel = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        editUserErrorPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buscarErrorLabel = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        editNameTF = new javax.swing.JTextField();
        editLastNameTF = new javax.swing.JTextField();
        editUserNameTF = new javax.swing.JTextField();
        editPassTF = new javax.swing.JTextField();
        editCountryTF = new javax.swing.JTextField();
        editPhoneTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        idEditLabel = new javax.swing.JLabel();
        editB = new javax.swing.JButton();
        editAdminC = new javax.swing.JCheckBox();
        cancelB = new javax.swing.JButton();
        passwordL = new javax.swing.JLabel();
        editAdressTF = new javax.swing.JTextField();
        createB = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        lastNameTF = new javax.swing.JTextField();
        userNameTF = new javax.swing.JTextField();
        countryTF = new javax.swing.JTextField();
        adressTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        adminC = new javax.swing.JCheckBox();
        createUserL = new javax.swing.JLabel();
        findB = new javax.swing.JButton();
        findIdTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editUserActualPanel = new javax.swing.JPanel();

        confirmCreate.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmCreate.setTitle("Nuevo Usuario");
        confirmCreate.setLocation(new java.awt.Point(0, 0));
        confirmCreate.setPreferredSize(new java.awt.Dimension(440, 240));
        confirmCreate.setResizable(false);
        confirmCreate.setSize(new java.awt.Dimension(440, 240));
        confirmCreate.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("¿Crear nuevo usuario?");
        confirmCreate.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, -1, 29));

        AceptarBDialogo.setText("Aceptar");
        AceptarBDialogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBDialogoActionPerformed(evt);
            }
        });
        confirmCreate.getContentPane().add(AceptarBDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 158, 292, -1));

        CancelarBDialogo.setText("Cancelar");
        CancelarBDialogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBDialogoActionPerformed(evt);
            }
        });
        confirmCreate.getContentPane().add(CancelarBDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 158, -1, -1));

        jLabel3.setText("Se creará un nuevo usuario, este proceso es irreversible");
        confirmCreate.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 62, -1, -1));

        jLabel4.setText("ID del nuevo usuario:");
        confirmCreate.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 91, -1, -1));

        IDNUsuarioLabel.setText("###################");
        confirmCreate.getContentPane().add(IDNUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel6.setText("Contraseña:");
        confirmCreate.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        ContraseñaNUsuarioLabel.setText("###################");
        confirmCreate.getContentPane().add(ContraseñaNUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jFrame1.setUndecorated(true);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        editUserErrorPanel.setPreferredSize(new java.awt.Dimension(398, 258));

        jLabel7.setText("Error:");

        jLabel8.setText("No se pudo encontrar el ID:");

        buscarErrorLabel.setText("##############");

        javax.swing.GroupLayout editUserErrorPanelLayout = new javax.swing.GroupLayout(editUserErrorPanel);
        editUserErrorPanel.setLayout(editUserErrorPanelLayout);
        editUserErrorPanelLayout.setHorizontalGroup(
            editUserErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUserErrorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editUserErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUserErrorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editUserErrorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editUserErrorPanelLayout.setVerticalGroup(
            editUserErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUserErrorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editUserErrorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(buscarErrorLabel))
                .addGap(210, 210, 210))
        );

        editPanel.setPreferredSize(new java.awt.Dimension(456, 386));
        editPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Nombre:");
        editPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 98, 78, -1));

        jLabel10.setText("Apellido:");
        editPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 78, -1));

        jLabel11.setText("User Name");
        editPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 182, -1, -1));

        jLabel12.setText("Dirección:");
        editPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 78, -1));

        jLabel13.setText("Telefono:");
        editPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 78, -1));

        jLabel14.setText("País:");
        editPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        editNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameTFActionPerformed(evt);
            }
        });
        editPanel.add(editNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, -1));
        editPanel.add(editLastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, -1));
        editPanel.add(editUserNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));
        editPanel.add(editPassTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, -1));

        editCountryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCountryTFActionPerformed(evt);
            }
        });
        editPanel.add(editCountryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, -1));
        editPanel.add(editPhoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, -1));

        jLabel15.setText("ID:");
        editPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        idEditLabel.setText("######");
        editPanel.add(idEditLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 16, -1, -1));

        editB.setText("Editar");
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });
        editPanel.add(editB, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 16, 90, -1));

        editAdminC.setText("Administrador");
        editAdminC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAdminCActionPerformed(evt);
            }
        });
        editPanel.add(editAdminC, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 48, -1, -1));

        cancelB.setText("Cancelar");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });
        editPanel.add(cancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 61, -1, -1));

        passwordL.setText("Contraseña");
        editPanel.add(passwordL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        editPanel.add(editAdressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, -1));

        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(640, 331));
        setMinimumSize(new java.awt.Dimension(640, 331));

        createB.setText("Crear");
        createB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBActionPerformed(evt);
            }
        });
        createB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                createBKeyReleased(evt);
            }
        });

        nameTF.setText("Nombre");
        nameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTFMouseClicked(evt);
            }
        });
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        lastNameTF.setText("Apellido");
        lastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameTFMouseClicked(evt);
            }
        });
        lastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTFActionPerformed(evt);
            }
        });

        userNameTF.setText("Nombre de Usuario");
        userNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameTFMouseClicked(evt);
            }
        });

        countryTF.setText("País");
        countryTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countryTFMouseClicked(evt);
            }
        });

        adressTF.setText("Dirección");
        adressTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adressTFMouseClicked(evt);
            }
        });
        adressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressTFActionPerformed(evt);
            }
        });

        phoneTF.setText("Telefono");
        phoneTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTFMouseClicked(evt);
            }
        });
        phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFActionPerformed(evt);
            }
        });

        passwordTF.setText("Contraseña");
        passwordTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTFMouseClicked(evt);
            }
        });
        passwordTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTFKeyReleased(evt);
            }
        });

        adminC.setText("Administrador");

        createUserL.setText("Crear Usuario:");

        findB.setText("Buscar");
        findB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBActionPerformed(evt);
            }
        });

        findIdTF.setText("ID a buscar");
        findIdTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findIdTFMouseClicked(evt);
            }
        });
        findIdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findIdTFActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar Usuario:");

        editUserActualPanel.setPreferredSize(new java.awt.Dimension(258, 258));
        editUserActualPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createUserL)
                    .addComponent(nameTF)
                    .addComponent(lastNameTF)
                    .addComponent(userNameTF)
                    .addComponent(countryTF)
                    .addComponent(adminC)
                    .addComponent(adressTF)
                    .addComponent(phoneTF)
                    .addComponent(passwordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(createB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(findIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(editUserActualPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(findB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editUserActualPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createUserL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(countryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adminC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createB)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void lastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTFActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTFActionPerformed

    private void adressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressTFActionPerformed

    private void AceptarBDialogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBDialogoActionPerformed
      
       User user = new User();
      user.setName((String)nameTF.getText());
      user.setLastName((String)lastNameTF.getText());
      user.setUserName((String) userNameTF.getText());
      user.setCountry((String)countryTF.getText());
      user.setAdress((String) adressTF.getText());
      user.setPassword((String) passwordTF.getText());
      user.setPhone((String) phoneTF.getText());
      if(adminC.isSelected() == Boolean.TRUE){
          user.setRol("Administrador");
      }else{
          user.setRol("Encargado de cabina");
      }
            
      dao.create(user);         // TODO add your handling code here:
    }//GEN-LAST:event_AceptarBDialogoActionPerformed

    private void findIdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findIdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findIdTFActionPerformed

    private void editAdminCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAdminCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editAdminCActionPerformed

    private void editNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNameTFActionPerformed

    private void createBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBActionPerformed
        
        confirmCreate.setVisible(true);
        confirmCreate.setLocationRelativeTo(null);
        IDNUsuarioLabel.setText(userNameTF.getText());
        ContraseñaNUsuarioLabel.setText(passwordTF.getText());
         
        
        
        
        
        
    }//GEN-LAST:event_createBActionPerformed

    private void findBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBActionPerformed
        String a;
                     
        a=findIdTF.getText();
        usera.setUserName(a);
        userb=dao.read(usera);
        if(userb==null){
            editUserActualPanel.setVisible(false);
        editUserActualPanel.removeAll();                                
        editUserActualPanel.add(editUserErrorPanel);
        editUserActualPanel.setVisible(true);
        buscarErrorLabel.setText(findIdTF.getText());
        }else{
        
        editNameTF.setText(userb.getName());
        editLastNameTF.setText(userb.getLastName());
        editUserNameTF.setText(userb.getUserName());
        editPassTF.setText(userb.getPassword());
        editCountryTF.setText(userb.getCountry());
        editPhoneTF.setText(userb.getPhone());
        editAdressTF.setText(userb.getAdress());
        if(userb.getRol().equals("Administrador")){
          editAdminC.setSelected(Boolean.TRUE);
      }else{
          editAdminC.setSelected(Boolean.FALSE);
      }
        
        editUserActualPanel.setVisible(false);
        editUserActualPanel.removeAll();                                
        editUserActualPanel.add(editPanel);
        editUserActualPanel.setVisible(true);
        idEditLabel.setText(findIdTF.getText());
    
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_findBActionPerformed

    private void nameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTFMouseClicked
        nameTF.selectAll();
    }//GEN-LAST:event_nameTFMouseClicked

    private void lastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameTFMouseClicked
        lastNameTF.selectAll();        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTFMouseClicked

    private void userNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameTFMouseClicked
        userNameTF.selectAll();          // TODO add your handling code here:
    }//GEN-LAST:event_userNameTFMouseClicked

    private void countryTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryTFMouseClicked
        countryTF.selectAll();          // TODO add your handling code here:
    }//GEN-LAST:event_countryTFMouseClicked

    private void adressTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adressTFMouseClicked
        adressTF.selectAll();          // TODO add your handling code here:
    }//GEN-LAST:event_adressTFMouseClicked

    private void phoneTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTFMouseClicked
        phoneTF.selectAll();          // TODO add your handling code here:
    }//GEN-LAST:event_phoneTFMouseClicked

    private void passwordTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTFMouseClicked
        passwordTF.selectAll();          // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFMouseClicked

    private void findIdTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findIdTFMouseClicked
        findIdTF.selectAll();          // TODO add your handling code here:
    }//GEN-LAST:event_findIdTFMouseClicked

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        userc.setName(editNameTF.getText());
        userc.setLastName(editLastNameTF.getText());
        userc.setUserName(editUserNameTF.getText());
        userc.setCountry(editCountryTF.getText());       
        userc.setPhone(editPhoneTF.getText());
        userc.setAdress(editAdressTF.getText());
        userc.setPassword(editPassTF.getText());
        if(editAdminC.isSelected() == Boolean.TRUE){
          userc.setRol("Administrador");
      }else{
          userc.setRol("Encargado de cabina");
      }
        dao.update(usera, userc);
                                                                        // TODO add your handling code here:
    }//GEN-LAST:event_editBActionPerformed

    private void editCountryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCountryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCountryTFActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        
        editUserActualPanel.setVisible(false);
        editUserActualPanel.removeAll();
        editUserActualPanel.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_cancelBActionPerformed

    private void passwordTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTFKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFKeyReleased

    private void createBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_createBKeyReleased
              if(evt.getKeyCode()==KeyEvent.VK_ENTER){
               createBActionPerformed(null);                                   //al presionar enter creando el género presiona aceptar y guarda el dato
                      }         // TODO add your handling code here:
    }//GEN-LAST:event_createBKeyReleased

    private void CancelarBDialogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBDialogoActionPerformed
       confirmCreate.dispose();                 // TODO add your handling code here:
    }//GEN-LAST:event_CancelarBDialogoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBDialogo;
    private javax.swing.JButton CancelarBDialogo;
    private javax.swing.JLabel ContraseñaNUsuarioLabel;
    private javax.swing.JLabel IDNUsuarioLabel;
    private javax.swing.JCheckBox adminC;
    private javax.swing.JTextField adressTF;
    private javax.swing.JLabel buscarErrorLabel;
    private javax.swing.JButton cancelB;
    private javax.swing.JDialog confirmCreate;
    private javax.swing.JTextField countryTF;
    private javax.swing.JButton createB;
    private javax.swing.JLabel createUserL;
    private javax.swing.JCheckBox editAdminC;
    private javax.swing.JTextField editAdressTF;
    private javax.swing.JButton editB;
    private javax.swing.JTextField editCountryTF;
    private javax.swing.JTextField editLastNameTF;
    private javax.swing.JTextField editNameTF;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField editPassTF;
    private javax.swing.JTextField editPhoneTF;
    private javax.swing.JPanel editUserActualPanel;
    private javax.swing.JPanel editUserErrorPanel;
    private javax.swing.JTextField editUserNameTF;
    private javax.swing.JButton findB;
    private javax.swing.JTextField findIdTF;
    private javax.swing.JLabel idEditLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel passwordL;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}
