package com.Sumedh;

public class Main {

    public static void main(String[] args) {
        Bank bank= new Bank("HDFC");
        bank.addBranch("Pune");
        bank.addCustomer("Pune","Sumedh",100000);
        bank.addCustomer("Pune", "Ron", 90000);
        bank.addCustomer("Pune","Lory",80000);

        bank.addBranch("Hyderabad");
        bank.addCustomer("Hyderabad","Ram",50000);
        bank.addCustomer("Hyderabad","Arron", 75000);

        bank.addCustomerTransaction("Pune","Sumedh",250000);
        bank.addCustomerTransaction("Pune","Ron",2000);
        bank.addCustomerTransaction("Pune","Ron",30000);

        bank.listCustomers("Pune",true);

        if(!bank.addCustomer("Delhi","Rahul",80000)){
            System.out.println("Delhi branch does not exist");
        }
        if(!bank.addBranch("Adelaide")){
            System.out.println("Branch already exists");
        }



    }
}
