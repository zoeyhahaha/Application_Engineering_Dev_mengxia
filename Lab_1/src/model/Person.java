/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author mengxiazhang
 */
public class Person {
    
    private String name;
    private String geoData;
    private String birth;
    private String teleNum;
    private String faxNum;
    private String email;
    private String ssn;
    private String medicalNum;
    private String healthNum;
    private String bankNum;
    private String certifiNum;
    private String vehicleNum;
    private String deviceNum;
    private String linkedln;
    private String internetAddr;
    private String nuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("wrong name");
            System.exit(-1);
        } else{
           this.name = name; 
        }
        
    }

    public String getGeoData() {
        return geoData;
    }

    public void setGeoData(String geoData) {
        this.geoData = geoData;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        if(birth.length() == 8 && isNumer(birth)){
            this.birth = birth;
        } else{
            System.out.println("wrong birth");
            System.exit(-1);
        }
        
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        if(teleNum.length() == 8 && isNumer(teleNum)){
            this.teleNum = teleNum;
        } else{
            System.out.println("wrong telephone number");
            System.exit(-1);
        }
        
        
    }

    public String getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(String faxNum) {
        this.faxNum = faxNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn.length() == 9 && isNumer(ssn)){
            this.ssn = ssn;
        } else{
            System.out.println("wrong ssn");
            System.exit(-1);
        }
    }

    public String getMedicalNum() {
        return medicalNum;
    }

    public void setMedicalNum(String medicalNum) {
        this.medicalNum = medicalNum;
    }

    public String getHealthNum() {
        return healthNum;
    }

    public void setHealthNum(String healthNum) {
        this.healthNum = healthNum;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        if(isNumer(bankNum)){
            this.bankNum = bankNum;
        } else{
            System.out.println("wrong bank account number");
            System.exit(-1);
        }
    }

    public String getCertifiNum() {
        return certifiNum;
    }

    public void setCertifiNum(String certifiNum) {
        this.certifiNum = certifiNum;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
    }

    public String getLinkedln() {
        return linkedln;
    }

    public void setLinkedln(String linkedln) {
        this.linkedln = linkedln;
    }

    public String getInternetAddr() {
        return internetAddr;
    }

    public void setInternetAddr(String internetAddr) {
        this.internetAddr = internetAddr;
    }

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        if(nuid.length() == 9 && isNumer(nuid)){
            this.nuid = nuid;
        } else{
            System.out.println("wrong nuid");
            System.exit(-1);
        }
    }
    
    
    public static boolean isNumer(String str){
    for (int i = str.length();--i>=0;){
    if (!Character.isDigit(str.charAt(i))){
            return false;
            }
      }
    return true;
    }
   
    
}
