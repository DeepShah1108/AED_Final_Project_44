/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author deepshah
 */
public class InventoryDirectory {
    
    public static ArrayList<Inventory> inventoryList  = new ArrayList<>();
    private InventoryDirectory newInventoryList;
    
    
   static InventoryDirectory iDir=null;
     
    private InventoryDirectory() {
        //giving drug names for the database 
     	Inventory inv1  = new Inventory("101", "Acetaminophen","Dayquil Products","Available",100);
        Inventory inv2  = new Inventory("102", "Dextromethorphan","Dayquil Products","Available",100);
        Inventory inv3  = new Inventory("103", "Phenylephrine","Dayquil Products","Available",100);
        Inventory inv4  = new Inventory("104", "Neomycin","NeoSporin Products","Available",100);
        Inventory inv5  = new Inventory("105", "Bacitracin","NeoSporin Products","Available",100);
        Inventory inv6  = new Inventory("106", "Polymyxin","NeoSporin Products","Available",100);
        Inventory inv7  = new Inventory("107", "DiphenylMethoxy","Benadryl Products","Available",100);
        Inventory inv8  = new Inventory("108", "Loratadine","Benadryl Products","Available",100);
        Inventory inv9  = new Inventory("109", "Ham","Meat Products","Available",100);
        Inventory inv10 = new Inventory("110", "Acetominophen","Tylenol","Available",100);
        Inventory inv11 = new Inventory("111", "Lyrica","Tylenol","Available",100);
        Inventory inv12 = new Inventory("112", "Dolo","Tylenol","Available",100);
        Inventory inv13 = new Inventory("113", "Crocin","Claritin","Available",100);
        Inventory inv14 = new Inventory("114", "Cipla","Claritin","Available",100);
        Inventory inv15 = new Inventory("115", "Niclo","Claritin","Available",100);
        Inventory inv16 = new Inventory("116", "Ozempic","Advil","Available",100);
        Inventory inv17 = new Inventory("117", "Methadone","Advil","Available",100);
        Inventory inv18 = new Inventory("118", "Kevzara","Advil","Available",100);
        
        
        //add tye drug names
        inventoryList.add(inv1);
        inventoryList.add(inv2);
        inventoryList.add(inv3);
        inventoryList.add(inv4);
        inventoryList.add(inv5);
        inventoryList.add(inv6);
        inventoryList.add(inv7);
        inventoryList.add(inv8);
        inventoryList.add(inv9);
        inventoryList.add(inv10);
        inventoryList.add(inv11);
        inventoryList.add(inv12);
        inventoryList.add(inv13);
        inventoryList.add(inv14);
        inventoryList.add(inv15);
        inventoryList.add(inv16);
        inventoryList.add(inv17);
        inventoryList.add(inv18);

    }

    public static ArrayList<Inventory> getInventoryList() {
        
        if(iDir==null)
        {
            iDir=new InventoryDirectory();
           // inventoryList=new ArrayList<>();
        }
        return inventoryList;
    }

    public static void setInventoryList(ArrayList<Inventory> inventoryList) {
        InventoryDirectory.inventoryList = inventoryList;
    }
    
    public  ArrayList<Inventory> getArrayUniqueList() {
        return inventoryList;
    }
}