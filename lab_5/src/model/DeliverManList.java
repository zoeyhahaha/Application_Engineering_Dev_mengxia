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
public class DeliverManList {
    
    private ArrayList<DeliverMan> deliverManList;
    
    public DeliverManList(){
        this.deliverManList = new ArrayList<DeliverMan>();
    }

    public ArrayList<DeliverMan> getDeliverMan() {
        return deliverManList;
    }

    public void setDeliverMan(ArrayList<DeliverMan> deliverMan) {
        this.deliverManList = deliverMan;
    }
    
    public DeliverMan addDeliverMan(){
        DeliverMan newDeliverMan = new DeliverMan();
        deliverManList.add(newDeliverMan);
        return newDeliverMan;
    }
    
    public void deleteDeliverMan(DeliverMan deliverMan){
        deliverManList.remove(deliverMan);
    }
}
