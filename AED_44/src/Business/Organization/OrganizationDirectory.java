/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.SuperStockistOrganization.getValue())){
            organization = new SuperStockistAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PharmacistOrganization.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DistributorOrganization.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }    
        else if (type.getValue().equals(Organization.Type.QualityLabOrganization.getValue())){
            organization = new QualityLabOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.MerchantOrganization.getValue())){
            organization = new MerchantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SupplierOrganization.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}
