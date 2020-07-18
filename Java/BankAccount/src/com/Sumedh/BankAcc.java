package com.Sumedh;

public class BankAcc {
    private String account_number;
    private String customer_name;
    private Long balance;
    private String email;
    private String phone_number;

    public void setAccount_number(String account_number){
        this.account_number=account_number;
    }
    public String getAccount_number(){
        return this.account_number;
    }
    public void setCustomer_name(String customer_name){
        this.customer_name=customer_name;
    }
    public String getCustomer_name(){
        return this.customer_name;
    }
    public void setBalance(long balance){
        this.balance=balance;
    }
    public long getBalance(){
        return this.balance;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhone_number(String phone_number){
        this.phone_number=phone_number;
    }
    public String getPhone_number(){
        return this.phone_number;
    }
    public long DepositFunds(int amountDeposit) {
        long newBalance = 0;
        if (amountDeposit > 0) {
            newBalance = this.balance + amountDeposit;
            return newBalance;

        } else {
            newBalance = this.balance;
            return newBalance;
        }
    }
    public long WithdrawFunds(long amountWithdraw){
        long BalanceAmt=0;
        if(this.balance<amountWithdraw){
            return -1;
        }
        else{
            BalanceAmt= this.balance-amountWithdraw;
            return BalanceAmt;
        }
    }
}
