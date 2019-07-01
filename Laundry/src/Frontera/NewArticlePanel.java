/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frontera;

import Utils.PanelUtils;
import Utils.TableUtils;
import DAO.DAOArticle;
import Entidad.Article;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author leons
 */



public class NewArticlePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewServicePanel
     */
    public static AddGender addG = new AddGender();             //instancio las ventanas a las que puede acceder este panel
    public static ArrayList genders= new ArrayList();
    private DAOArticle daoT = new DAOArticle();
    
    public NewArticlePanel() {
       
        initComponents();
        TableUtils.fillTable(schemaClothes);
        
        List<String> list2 = daoT.getGenders();
        
        DefaultComboBoxModel model2 = new DefaultComboBoxModel(list2.toArray());
        
        GenderBox.setModel(model2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        WashC = new javax.swing.JCheckBox();
        IronL = new javax.swing.JLabel();
        WaiC = new javax.swing.JCheckBox();
        IronTF = new javax.swing.JTextField();
        IronC = new javax.swing.JCheckBox();
        IronandWashTF = new javax.swing.JTextField();
        AvalL = new javax.swing.JLabel();
        IronAndWashL = new javax.swing.JLabel();
        LaundryL = new javax.swing.JLabel();
        WashTF = new javax.swing.JTextField();
        AddGenderB = new javax.swing.JButton();
        NameTF = new javax.swing.JTextField();
        NameL = new javax.swing.JLabel();
        GenderL = new javax.swing.JLabel();
        GenderBox = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        foldC = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        schemaClothes = new javax.swing.JTable();
        AcceptB = new javax.swing.JButton();
        CancelB = new javax.swing.JButton();
        IronL1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setPreferredSize(new java.awt.Dimension(800, 469));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(WashC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        IronL.setText("Planchado");
        jPanel1.add(IronL, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));
        jPanel1.add(WaiC, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        IronTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IronTFActionPerformed(evt);
            }
        });
        jPanel1.add(IronTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 70, -1));
        jPanel1.add(IronC, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));
        jPanel1.add(IronandWashTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 70, -1));

        AvalL.setText("Disponibilidad");
        jPanel1.add(AvalL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        IronAndWashL.setText("Lavado y ");
        jPanel1.add(IronAndWashL, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        LaundryL.setText("Lavado");
        jPanel1.add(LaundryL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        WashTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WashTFActionPerformed(evt);
            }
        });
        jPanel1.add(WashTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, -1));

        AddGenderB.setText("Añadir Género");
        AddGenderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGenderBActionPerformed(evt);
            }
        });
        jPanel1.add(AddGenderB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 30));

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });
        jPanel1.add(NameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, -1));

        NameL.setText("Nombre");
        jPanel1.add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        GenderL.setText("Género");
        jPanel1.add(GenderL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        GenderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBoxActionPerformed(evt);
            }
        });
        jPanel1.add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 99, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 70, -1));

        jLabel1.setText("Doblado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));
        jPanel1.add(foldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        schemaClothes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado", "Doblado"
            }
        ));
        jScrollPane1.setViewportView(schemaClothes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 750, 200));

        AcceptB.setText("Aceptar");
        AcceptB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBActionPerformed(evt);
            }
        });
        AcceptB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AcceptBKeyReleased(evt);
            }
        });
        jPanel1.add(AcceptB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 93, 47));

        CancelB.setText("Cancelar");
        CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBActionPerformed(evt);
            }
        });
        jPanel1.add(CancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 92, 47));

        IronL1.setText("Planchado");
        jPanel1.add(IronL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void IronTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IronTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IronTFActionPerformed

    private void WashTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WashTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WashTFActionPerformed

    private void AddGenderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGenderBActionPerformed
       addG.setVisible(true);                   //visibiliza la ventana de añadir genero
       // TODO add your handling code here:
    }//GEN-LAST:event_AddGenderBActionPerformed

    private void GenderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBoxActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_GenderBoxActionPerformed

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTFActionPerformed

    private void CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBActionPerformed
        PanelUtils.clear(ArticlePanel.ServP);                                         //al cancelar oculta la ventana
        
     // TODO add your handling code here:
    }//GEN-LAST:event_CancelBActionPerformed

    private void AcceptBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBActionPerformed
        Article temp = new Article();
        
        temp.setGender((String)GenderBox.getSelectedItem());
        temp.setClothName(NameTF.getText());
        temp.setWashPrice(Float.parseFloat(WashTF.getText()));
        temp.setWashA(WashC.isSelected());
        temp.setWaiPrice(Float.parseFloat(IronandWashTF.getText()));
        temp.setWaiA(WaiC.isSelected());
        temp.setIronPrice(Float.parseFloat(IronTF.getText()));
        temp.setIronA(IronC.isSelected());
        temp.setFold(foldC.isSelected());
        daoT.create(temp);
        TableUtils.fillTable(schemaClothes);

                


        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptBActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void AcceptBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AcceptBKeyReleased
            if(evt.getKeyCode()==KeyEvent.VK_ENTER){
               AcceptBActionPerformed(null);                                   //al presionar enter creando el género presiona aceptar y guarda el dato
                      }         // TODO add your handling code here:
    }//GEN-LAST:event_AcceptBKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptB;
    private javax.swing.JButton AddGenderB;
    private javax.swing.JLabel AvalL;
    private javax.swing.JButton CancelB;
    public static javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JLabel GenderL;
    private javax.swing.JLabel IronAndWashL;
    private javax.swing.JCheckBox IronC;
    private javax.swing.JLabel IronL;
    private javax.swing.JLabel IronL1;
    private javax.swing.JTextField IronTF;
    private javax.swing.JTextField IronandWashTF;
    private javax.swing.JLabel LaundryL;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField NameTF;
    private javax.swing.JCheckBox WaiC;
    private javax.swing.JCheckBox WashC;
    private javax.swing.JTextField WashTF;
    private javax.swing.JCheckBox foldC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable schemaClothes;
    // End of variables declaration//GEN-END:variables
}