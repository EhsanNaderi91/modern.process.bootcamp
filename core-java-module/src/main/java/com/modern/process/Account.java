package com.modern.process;

public class Account {
    //static int counter;
    final String constantAccountNumberPart = "55555";
    //private int additiveAccountNumberPart ;
    private String accountNumber;
    private int balance;
    public Account(int customerOrder) {
        this.accountNumber = constantAccountNumberPart + String.format("%05d", customerOrder);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void changeBalance(int changeAmount){
        this.balance += changeAmount;
    }

}
