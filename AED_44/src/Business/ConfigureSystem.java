/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;


import Business.Employee.Employee; // Importing employee directory

import Business.Role.SystemAdminRole;    

import Business.UserAccount.UserAccount;

import Business.WorkQueue.InventoryDirectory;  //importing inventory directory 

/**
 *
 * @author deepshah
 */


public class ConfigureSystem {
    public static EcoSystem configure(){  //configuring the system
     EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");  //giving the login credentials as sysadmin
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        return system;

    }
    
}

