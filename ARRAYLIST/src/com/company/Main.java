package com.company;

import com.company.GroceryList;
import java.util.Scanner;


public class Main {
    private static Scanner scan=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit)
        {

            System.out.println("enterv your choice");
            choice=scan.nextInt();
            scan.nextLine(); //to clear the input buffer

            switch (choice){

                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printItem();
                    break;
                case 2:
                    groceryList.addItem();
                    break;
                case 3:
                    groceryList.findItem();
                    break;;
                case 4:
                    groceryList.modifyItem();
                    break;
                case 5:
                    groceryList.removeItem();

            }
        }

    }

    public static void printInstructions(){


        System.out.println("\n press");
        System.out.println("\t 0 to print instructions");
        System.out.println("\t 1 to print items");
        System.out.println("\t 2 to add");
        System.out.println("\t 3 to find");
        System.out.println("\t 4 to modify");
        System.out.println("\t 5 to remove items");
    }


    
}
