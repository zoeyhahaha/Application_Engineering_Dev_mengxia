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
public class RestaurantList {
    private ArrayList<Restaurant> restaurantList;
    
    public RestaurantList(){
        this.restaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurant() {
        return restaurantList;
    }

    public void setRestaurant(ArrayList<Restaurant> restaurant) {
        this.restaurantList = restaurant;
    }
    
    public Restaurant addRestaurant(){
        Restaurant newRestaurant = new Restaurant();
        restaurantList.add(newRestaurant);
        return newRestaurant;
    }
    
    public void deleteRestaurant(Restaurant r){
        restaurantList.remove(r);
    }
}
