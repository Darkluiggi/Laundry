/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.DAOArticle;
import Entidad.Article;
import Utils.BoxUtils;
import Utils.TableUtils;
/**
 *
 * @author luaalvarezve
 */
public class EditArticlePanel extends javax.swing.JPanel {

    /**
     * Creates new form EditService
     */
    private DAOArticle daoT = new DAOArticle();
    Article art = new Article();
     Article art1 = new Article();
        
        
    public EditArticlePanel() {
        initComponents();
//        BoxUtils.updateBox(daoT.getGenders(),GenderBox); 
        
           
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foldC = new javax.swing.JCheckBox();
        foldTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        IronL1 = new javax.swing.JLabel();
        IronTF = new javax.swing.JTextField();
        IronC = new javax.swing.JCheckBox();
        WaiC = new javax.swing.JCheckBox();
        IronandWashTF = new javax.swing.JTextField();
        IronAndWashL = new javax.swing.JLabel();
        IronL = new javax.swing.JLabel();
        LaundryL = new javax.swing.JLabel();
        WashTF = new javax.swing.JTextField();
        WashC = new javax.swing.JCheckBox();
        AvalL = new javax.swing.JLabel();
        NameTF = new javax.swing.JTextField();
        GenderL = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        AddGenderB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        schemaClothes = new javax.swing.JTable();
        AcceptB = new javax.swing.JButton();
        CancelB = new javax.swing.JButton();
        GenderBox = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(foldC, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 345, -1, -1));

        foldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldTFActionPerformed(evt);
            }
        });
        add(foldTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 345, 70, -1));

        jLabel1.setText("Doblado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 348, -1, -1));

        IronL1.setText("Planchado");
        add(IronL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 303, -1, -1));

        IronTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IronTFActionPerformed(evt);
            }
        });
        add(IronTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 300, 70, -1));
        add(IronC, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 300, -1, -1));
        add(WaiC, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 251, -1, -1));
        add(IronandWashTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 252, 70, -1));

        IronAndWashL.setText("Lavado y ");
        add(IronAndWashL, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 244, -1, -1));

        IronL.setText("Planchado");
        add(IronL, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 264, -1, -1));

        LaundryL.setText("Lavado");
        add(LaundryL, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 197, -1, -1));

        WashTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WashTFActionPerformed(evt);
            }
        });
        add(WashTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 194, 70, -1));
        add(WashC, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 194, -1, -1));

        AvalL.setText("Disponibilidad");
        add(AvalL, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 151, -1, -1));

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });
        add(NameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 125, 210, -1));

        GenderL.setText("Género");
        add(GenderL, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 43, -1, -1));

        NameL.setText("Nombre");
        add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 128, -1, -1));

        AddGenderB.setText("Añadir Género");
        AddGenderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGenderBActionPerformed(evt);
            }
        });
        add(AddGenderB, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 77, 140, 30));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        schemaClothes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado", "Doblado"
            }
        ));
        schemaClothes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schemaClothesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(schemaClothes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 43, 407, 390));

        AcceptB.setText("Aceptar");
        AcceptB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBActionPerformed(evt);
            }
        });
        add(AcceptB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 95, 40));

        CancelB.setText("Cancelar");
        add(CancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, 40));

        add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void foldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foldTFActionPerformed

    private void IronTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IronTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IronTFActionPerformed

    private void WashTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WashTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WashTFActionPerformed

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTFActionPerformed

    private void AddGenderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGenderBActionPerformed
        NewArticlePanel.addG.setVisible(true);                   //visibiliza la ventana de añadir genero
        // TODO add your handling code here:
    }//GEN-LAST:event_AddGenderBActionPerformed

    private void AcceptBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBActionPerformed
        
       art.setGender((String)GenderBox.getSelectedItem());
       art.setClothName((String)NameTF.getText());
       art.setWashPrice((Float.parseFloat(WashTF.getText())));
       art.setWashA(WashC.isSelected());
       art.setWaiPrice(Float.parseFloat(IronandWashTF.getText()));
       art.setWaiA(WaiC.isSelected());
       art.setIronPrice(Float.parseFloat(IronTF.getText()));
       art.setIronA(IronC.isSelected());
       art.setFoldPrice(Float.parseFloat(foldTF.getText()));
       art.setIronA(foldC.isSelected());
       
       daoT.update(art);
       TableUtils.fillTable(schemaClothes,daoT.findAll());
       BoxUtils.updateBox(daoT.getGenders(),GenderBox);
//         TODO add your handling code here:
    }//GEN-LAST:event_AcceptBActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void schemaClothesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schemaClothesMouseClicked
        BoxUtils.updateBox(daoT.getGenders(),GenderBox);
        String a,b;
               
       a= (String)schemaClothes.getValueAt(schemaClothes.getSelectedRow(), 0);
       b= (String)schemaClothes.getValueAt(schemaClothes.getSelectedRow(), 1);
       art.setGender(a);
       art.setClothName(b);
       art=daoT.read(schemaClothes.getSelectedRow()+1);
       GenderBox.setSelectedItem(art.getGender());
       NameTF.setText(art.getClothName());
       WashTF.setText(Float.toString(art.getWashPrice()));
       WashC.setSelected(art.isWashA());
       IronandWashTF.setText(Float.toString(art.getWaiPrice()));
       WaiC.setSelected(art.isWaiA());
       IronTF.setText(Float.toString(art.getIronPrice()));
       IronC.setSelected(art.isIronA());
       foldTF.setText(Float.toString(art.getFoldPrice()));
       foldC.setSelected(art.isFoldA());  
            // TODO add your handling code here:
    }//GEN-LAST:event_schemaClothesMouseClicked

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptB;
    private javax.swing.JButton AddGenderB;
    private javax.swing.JLabel AvalL;
    private javax.swing.JButton CancelB;
    protected static javax.swing.JComboBox<String> GenderBox;
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
    private javax.swing.JTextField foldTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable schemaClothes;
    // End of variables declaration//GEN-END:variables
}
