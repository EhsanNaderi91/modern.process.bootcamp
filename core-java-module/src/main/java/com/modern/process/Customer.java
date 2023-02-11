package com.modern.process;

public class Customer {
    Account eachUser ;
    String name;
    String surname;
    String age;
    String phoneNumber;

    public Customer(Account eachUser, String name, String surname, String age, String phoneNumber) {
        this.eachUser = eachUser;
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
    public void displayAccountNumber() {
        System.out.println(eachUser.getAccountNumber());
    }
    public void chargeBalance(int charge){
        eachUser.changeBalance(charge);
    }
    public void showBalance(){
        System.out.println(eachUser.getBalance());
    }
}
