/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   
    

    public ArrayList<Enterprise> getEnterpriseList() {
        
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        
        
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    

    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){      //Create enterprise
        Enterprise enterprise=null;
        //Change Enterprise Here
        //into superstockist
        if(type==Enterprise.EnterpriseType.SuperStockist){  
            enterprise=new SuperStockistEnterprise(name);  
            enterpriseList.add(enterprise);
        }
        //into QualityLab
        else if(type==Enterprise.EnterpriseType.QualityLab){
            enterprise=new QualityLabEnterprise(name);
            enterpriseList.add(enterprise);
        }
        //intoDistributor
        else if(type==Enterprise.EnterpriseType.Distributor){
            enterprise=new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        //into Pharmacist
        else if(type==Enterprise.EnterpriseType.Pharmacist){
            enterprise=new PharmacistEnterprise(name);
            enterpriseList.add(enterprise);
        }
        //into Merchant
        else if(type==Enterprise.EnterpriseType.Merchant){
            enterprise=new MerchantEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    
}
