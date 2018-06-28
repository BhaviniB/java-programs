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
                    addItem();
                    break;
                case 3:
                    findItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    quit = true;
                    break;


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
        System.out.println("\t 6 to quit");

    }


    public static void addItem ()
    {

        System.out.print("please enter the grocery item");
        groceryList.addGroceryItem(scan.nextLine());

    }
    public static void modifyItem()
    {

        System.out.println("enter the item number");
        int pos=scan.nextInt();
        scan.nextLine();
        System.out.println("enter the name of the item");
        String it=scan.nextLine();
        groceryList.modifyGroceryItem(pos-1,it);

    }

    public static void removeItem(){
        System.out.println("enter the item number");
        int pos=scan.nextInt();
        scan.nextLine();
        groceryList.removeGroceryItem(pos);

    }

    public  static void findItem()
    {

        System.out.println("ite to search for");
        String s=scan.nextLine();
        if(groceryList.findGroceryItem(s)!=null){

            System.out.println("found the item");

        }
        else {
            System.out.print("not found");
        }
    }


}
