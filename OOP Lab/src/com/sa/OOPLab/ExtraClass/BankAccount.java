package com.sa.OOPLab.ExtraClass;

/**
 * Created by akashs on 3/8/17.
 */
public class BankAccount {
    public String memberName;
    public String accountId;
    public double balance;

    public BankAccount(String memberName, String accountId, double balance) {
        this.memberName = memberName;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double balance){
        this.balance += balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean withdraw(double amount){
        if(balance>amount){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
