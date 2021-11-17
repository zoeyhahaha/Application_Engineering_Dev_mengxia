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
public class CustomerList {
    private ArrayList<Customer> customerList;
    
    public CustomerList(){
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(){
        Customer newCustomer = new Customer();
        customerList.add(newCustomer);
        return newCustomer;
    }
    
    public void deleteCustomer(Customer customer){
        customerList.remove(customer);
    }
}
