package com.Sumedh;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches= new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
        if(findBranch(name)==null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String BranchName, String name,double initialAmount){
        Branch branch= findBranch(BranchName);
        if(branch != null){
            return branch.newCustomer(name,initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String CustomerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            branch.addCustomerTransaction(CustomerName,amount);
        }
        return false;
    }
    private Branch findBranch(String name){
        for(int i=0;i<branches.size();i++){
            Branch branch= this.branches.get(i);
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public boolean listCustomers(String BranchName,boolean ShowTransactions){
        Branch branch= findBranch(BranchName);
        if(branch!=null){
            System.out.println("Customers for branch " +branch.getName());
            ArrayList<Customer> branchCustomers= branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer= branchCustomers.get(i);
                System.out.println("com.Sumedh.Customer: "+branchCustomer.getName() + "["   + (i+1)+   "]");
                if(ShowTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions= branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size();j++){
                        System.out.println("[" +(j+1) + "] Amount " +transactions.get(j));
                    }
                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
