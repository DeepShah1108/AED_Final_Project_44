/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.SuperStockistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class SuperStockistAdminOrganization extends Organization{
    
     public SuperStockistAdminOrganization() {
        super(Organization.Type.SuperStockistOrganization.getValue());   //SuperStockist
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SuperStockistRole());
        return roles;
    }
    
}
