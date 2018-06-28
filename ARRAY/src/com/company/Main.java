package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner (System.in);


    public static void main(String[] args) {


        int arr[]=getIntegers(5);
        sorted(arr);
        printArray(arr);
    }


    public static int[] getIntegers(int capacity){
        int array[]=new int[capacity];
        System.out.println("enter"+capacity+"values");

        for(int i=0;i<array.length;i++){

            array[i]=scan.nextInt();

        }
        return array;

    }

    public static void printArray(int[]array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }
    }
        public static int[] sorted (int[]array1){

            for (int lastUnsortedIndex=array1.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){

                int temp=0;
                for(int i=0;i<lastUnsortedIndex;i++){


                    if(array1[i]>array1[i+1])
                    {
                        temp=array1[i];
                        array1[i]=array1[i+1];
                        array1[i+1]=temp;

                    }
                }

            }
            return array1;


        }

    }
