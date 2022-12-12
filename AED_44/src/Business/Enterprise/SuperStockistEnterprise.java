/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class SuperStockistEnterprise extends Enterprise{
    
    public SuperStockistEnterprise(String name){
        super(name,Enterprise.EnterpriseType.SuperStockist);   //SuperStoockist
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
