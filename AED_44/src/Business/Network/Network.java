/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author deepshah
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    //Network
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    
    //getName
    public String getName() {
        return name;
    }
//getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
