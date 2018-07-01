package com.company;



public class Main {

    public static void main(String[] args) {
        com.company.Bank bank=new com.company.Bank("INDIAN BANK");
        bank.addBranch("B1");
        bank.addCustomer("B1","Tim",788);
        bank.listCustomers("B1",true);
        if(!bank.addCustomer("B1","Tim",788)){
            System.out.print("customer doesnt exist");

        }


	// write your code here
    }
}
