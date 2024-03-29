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
public class RequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPanel
     */
    public NewRequestPanel newRequest;
    public ViewRequests viewRequests;
    public EditRequest editRequest;
    
    public RequestPanel() {
        initComponents();
        newRequest = new NewRequestPanel();
        viewRequests = new ViewRequests();
        editRequest = new EditRequest();
        PanelUtils.change(addRequestTab, newRequest);
        
        tabs.addChangeListener(e -> {
            switch (tabs.getSelectedIndex()) {
                case 0:
                    PanelUtils.change(addRequestTab, newRequest);
                    break;
                case 1:
                    PanelUtils.change(viewRequestsTab, viewRequests);
                    break;
                default:
                    PanelUtils.change(editRequestTab, editRequest);
                    break;
            }
        });
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        addRequestTab = new javax.swing.JPanel();
        viewRequestsTab = new javax.swing.JPanel();
        editRequestTab = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(860, 500));
        setLayout(new java.awt.BorderLayout());

        tabs.setPreferredSize(new java.awt.Dimension(800, 300));

        addRequestTab.setLayout(new java.awt.BorderLayout());
        tabs.addTab("Agregar nueva solicitud", addRequestTab);

        viewRequestsTab.setLayout(new java.awt.BorderLayout());
        tabs.addTab("Ver solicitudes", viewRequestsTab);

        editRequestTab.setLayout(new java.awt.BorderLayout());
        tabs.addTab("Editar solicitud", editRequestTab);

        add(tabs, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addRequestTab;
    private javax.swing.JPanel editRequestTab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel viewRequestsTab;
    // End of variables declaration//GEN-END:variables
}
