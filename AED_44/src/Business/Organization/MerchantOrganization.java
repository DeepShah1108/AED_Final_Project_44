/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.MerchantRole;
import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class MerchantOrganization extends Organization{
    
      public MerchantOrganization() {
        super(Organization.Type.MerchantOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MerchantRole());
        return roles;
    }
}
