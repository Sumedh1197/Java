package com.Sumedh;

public class Main {

    public static void main(String[] args) {
        BankAcc bank= new BankAcc();
        bank.setAccount_number("12345ABCD");
        bank.setBalance(1000);
        bank.setCustomer_name("Sumedh Shah");
        bank.setEmail("sumedhshah97@gmail.com");
        bank.setPhone_number("9890252047");
        long a= bank.DepositFunds(10000);
        long b= bank.WithdrawFunds(20000);

        System.out.println("Account number :"+bank.getAccount_number()+"  Name: " +bank.getCustomer_name()+
        " email : " +bank.getEmail() + " and Phone Number " +bank.getPhone_number()+ " has an initial balance of: " +
                bank.getBalance());
        System.out.println("Balance after deposit is : " +a);
        System.out.println("Balance after withdrawl is :" +b);

    }
}
