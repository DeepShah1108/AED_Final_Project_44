/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Map.MapViewer;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pankaj Gorav
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTable();
        populateComboBox();
    }
    
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
     
    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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

        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        mapButton = new javax.swing.JButton();
        submitButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Enterprise Type");

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backJButton.setBackground(new java.awt.Color(0, 0, 102));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        enterpriseJTable.setBackground(new java.awt.Color(204, 255, 255));
        enterpriseJTable.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "City", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("City");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manage Enterprise");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Address");

        mapButton.setBackground(new java.awt.Color(0, 0, 102));
        mapButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        mapButton.setForeground(new java.awt.Color(255, 255, 255));
        mapButton.setText("View on Map");
        mapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapButtonActionPerformed(evt);
            }
        });

        submitButton1.setBackground(new java.awt.Color(0, 0, 102));
        submitButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitButton1.setForeground(new java.awt.Color(255, 255, 255));
        submitButton1.setText("Submit");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(655, 655, 655)
                        .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(518, 518, 518)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(52, 52, 52)
                                .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterpriseTypeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(mapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(668, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(mapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(282, 282, 282))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void mapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapButtonActionPerformed
        // TODO add your handling code here:
        if (addressTextField.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Enter address first");  
        }else{
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MapViewer browser = new MapViewer();
                browser.setVisible(true);
                browser.loadURL("https://www.google.com/maps/search/?api=1&query="+addressTextField.getText().trim());
            }
        });
       }
    }//GEN-LAST:event_mapButtonActionPerformed

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        
        //************* Validation ************************
        
        String valName = nameJTextField.getText();
        if(valName.equalsIgnoreCase("")){
            
            JOptionPane.showMessageDialog(null, "Enterprise Name Cannot Be Empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = nameJTextField.getText();

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        populateTable();
        
        JOptionPane.showMessageDialog(null, "Enterprise Created Successfully!");
        nameJTextField.setText("");
    }//GEN-LAST:event_submitButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mapButton;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitButton1;
    // End of variables declaration//GEN-END:variables
}
