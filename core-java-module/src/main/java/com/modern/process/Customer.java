package com.modern.process;

public class Customer {
    public Account client;
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

    public void showAccountNumber() {
        System.out.println(client.getAccountNumber());
    }

    public void showBalance() {
        System.out.println(client.getBalance());
    }

    public void deposit(int charge) {
        client.deposit(charge);
    }

    public void withdraw(int disCharge) {
        client.withdraw(disCharge);
    }
}
