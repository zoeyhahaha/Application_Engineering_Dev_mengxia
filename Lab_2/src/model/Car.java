/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mengxiazhang
 */
public class Car {
    
    private String carBrand;
    private int year;
    private int carSeats;
    //private String carNum;
    private String serialNum;
    private String carModel;
    private String city;
    private String expireDate;
    
    private String usedByUber;
    private String avail;
    
    private String date;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        isEmp(carBrand);
        carBrand = carBrand.toLowerCase();
        this.carBrand = carBrand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
    }

//    public String getCarNum() {
//        return carNum;
//    }
//
//    public void setCarNum(String carNum) {
//        this.carNum = carNum;
//    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        isEmp(serialNum);
        this.serialNum = serialNum;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        isEmp(carModel);
        this.carModel = carModel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        isEmp(city);
        city = city.toLowerCase();
        this.city = city;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getUsedByUber() {
        return usedByUber;
    }

    public void setUsedByUber(String UsedByUber) {
        this.usedByUber = UsedByUber;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    @Override
    public String toString(){
        return carBrand;
    }
    
    public static void isEmp(String str){
        if(str.isEmpty()){
          JOptionPane.showMessageDialog(null, "please complete all information");
          
            try {
                str.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
            }
          str.notify();
        }
        
    
    }
            
}
