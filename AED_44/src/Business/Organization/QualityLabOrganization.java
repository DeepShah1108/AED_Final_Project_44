/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.QualityLabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anouksha
 */
public class QualityLabOrganization extends Organization{
   
     public QualityLabOrganization() {
        super(Organization.Type.QualityLabOrganization.getValue());  //QualityLab
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new QualityLabRole());
        return roles;
    }
    
}
