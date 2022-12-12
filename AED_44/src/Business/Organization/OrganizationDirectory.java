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
    
    //create Organization
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        
        //for SuperStockist
        if (type.getValue().equals(Organization.Type.SuperStockistOrganization.getValue())){
            organization = new SuperStockistAdminOrganization();
            organizationList.add(organization);
        }
        //For Admin
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        //for pharmacist
        else if (type.getValue().equals(Organization.Type.PharmacistOrganization.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        }
        //for distributor
        else if (type.getValue().equals(Organization.Type.DistributorOrganization.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }   
        //for quality
        else if (type.getValue().equals(Organization.Type.QualityLabOrganization.getValue())){
            organization = new QualityLabOrganization();
            organizationList.add(organization);
        }
        //for merchant
        else if (type.getValue().equals(Organization.Type.MerchantOrganization.getValue())){
            organization = new MerchantOrganization();
            organizationList.add(organization);
        }
        //for supplier
        else if (type.getValue().equals(Organization.Type.SupplierOrganization.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}
