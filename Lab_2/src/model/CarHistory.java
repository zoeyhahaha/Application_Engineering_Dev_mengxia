/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mengxiazhang
 */
public class CarHistory {
    private ArrayList<Car> history;
    
    public CarHistory(){
     this.history = new ArrayList<Car>();
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addNewCar(){
        Car newCar = new Car();
        history.add(newCar);
        return newCar;
    }
    
    public void deleteCar(Car car) {
        history.remove(car);
    }

    public String lastUpdata(){
        int n = history.size() - 1;
        Car car = history.get(n);
        return car.getDate();   
    }

    
}
