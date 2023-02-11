package com.modern.process;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number Of Customer");
            int num = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < num; i++) {

                System.out.print("Enter customer name: ");
                String name = sc.nextLine();

                System.out.print("Enter customer lastName: ");
                String surname = sc.nextLine();

                System.out.print("Enter customer age: ");
                String age = sc.nextLine();

                System.out.print("Enter customer phone number: ");
                String phoneNumber = sc.nextLine();
                Account newObj = new Account(i);
                customerList.add(new Customer(newObj, name, surname, age, phoneNumber));
            }
            /*System.out.println(customerList.get(0).getName());
            System.out.println(customerList.get(0).getPhoneNumber());
            System.out.println(customerList.get(1).getName());
            System.out.println(customerList.get(1).getPhoneNumber());
            customerList.get(0).displayAccountNumber();
            customerList.get(1).displayAccountNumber();
            customerList.get(0).chargeBalance(200);
            customerList.get(0).chargeBalance(300);
            customerList.get(1).chargeBalance(400);
            customerList.get(0).showBalance();
            customerList.get(1).showBalance();*/

        }
        catch (InputMismatchException e){
            System.out.println("Please Enter A Number!");
            main(args);

        }
    }
}