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
public class patientList {
    private ArrayList<patient> Patient;
    
    public patientList(){
        this.Patient = new ArrayList<patient>();
    }

    public ArrayList<patient> getPatient() {
        return Patient;
    }

    public void setPatient(ArrayList<patient> patient) {
        this.Patient = patient;
    }
    
    public patient addPatient(){
        patient newPatient = new patient();
        Patient.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(patient patient){
        Patient.remove(patient);
    }
}
