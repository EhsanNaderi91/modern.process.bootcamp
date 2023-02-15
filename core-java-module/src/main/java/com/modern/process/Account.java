package com.modern.process;

public class Account {
    //static int counter;
    static final String constantAccountNumberPart = "55555";
    private final String accountNumber;
    private final String accountName;
    private int balance;

    public Account(int customerOrder, String name, String surname) {
        this.accountNumber = constantAccountNumberPart + String.format("%05d", customerOrder);
        this.accountName = name + surname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int changeAmount) {
        this.balance += changeAmount;
    }

    public void withdraw(int disChargeAmount) {
        if (balance > disChargeAmount) {
            this.balance -= disChargeAmount;
        } else {
            System.out.println("Your Balance Is Lower Than Your Withdraw Request");
        }
    }

}
