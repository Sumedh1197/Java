package com.Sumedh;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double InitialAmount){
        if(findCustomer(name) == null){
            this.customers.add(new Customer(name,InitialAmount));
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer= findCustomer(name);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name){
        for(int i=0;i<customers.size();i++){
            Customer checkCustomer= this.customers.get(i);
            if(checkCustomer.getName().equals(name)){
                return checkCustomer;
            }
        }
        return null;
    }
}
