/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SuperStockistRole;

import Business.WorkQueue.DrugRequirementRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jahnavi
 */
public class ProcessSWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessNWorkRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private DrugRequirementRequest request;
    
    public ProcessSWorkRequestJPanel(JPanel userProcessContainer, DrugRequirementRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        groupButton();
    }
    
    private void groupButton( ) {

    ButtonGroup bg1 = new ButtonGroup( );
    bg1.add(radioApproved);
    bg1.add(radioRejected);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        radioRejected = new javax.swing.JRadioButton();
        radioApproved = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(153, 255, 255));

        submitJButton.setBackground(new java.awt.Color(0, 0, 102));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Request");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Request:");

        backJButton.setBackground(new java.awt.Color(0, 0, 102));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Processing Drug Request");

        radioRejected.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        radioRejected.setText("Reject the Drug");

        radioApproved.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        radioApproved.setText("Approve the Drug\n");
        radioApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioApprovedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 314, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioRejected)
                            .addComponent(radioApproved)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(103, 103, 103)
                .addComponent(radioApproved)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(radioRejected)
                .addGap(83, 83, 83)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if(radioApproved.isSelected()){
            // request.setRequestResult("Approved");
            request.setStatus("Completed");
            JOptionPane.showMessageDialog(null, "Request Approved!");

        }
        else if(radioRejected.isSelected()){
            // request.setRequestResult("Rejected");
            request.setStatus("Rejected");
            JOptionPane.showMessageDialog(null, "Request Rejected!");
        }
        else if(!(radioApproved.isSelected()) && !(radioRejected.isSelected())){

            JOptionPane.showMessageDialog(null, "Please select a result!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SuperStockistWorkAreaJPanel dwjp = (SuperStockistWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void radioApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioApprovedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioApprovedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radioApproved;
    private javax.swing.JRadioButton radioRejected;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
