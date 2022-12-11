/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.NGORole;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DistributorOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequirementRequest;
import Business.WorkQueue.Products;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JANU
 */
public class NGOWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NGOAdminOrganization ngoOrganization;
    
    public NGOWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business){
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.ngoOrganization = (NGOAdminOrganization) organization;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        btnSendtoDistributor = new javax.swing.JButton();
        showProductBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("DRUG APPROVAL REQUEST AREA");

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setBackground(new java.awt.Color(0, 0, 102));
        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign To Me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(0, 0, 102));
        processJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process the Drug Request");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(0, 0, 102));
        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnSendtoDistributor.setBackground(new java.awt.Color(0, 0, 102));
        btnSendtoDistributor.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnSendtoDistributor.setForeground(new java.awt.Color(255, 255, 255));
        btnSendtoDistributor.setText("Send to Distributor");
        btnSendtoDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendtoDistributorActionPerformed(evt);
            }
        });

        showProductBtn.setBackground(new java.awt.Color(0, 0, 102));
        showProductBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        showProductBtn.setForeground(new java.awt.Color(255, 255, 255));
        showProductBtn.setText("Display Drug");
        showProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductBtnActionPerformed(evt);
            }
        });

        tblProducts.setBackground(new java.awt.Color(204, 255, 255));
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Brand", "Drug", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProducts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(processJButton)
                                .addGap(28, 28, 28)
                                .addComponent(btnSendtoDistributor)
                                .addGap(27, 27, 27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(showProductBtn)
                            .addGap(54, 54, 54)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {assignJButton, btnSendtoDistributor, showProductBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendtoDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(442, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {assignJButton, btnSendtoDistributor, processJButton, showProductBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be assigned by " + userAccount, "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        FoodRequirementRequest request = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            JOptionPane.showMessageDialog(null, "Please assign the request", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (request.getReceiver().equals(userAccount) && (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing"))) {

            request.setStatus("Processing");
            ProcessNWorkRequestJPanel processWorkRequestJPanel = new ProcessNWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be processed as it is " + request.getStatus(), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnSendtoDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendtoDistributorActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        FoodRequirementRequest distrequest = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (distrequest.getStatus().equalsIgnoreCase("Rejected")) {

            JOptionPane.showMessageDialog(null, "Request has been rejected!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!(distrequest.getStatus().equalsIgnoreCase("Completed"))) {
            JOptionPane.showMessageDialog(null, "Request yet to be approved");
            return;
        }

        // }
        //String message = messageJTextField.getText();
        //FoodRequirementRequest request = new FoodRequirementRequest();
        distrequest.setMessage(distrequest.getMessage());
        distrequest.setSender(userAccount);
        distrequest.setStatus("Sent to Distributor");

        if(distrequest.getReceiver()==userAccount){
            distrequest.setReceiver(null);

        }
        JOptionPane.showMessageDialog(null, "Request Sent to Distributor Successfully!");

        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                // e.setEnterpriseType(Enterprise.EnterpriseType.Distributor);
                if (e instanceof DistributorEnterprise) {

                    Organization org = null;
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DistributorOrganization) { //changed from shlter to ngo organization
                            org = organization;
                            break;
                        }
                    }
                    if (org != null) {

                        org.getWorkQueue().getWorkRequestList().add(distrequest);
                        userAccount.getWorkQueue().getWorkRequestList().add(distrequest);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSendtoDistributorActionPerformed

    private void showProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);
        model.setRowCount(0);

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        ArrayList<Products> productList = ((FoodRequirementRequest) request).getProductList();
        if (productList != null) {
            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                model.addRow(row);

            }
        }
    }//GEN-LAST:event_showProductBtnActionPerformed
    
    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : ngoOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnSendtoDistributor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton showProductBtn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}



