package com.modern.process;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Surname");
        String surname = sc.nextLine();
        System.out.println("Enter Your Age");
        String age = sc.nextLine();
        System.out.println("Enter Your PhoneNumber");
        String phoneNumber = sc.nextLine();
        Account newAccountObj = new Account(245, name, surname);
        Account newSavingAccountObj = new SavingAccount(246, name, surname, 18);
        Account newLoanAccountObj = new LoanAccount(247, name, surname, LoanType.HomeLoan, LoanStatus.WaitingList);
        Customer newCustomerAccount = new Customer(newAccountObj, name, surname, age, phoneNumber);
        Customer newCustomerSaving = new Customer(newSavingAccountObj, name, surname, age, phoneNumber);
        Customer newCustomerLoan = new Customer(newLoanAccountObj, name, surname, age, phoneNumber);
    }
}