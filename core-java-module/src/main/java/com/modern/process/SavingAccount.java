package com.modern.process;

public class SavingAccount extends Account {
    int interestRate;

    public SavingAccount(int customerOrder, String name, String surname, int interestRate) {
        super(customerOrder, name, surname);
        this.interestRate = interestRate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}

