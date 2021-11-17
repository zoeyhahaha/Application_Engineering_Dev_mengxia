/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mengxiazhang
 */
public class AdminList {
   private ArrayList<Administrator> adminList;
   
   public AdminList(){
       this.adminList = new ArrayList<Administrator>();
   }

    public ArrayList<Administrator> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Administrator> adminList) {
        this.adminList = adminList;
    }
   
    public Administrator addAdmin(){
        Administrator newAdministrator = new Administrator();
        adminList.add(newAdministrator);
        return newAdministrator;
    }
    
    public void deleteAdmin(Administrator administrator){
        adminList.remove(administrator);
    }
    
}
