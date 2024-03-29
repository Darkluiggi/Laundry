/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Utils.PanelUtils;

/**
 *
 * @author leons
 */
public class AdminFrame extends javax.swing.JPanel {

    /**
     * Creates new form AdminFrame
     */
    
    public static ArticlePanel sPan = new ArticlePanel();                //instancio el panel de gestionar servicios
    
    public AdminFrame() {
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

        TBPanel = new javax.swing.JPanel();
        AdminTB = new javax.swing.JToolBar();
        StatisticsB = new javax.swing.JButton();
        ServiceB = new javax.swing.JButton();
        ServP = new javax.swing.JPanel();

        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setMinimumSize(new java.awt.Dimension(800, 540));
        setPreferredSize(new java.awt.Dimension(800, 540));

        AdminTB.setFloatable(false);
        AdminTB.setRollover(true);
        AdminTB.setPreferredSize(new java.awt.Dimension(800, 23));

        StatisticsB.setText("Estadísticas");
        AdminTB.add(StatisticsB);

        ServiceB.setText("Servicio");
        ServiceB.setFocusable(false);
        ServiceB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ServiceB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ServiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceBActionPerformed(evt);
            }
        });
        AdminTB.add(ServiceB);

        javax.swing.GroupLayout TBPanelLayout = new javax.swing.GroupLayout(TBPanel);
        TBPanel.setLayout(TBPanelLayout);
        TBPanelLayout.setHorizontalGroup(
            TBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TBPanelLayout.setVerticalGroup(
            TBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TBPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AdminTB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ServP.setPreferredSize(new java.awt.Dimension(800, 510));
        ServP.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TBPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ServP, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ServP, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceBActionPerformed
        PanelUtils.change(ServP, sPan);
         // TODO add your handling code here:
    }//GEN-LAST:event_ServiceBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar AdminTB;
    private javax.swing.JPanel ServP;
    private javax.swing.JButton ServiceB;
    private javax.swing.JButton StatisticsB;
    private javax.swing.JPanel TBPanel;
    // End of variables declaration//GEN-END:variables
}
