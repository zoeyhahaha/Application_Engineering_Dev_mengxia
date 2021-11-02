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
public class personList {
    
    private ArrayList<person> Person;
    
    public personList(){
        this.Person = new ArrayList<person>();
    }

    public ArrayList<person> getPerson() {
        return Person;
    }

    public void setPerson(ArrayList<person> person) {
        this.Person = person;
    }
    
    public person addPerson(){
        person newPerson = new person();
        Person.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(person person){
        Person.remove(person);
    }
}
