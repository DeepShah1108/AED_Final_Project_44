/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author deepshah
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        system = dB4OUtil.retrieveSystem();
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

        jSplitPane = new javax.swing.JSplitPane();
        upperContainer = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtPasswordField = new javax.swing.JPasswordField();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        upperContainer.setBackground(new java.awt.Color(0, 0, 0));
        upperContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        upperContainer.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 104, -1));

        txtPassword.setUI(null);
        upperContainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 37, 3, 0));

        btnLogin.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        upperContainer.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 104, 20));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        upperContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        upperContainer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnLogout.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        upperContainer.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 20));
        upperContainer.add(txtPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 104, -1));

        enterpriseLabel.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("MEDCARE");
        upperContainer.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 190, 60));

        jLabel3.setText("jLabel3");
        upperContainer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 160, -1));

        jSplitPane.setTopComponent(upperContainer);

        userProcessContainer.setBackground(new java.awt.Color(51, 0, 0));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel4.setText("jLabel4");
        userProcessContainer.add(jLabel4, "card2");

        jSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String uname = txtUsername.getText();
        char[] password1 = txtPasswordField.getPassword();

        if(uname.equalsIgnoreCase("") || password1.equals("") || (uname.equalsIgnoreCase("") && password1.equals(""))){

            JOptionPane.showMessageDialog(null, "Fields Cannot Be Empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }

        //***************************** Starting of Email Logic

//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", 465);
//        props.put("mail.smtp.user", "voidxisalive@gmail.com");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.debug", "true");
//        props.put("mail.smtp.socketFactory.port", 465);
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.socketFactory.fallback", "false");
//        try {
//            //Class.forName("com.mysql.jdbc.Driver");
//            // Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingcart","root","Bintu2018$");
//            // String query = "select Password from users where EmailAddress LIKE '"+jTextFieldEmailAdd.getText().trim()+"'";
//            //PreparedStatement statmnt = con.prepareStatement(query);
//            //ResultSet result = statmnt.executeQuery();
//            // if (result.next())
//            // {
//                // String fetchedPassword = result.getString("Password");
//                Session session = Session.getDefaultInstance(props, null);
//                session.setDebug(true);
//                MimeMessage message = new MimeMessage(session);
//                message.setText("The person login is" + " " +userName);
//                message.setSubject("Login Person");
//                message.setFrom(new InternetAddress("voidxisalive@gmail.com"));
//                message.addRecipient(RecipientType.TO, new InternetAddress("voidxisalive@gmail.com"));
//                message.saveChanges();
//                //                Transport transport = session.getTransport("smtp");
//                ////                transport.connect("smtp.gmail.com", "voidxisalive@gmail.com", "Voidx@12345");
//                //                transport.sendMessage(message, message.getAllRecipients());
//                //                transport.close();
//                //jLabelResponse.setText("Your password mailed to you");
//                // }
//        } catch (Exception e) {
//            e.printStackTrace();
//            //jLabelResponse.setText("Email Address not found");
//        }
        //*************************************End of addition for sending mail

        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        btnLogout.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPasswordField.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUsername.setText("");
        txtPasswordField.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel upperContainer;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
