/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MerchantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.QualityLabEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.QualityLabOrganization;
import Business.Organization.MerchantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugRequirementRequest;
import Business.WorkQueue.Inventory;
import Business.WorkQueue.InventoryDirectory;
import Business.WorkQueue.Products;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anouksha
 */
public class MerchantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private DrugRequirementRequest request;
    private ArrayList<Inventory> inventoryList;
    private ArrayList<Products> productList;
    private ArrayList<Products> reqProductList;
    UserAccount userAccount;
    private Organization organization;
    EcoSystem ecosystem;

    Enterprise enterprise;

    public MerchantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, MerchantOrganization supplierOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        // productList = request.getProductList();
        this.enterprise = enterprise;
        this.organization = supplierOrganization;
        this.userAccount = account;
        this.ecosystem = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
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

        btnProductsList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        btnProductsList.setBackground(new java.awt.Color(0, 0, 102));
        btnProductsList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnProductsList.setForeground(new java.awt.Color(255, 255, 255));
        btnProductsList.setText("View Drug Request");
        btnProductsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsListActionPerformed(evt);
            }
        });

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 255));
        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
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
        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(0, 0, 102));
        btnApprove.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        enterpriseLabel1.setBackground(new java.awt.Color(0, 0, 102));
        enterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Supplier Dashboard");

        refreshJButton.setBackground(new java.awt.Color(0, 0, 102));
        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProductsList)
                        .addGap(0, 1023, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProductsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(733, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsListActionPerformed


    }//GEN-LAST:event_btnProductsListActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == null) {
            request.setReceiver(userAccount);
        }
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        int count = 0, oldCount = 0, newCount = 0;
        if (selectedRow < 0) {
            return;
        }
        DrugRequirementRequest request = (DrugRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getReceiver() == userAccount) {

            request.setReceiver(null);

            System.out.println(request.getSuppProductList() + "Suppliser List");

//           
            System.out.println("=---------2nd for Prod Name");
            int reqCount = 0, suppCount = 0, changeCount = 0;
            for (Inventory inSupp : InventoryDirectory.getInventoryList()) {
                for (Products prod : request.getProductList()) {

                    System.out.println(prod.getProductName() + "Prod Name");
                    if (prod.getProductName().equalsIgnoreCase(inSupp.getProductName())) {
                        if (prod.getQuantity() < inSupp.getQuantity()) {
                            System.out.println("CHECK COUNT"+ prod.getProductName());
                            suppCount = inSupp.getQuantity();
                            reqCount = prod.getQuantity();
                            changeCount = suppCount - reqCount;
                            inSupp.setQuantity(changeCount);
                            System.out.println("CHECK COUNT"+ changeCount);

                        }
                        else
                        {
                            System.out.println("CHECK BIGEER "+ prod.getProductName()+"  "+ prod.getQuantity());
                            inSupp.setQuantity(0);
                            System.out.println("CHECK BIGEER "+ inSupp.getProductName()+"  "+ inSupp.getQuantity());
                        }
                    }
                }
            }
   
            request.setStatus("Sent to Quality");
            if (request.getReceiver() == userAccount) {
                this.request.setReceiver(null);

            }



            for (Network n : ecosystem.getNetworkList()) {

                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                    //   e.setEnterpriseType(Enterprise.EnterpriseType.QualityCheck);
                    //if(e.getEnterpriseType().getValue().equals("Quality Check"))
                    if (e instanceof QualityLabEnterprise) {

                        Organization org = null;
                        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof QualityLabOrganization) { //changed from shlter to ngo organization
                                org = organization;
                                break;
                            }
                        }
                        if (org != null) {

                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Request Successfully Approved!!");
        } else {
            JOptionPane.showMessageDialog(null, "Request Assign FIRST!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnProductsList;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
