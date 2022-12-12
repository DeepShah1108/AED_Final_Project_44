/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SuperStockistAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.QualityLabOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SuperStockistRole.SuperStockistWorkAreaJPanel;
import UserInterface.QualityLabRole.QualityLabWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author deepshah
 */
public class SuperStockistRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SuperStockistWorkAreaJPanel(userProcessContainer, account, (SuperStockistAdminOrganization)organization,enterprise, business);
    }
    
}
