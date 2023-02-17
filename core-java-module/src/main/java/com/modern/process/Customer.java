package com.modern.process;

public class Customer {
    public Account client;
    private LoanType loanType;
    private LoanStatus loanStatus;
    private String name;
    private String surname;
    private String age;
    private String phoneNumber;

    public Customer(Account client, String name, String surname, String age, String phoneNumber) {
        this.client = client;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String AccountNumber() {
        return client.getAccountNumber();
    }

    public int getBalance() {
        return client.getBalance();
    }

    public void deposit(int charge) {
        client.deposit(charge);
    }

    public void withdraw(int disCharge) {
        client.withdraw(disCharge);
    }

    public int getSavingAccountInterestRate() {
        if (client instanceof SavingAccount) {
            return ((SavingAccount) client).interestRate;
        } else {
            System.out.println("There Is Not A Saving Account");
            return 0;
        }
    }
    public void setSavingAccountInterestRate(int interestRate) {
        if (client instanceof SavingAccount) {
            ((SavingAccount) client).interestRate = interestRate;
        } else {
            System.out.println("There Is Not A Saving Account");
        }
    }
    public LoanType getLoanType() {
        if (client instanceof LoanAccount) {
            return ((LoanAccount) client).getLoanType();
        }
        else {
            System.out.println("There Is Not A Loan Account");
            return null;
        }
    }
    public void setLoanType(LoanType loanType) {
        if (client instanceof LoanAccount) {
            ((LoanAccount) client).setLoanType(loanType);
        }
        else {
            System.out.println("There Is Not A Loan Account");
        }
    }
    public LoanStatus getLoanStatus() {
        if (client instanceof LoanAccount) {
            return ((LoanAccount) client).getLoanStatus();
        }
        else {
            System.out.println("There Is Not A Loan Account");
            return null;
        }
    }
    public void setLoanStatus(LoanStatus loanStatus) {
        if (client instanceof LoanAccount) {
            ((LoanAccount) client).setLoanStatus(loanStatus);
        }
        else {
            System.out.println("There Is Not A Loan Account");
        }
    }
}