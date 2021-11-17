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
public class MenuList {
    private ArrayList<Menu> menuList;
    
    public MenuList(){
        this.menuList = new ArrayList<Menu>();
    }

    public ArrayList<Menu> getMenu() {
        return menuList;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menuList = menu;
    }
    
    public Menu addMenu(){
       Menu newMenu = new Menu();
       menuList.add(newMenu);
       return newMenu;
    }
    
    public void deleteMenu(Menu menu){
        menuList.remove(menu);
    }
}
