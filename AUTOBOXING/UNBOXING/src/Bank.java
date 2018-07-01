package com.company;
import com.company.Branch;
import com.company.Customer;

import java.util.ArrayList;

public class Bank {

    String name;
    private ArrayList<Branch>branches;

    public Bank(String name) {
        this.name = name;
        branches=new ArrayList<Branch>();

    }
    public boolean addBranch(String branchName){


        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;

        }
        else return false;

    }
    public boolean addCustomer(String branchName, String customerName,double initialAmount) {


        Branch branch = findBranch(branchName);
        if (branch != null){

            return branch.newCustomer(customerName,initialAmount);



        }
        return false;

    }
    private Branch findBranch(String branchName)
    {
        for (int i=0;i<this.branches.size();i++)
        {
            Branch checkedBranch=this.branches.get(i);


            if(checkedBranch.getName().equals(branchName)){

                return this.branches.get(i);
            }
        }
        return null;

    }


    public boolean addCustomerTransaction(String branchName,String customerName,double amount){

        Branch branch=findBranch(branchName);
        if(branch!=null){

            return branch.addCustomerTransaction(customerName,amount);

        }
        return false;



    }

public boolean listCustomers(String branchName,boolean showTransaction)
{

    Branch branch=findBranch(branchName);
    if(branch!=null){
        System.out.println("customers for branch name:"+branch.getName());
        ArrayList<Customer> branchCustomers=branch.getCustomers();

        for(int i=0;i<branchCustomers.size();i++){

            Customer branchCustomer=branchCustomers.get(i);
            System.out.print("Customer"+branchCustomer.getName());
            if(showTransaction){
                System.out.println("transactions:");
                ArrayList<Double> transactions=branchCustomer.getTransactions();
                for(int j=0;j<transactions.size();j++){

                    System.out.println("amount"+transactions.get(j));

                }

            }
        }
        return true;
    }
    else{
        return false;
    }
}

}
