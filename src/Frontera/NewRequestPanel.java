/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;



import Utils.PanelUtils;
import Utils.TableUtils;
import DAO.DAOArticle;
import DAO.DAOArticleRequest;
import Entidad.Article;
import Entidad.ArticleRequest;
import Utils.BoxUtils;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class NewRequestPanel extends javax.swing.JPanel implements requestInterface{

    /**
     * Creates new form NewRequestPanel
     */
    private DAOArticle daoT;
    private ArticleRequest artR;
    private DAOArticleRequest daoAR;
    private Article art;
    private Hashtable<String, String[]> subItems= new Hashtable<String, String[]>();
    String a,b;    
    int c, d;
    public NewRequestPanel() {
        initComponents();
        daoT = new DAOArticle();
        artR = new ArticleRequest();
        art = new Article();
        daoAR = new DAOArticleRequest();
     
        BoxUtils.updateBox(daoT.getGenders(), GenderBox);
        GenderBox.addActionListener((ev)->{
            genderSelected(ev);
        });
        GenderBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
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
        CabinTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        GenderBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        washChk = new javax.swing.JCheckBox();
        ironChk = new javax.swing.JCheckBox();
        foldChk = new javax.swing.JCheckBox();
        clothL = new javax.swing.JLabel();
        ClothBox = new javax.swing.JComboBox<>();
        AddB = new javax.swing.JButton();
        CancelB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        QuantityTF = new javax.swing.JTextField();
        ironWashChk = new javax.swing.JCheckBox();
        XpressChk = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id de cabina");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        add(CabinTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 99, -1));

        jLabel2.setText("Género");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GenderBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderBoxItemStateChanged(evt);
            }
        });
        GenderBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GenderBoxFocusGained(evt);
            }
        });
        GenderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBoxActionPerformed(evt);
            }
        });
        add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 89, -1));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Género", "Nombre", "Servicio", "Doblado", "Express", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(requestTable);
        if (requestTable.getColumnModel().getColumnCount() > 0) {
            requestTable.getColumnModel().getColumn(0).setResizable(false);
            requestTable.getColumnModel().getColumn(1).setResizable(false);
            requestTable.getColumnModel().getColumn(2).setResizable(false);
            requestTable.getColumnModel().getColumn(3).setResizable(false);
            requestTable.getColumnModel().getColumn(4).setResizable(false);
            requestTable.getColumnModel().getColumn(5).setResizable(false);
            requestTable.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 37, 539, -1));

        washChk.setText("Lavado");
        washChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                washChkStateChanged(evt);
            }
        });
        washChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                washChkActionPerformed(evt);
            }
        });
        add(washChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        ironChk.setText("Planchado");
        ironChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ironChkStateChanged(evt);
            }
        });
        ironChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ironChkActionPerformed(evt);
            }
        });
        add(ironChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        foldChk.setText("Doblado");
        add(foldChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        clothL.setText("Prenda");
        add(clothL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        ClothBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ClothBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ClothBoxItemStateChanged(evt);
            }
        });
        ClothBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ClothBoxFocusGained(evt);
            }
        });
        ClothBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClothBoxActionPerformed(evt);
            }
        });
        add(ClothBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 89, -1));

        AddB.setText("Agregar");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });
        add(AddB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        CancelB.setText("Cancelar");
        add(CancelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel3.setText("Cantidad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        add(QuantityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 89, -1));

        ironWashChk.setText("Lavado y planchado");
        ironWashChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ironWashChkStateChanged(evt);
            }
        });
        ironWashChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ironWashChkActionPerformed(evt);
            }
        });
        add(ironWashChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        XpressChk.setText("Express");
        add(XpressChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void GenderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBoxActionPerformed
       
    }//GEN-LAST:event_GenderBoxActionPerformed

    
    private void genderSelected(ActionEvent evt){
        //BoxUtils.updateBox(daoT.getClothName((String)GenderBox.getSelectedItem()), ClothBox);  
        String item = (String)GenderBox.getSelectedItem();
        BoxUtils.getArticlesbyGender(item, subItems);
        Object o = subItems.get(item);

        if (o == null)
        {
            ClothBox.setModel( new DefaultComboBoxModel() );
        }
        else
        {
            ClothBox.setModel( new DefaultComboBoxModel( (String[])o ) );
        }
    }
    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed

        double e = 00.0;
        a =(String) ClothBox.getSelectedItem();
        b = (String)GenderBox.getSelectedItem();
        art.setClothName(a);
        art.setGender(b);
        c =daoT.findID(art);
        art=daoT.read(c);        
        artR.setArticle(art);
        d=Integer.parseInt(QuantityTF.getText());
        artR.setQuantity(d);
         if(washChk.isSelected()){
            e=art.getWashPrice();
            artR.setService("Lavado");
        }else if (ironChk.isSelected()) {
            e=art.getIronPrice(); 
            artR.setService("Planchado");
        }else if (ironWashChk.isSelected()) {
            e=art.getWaiPrice();
            artR.setService("LAvado y Planchado");
        }
        artR.setSubtotal(d*e);
        artR.setExpress(XpressChk.isSelected());
        daoAR.create(artR);
        TableUtils.fillTableArticleRequest(requestTable, daoAR.findAll());
        art.getClothName();
            // TODO add your handling code here:
    }//GEN-LAST:event_AddBActionPerformed

    private void washChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_washChkStateChanged

    }//GEN-LAST:event_washChkStateChanged

    private void ironWashChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ironWashChkStateChanged

    }//GEN-LAST:event_ironWashChkStateChanged

    private void ironChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ironChkStateChanged

    }//GEN-LAST:event_ironChkStateChanged

    private void ironChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ironChkActionPerformed
        if(ironChk.isSelected()){
            ironWashChk.setEnabled(false);
            washChk.setEnabled(false);
        }else{
            washChk.setEnabled(true);
            ironWashChk.setEnabled(true);
        }
    }//GEN-LAST:event_ironChkActionPerformed

    private void washChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_washChkActionPerformed
        if(washChk.isSelected()){
            ironWashChk.setEnabled(false);
            ironChk.setEnabled(false);
        }else{
            ironWashChk.setEnabled(true);
            ironChk.setEnabled(true);
        }
    }//GEN-LAST:event_washChkActionPerformed

    private void ironWashChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ironWashChkActionPerformed
        if(ironWashChk.isSelected()){
            washChk.setEnabled(false);
            ironChk.setEnabled(false);
        }else{
            washChk.setEnabled(true);
            ironChk.setEnabled(true);
        }
    }//GEN-LAST:event_ironWashChkActionPerformed

    private void ClothBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClothBoxActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_ClothBoxActionPerformed

    private void ClothBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ClothBoxFocusGained
      
    }//GEN-LAST:event_ClothBoxFocusGained

    private void GenderBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenderBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBoxFocusGained

    private void GenderBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderBoxItemStateChanged
        //BoxUtils.updateBox(daoT.getClothName((String)GenderBox.getSelectedItem()), ClothBox);
    }//GEN-LAST:event_GenderBoxItemStateChanged

    private void ClothBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ClothBoxItemStateChanged
        a =(String) ClothBox.getSelectedItem();
        b = (String)GenderBox.getSelectedItem();
        art.setGender(b);
        art.setClothName(a);
        c =daoT.findID(art);
        art=daoT.read(c); 
        foldChk.setEnabled(art.getFold());        // TODO add your handling code here:
    }//GEN-LAST:event_ClothBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JTextField CabinTF;
    private javax.swing.JButton CancelB;
    private javax.swing.JComboBox<String> ClothBox;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JTextField QuantityTF;
    private javax.swing.JCheckBox XpressChk;
    private javax.swing.JLabel clothL;
    private javax.swing.JCheckBox foldChk;
    private javax.swing.JCheckBox ironChk;
    private javax.swing.JCheckBox ironWashChk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    private javax.swing.JCheckBox washChk;
    // End of variables declaration//GEN-END:variables
}
