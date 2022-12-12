/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author deepshah
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        //Enum of exterprises
        SuperStockist("SuperStockist"),
        Pharmacist("Pharmacist"),
        Distributor("Distributor"), //distributor
        QualityLab("QualityLab"),
        Merchant("Merchant");
       
        
        private String value;
        
        
        private EnterpriseType(String value){
            
            this.value=value;
        }
        public String getValue() {
            
            return value;
        }
        @Override
        public String toString(){
        return value;

    }
    }
    //superstockist 
    public enum EnumType1{
        
        
        SuperStockist("SuperStockist"),StockistOrganization("SuperStockist"); 
        private String value;
        private EnumType1(String value) {
            
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    //pharmacist
    public enum EnumType2{
       Pharmacist("Pharmacist"),PharmacistOrganization("Pharmacist");
       
       
        private String value;
        private EnumType2(String value) {
            this.value = value;
            
        }
        public String getValue() {
            return value;
        }
    }
    //Distributor
    public enum EnumType3{
       Distributor("Distributor"),DistributorOrganization("Distributor Drug Organization");
       
        private String value;
        private EnumType3(String value) {
            
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    //qualitylab
    public enum EnumType4{
       QualityLab("QualityLab"),QualityLabOrganization("QualityLab Organization");
        private String value;
        private EnumType4(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    //Merchant
    public enum EnumType5{
       Merchant("Merchant"),MerchantOrganization("Merchant Organization");
        private String value;
        private EnumType5(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }


    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}
