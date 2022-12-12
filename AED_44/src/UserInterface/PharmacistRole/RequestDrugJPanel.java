/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SuperStockistEnterprise;
import Business.Network.Network;
import Business.Organization.SuperStockistAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugRequirementRequest;
import Business.WorkQueue.Products;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team Void
 */
public class RequestDrugJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestFoodJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem business;
   

    public RequestDrugJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.business = business;
        valueLabel.setText(enterprise.getName());

        comboDayquilProducts.setEnabled(false);
        comboTylenolProducts.setEnabled(false);
        comboNeoSporinProducts.setEnabled(false);
        comboBenadrylProducts.setEnabled(false);
        comboClaritinProducts.setEnabled(false);
        comboAdvilProducts.setEnabled(false);
        
        quantDayquil.setEnabled(false);
        quantTylenol.setEnabled(false);
        quantNeoSporin.setEnabled(false);
        quantAdvil.setEnabled(false);
        quantBenadryl.setEnabled(false);
        quantClaritin.setEnabled(false);
        
        //btnReset.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        comboDayquilProducts = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkDayquil = new javax.swing.JCheckBox();
        checkNeoSporin = new javax.swing.JCheckBox();
        checkBenadryl = new javax.swing.JCheckBox();
        checkTylenol = new javax.swing.JCheckBox();
        checkClaritin = new javax.swing.JCheckBox();
        checkAdvil = new javax.swing.JCheckBox();
        quantDayquil = new javax.swing.JSpinner();
        comboNeoSporinProducts = new javax.swing.JComboBox<>();
        comboBenadrylProducts = new javax.swing.JComboBox<>();
        comboTylenolProducts = new javax.swing.JComboBox<>();
        comboClaritinProducts = new javax.swing.JComboBox<>();
        comboAdvilProducts = new javax.swing.JComboBox<>();
        quantNeoSporin = new javax.swing.JSpinner();
        quantBenadryl = new javax.swing.JSpinner();
        quantAdvil = new javax.swing.JSpinner();
        quantClaritin = new javax.swing.JSpinner();
        quantTylenol = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        backJButton1 = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(0, 0, 102));
        requestTestJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Submit Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 160, 50));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel1.setText("Quantity:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 70, 20));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 226, -1));

        btnReset.setBackground(new java.awt.Color(0, 0, 102));
        btnReset.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset Options");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 160, 50));

        valueLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 260, -1));

        enterpriseLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        enterpriseLabel.setText("Populate Items:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 240, 30));

        comboDayquilProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acetaminophen", "Dextromethorphan", "Phenylephrine" }));
        add(comboDayquilProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 140, -1));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel4.setText("Drug Brand:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel5.setText("Drug:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        checkDayquil.setText("Dayquil");
        checkDayquil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDayquilActionPerformed(evt);
            }
        });
        add(checkDayquil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        checkNeoSporin.setText("NeoSporin");
        checkNeoSporin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNeoSporinActionPerformed(evt);
            }
        });
        add(checkNeoSporin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        checkBenadryl.setText("Benadryl");
        checkBenadryl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBenadrylActionPerformed(evt);
            }
        });
        add(checkBenadryl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        checkTylenol.setText("Tylenol");
        checkTylenol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTylenolActionPerformed(evt);
            }
        });
        add(checkTylenol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        checkClaritin.setText("Claritin");
        checkClaritin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkClaritinActionPerformed(evt);
            }
        });
        add(checkClaritin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        checkAdvil.setText("Advil");
        checkAdvil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdvilActionPerformed(evt);
            }
        });
        add(checkAdvil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        quantDayquil.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        add(quantDayquil, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        comboNeoSporinProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Neomycin", "Bacitracin", "Polymyxin" }));
        comboNeoSporinProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNeoSporinProductsActionPerformed(evt);
            }
        });
        add(comboNeoSporinProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 140, -1));

        comboBenadrylProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DiphenylMethoxy", "Loratadine", " ", " " }));
        add(comboBenadrylProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 140, -1));

        comboTylenolProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acetominophen", "Lyrica", "Dolo" }));
        add(comboTylenolProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 140, -1));

        comboClaritinProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crocin", "Cipla", "Niclo" }));
        add(comboClaritinProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 140, -1));

        comboAdvilProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ozempic", "Methadone", "Kevzara" }));
        add(comboAdvilProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 140, -1));

        quantNeoSporin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        add(quantNeoSporin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        quantBenadryl.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        add(quantBenadryl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        quantAdvil.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        add(quantAdvil, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        quantClaritin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        add(quantClaritin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        quantTylenol.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        add(quantTylenol, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setText("Order Message");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

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
        jScrollPane1.setViewportView(tblProducts);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 610, 130));

        backJButton1.setBackground(new java.awt.Color(0, 0, 102));
        backJButton1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(255, 255, 255));
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 160, 50));

        enterpriseLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("SELECT DRUG AREA");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        //******************* Validation *********************
        
         if(!(checkDayquil.isSelected()) && !(checkNeoSporin.isSelected()) && !(checkBenadryl.isSelected()) && !(checkTylenol.isSelected()) && !(checkClaritin.isSelected())){
            
            JOptionPane.showMessageDialog(null, "Please Select Products!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         String mess = messageJTextField.getText();
         if (mess.equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Please add comments", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        //**************************************

         int check=0;
       
         String message = messageJTextField.getText();
       
        ArrayList<Products> productList = new ArrayList<>();
        
        if (checkDayquil.isSelected()) {
            
            if(quantDayquil.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
           
            Products p = new Products();
            p.setProductName(String.valueOf(comboDayquilProducts.getSelectedItem()));
            p.setProductType("Dayquil");
            p.setQuantity((Integer) quantDayquil.getValue());
            productList.add(p);
            populateData(productList);
        }
        if (checkAdvil.isSelected()) {
            
            if(quantAdvil.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboAdvilProducts.getSelectedItem()));
            p.setProductType("Advil");
            p.setQuantity((Integer) quantAdvil.getValue());
             productList.add(p);
             populateData(productList);
        }
        if (checkClaritin.isSelected()) {
            
            if(quantClaritin.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboClaritinProducts.getSelectedItem()));
            p.setProductType("Claritin");
            p.setQuantity((Integer) quantClaritin.getValue());
             productList.add(p);
             populateData(productList);
        }
        if (checkTylenol.isSelected()) {
            
            if(quantTylenol.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboTylenolProducts.getSelectedItem()));
            p.setProductType("Tylenol");
            p.setQuantity((Integer) quantTylenol.getValue());
            productList.add(p);
            populateData(productList);
        }
        if (checkBenadryl.isSelected()) {
            
            if(quantBenadryl.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboBenadrylProducts.getSelectedItem()));
            p.setProductType("Benadryl");
            p.setQuantity((Integer) quantBenadryl.getValue());
             productList.add(p);
             populateData(productList);
        }
        if (checkNeoSporin.isSelected()) {
            
            if(quantNeoSporin.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboNeoSporinProducts.getSelectedItem()));
            p.setProductType("NeoSporin");
            p.setQuantity((Integer) quantNeoSporin.getValue());
            productList.add(p);
            populateData(productList);
        }
        
       
       
        DrugRequirementRequest request = new DrugRequirementRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setProductList(productList);
        
        

        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                   e.setEnterpriseType(Enterprise.EnterpriseType.SuperStockist);
                   //below changes are made for twice appearance of request on Shelter screen
                   //if (e.getEnterpriseType().getValue().equals("NGO"))
                 if (e instanceof SuperStockistEnterprise) {

                    System.out.println(e.getEnterpriseType().getValue().equals("NGO") + "Chal ra hai");

                    Organization org = null;
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof SuperStockistAdminOrganization) { //changed from shlter to ngo organization
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
        
        JOptionPane.showMessageDialog(null, "Request Initiated Successfully!");
        
        //Clearing the selected options
        
       checkDayquil.setSelected(false);
       checkTylenol.setSelected(false);
       checkNeoSporin.setSelected(false);
       checkAdvil.setSelected(false);
       checkBenadryl.setSelected(false);
       checkClaritin.setSelected(false);
       
        comboDayquilProducts.setEnabled(false);
        comboTylenolProducts.setEnabled(false);
        comboNeoSporinProducts.setEnabled(false);
        comboBenadrylProducts.setEnabled(false);
        comboClaritinProducts.setEnabled(false);
        comboAdvilProducts.setEnabled(false);
        
        quantDayquil.setEnabled(false);
        quantTylenol.setEnabled(false);
        quantNeoSporin.setEnabled(false);
        quantAdvil.setEnabled(false);
        quantBenadryl.setEnabled(false);
        quantClaritin.setEnabled(false);
        
        btnReset.setEnabled(false);
        messageJTextField.setText("");
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

        public void populateData(ArrayList<Products> productList) {

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        model.setRowCount(0);

            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                ((DefaultTableModel) tblProducts.getModel()).addRow(row);  
        }
    }
        
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

       checkDayquil.setSelected(false);
       checkTylenol.setSelected(false);
       checkNeoSporin.setSelected(false);
       checkAdvil.setSelected(false);
       checkBenadryl.setSelected(false);
       checkClaritin.setSelected(false);
       
        comboDayquilProducts.setEnabled(false);
        comboTylenolProducts.setEnabled(false);
        comboNeoSporinProducts.setEnabled(false);
        comboBenadrylProducts.setEnabled(false);
        comboClaritinProducts.setEnabled(false);
        comboAdvilProducts.setEnabled(false);
        
        quantDayquil.setEnabled(false);
        quantTylenol.setEnabled(false);
        quantNeoSporin.setEnabled(false);
        quantAdvil.setEnabled(false);
        quantBenadryl.setEnabled(false);
        quantClaritin.setEnabled(false);


    }//GEN-LAST:event_btnResetActionPerformed

    private void checkDayquilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDayquilActionPerformed
        comboDayquilProducts.setEnabled(true);
        quantDayquil.setEnabled(true);
        
        //*************** added recent ***********
    }//GEN-LAST:event_checkDayquilActionPerformed

    private void checkNeoSporinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNeoSporinActionPerformed
        comboNeoSporinProducts.setEnabled(true);
        quantNeoSporin.setEnabled(true);
    }//GEN-LAST:event_checkNeoSporinActionPerformed

    private void checkBenadrylActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBenadrylActionPerformed
        comboBenadrylProducts.setEnabled(true);
        quantBenadryl.setEnabled(true);
    }//GEN-LAST:event_checkBenadrylActionPerformed

    private void checkTylenolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTylenolActionPerformed
        comboTylenolProducts.setEnabled(true);
        quantTylenol.setEnabled(true);
    }//GEN-LAST:event_checkTylenolActionPerformed

    private void checkClaritinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkClaritinActionPerformed
        comboClaritinProducts.setEnabled(true);
        quantClaritin.setEnabled(true);
    }//GEN-LAST:event_checkClaritinActionPerformed

    private void checkAdvilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdvilActionPerformed
        comboAdvilProducts.setEnabled(true);
        quantAdvil.setEnabled(true);
    }//GEN-LAST:event_checkAdvilActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacistWorkAreaJPanel dwjp = (PharmacistWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void comboNeoSporinProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNeoSporinProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNeoSporinProductsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox checkAdvil;
    private javax.swing.JCheckBox checkBenadryl;
    private javax.swing.JCheckBox checkClaritin;
    private javax.swing.JCheckBox checkDayquil;
    private javax.swing.JCheckBox checkNeoSporin;
    private javax.swing.JCheckBox checkTylenol;
    private javax.swing.JComboBox<String> comboAdvilProducts;
    private javax.swing.JComboBox<String> comboBenadrylProducts;
    private javax.swing.JComboBox<String> comboClaritinProducts;
    private javax.swing.JComboBox<String> comboDayquilProducts;
    private javax.swing.JComboBox<String> comboNeoSporinProducts;
    private javax.swing.JComboBox<String> comboTylenolProducts;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JSpinner quantAdvil;
    private javax.swing.JSpinner quantBenadryl;
    private javax.swing.JSpinner quantClaritin;
    private javax.swing.JSpinner quantDayquil;
    private javax.swing.JSpinner quantNeoSporin;
    private javax.swing.JSpinner quantTylenol;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblProducts;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}