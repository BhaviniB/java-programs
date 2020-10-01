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





//Question-2  Java Program for removing duplicates from integer array

Read more: https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html#ixzz6Za5E63bK




import java.util.Arrays;

public class Main {

  
    public static void main(String args[]) {

        int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }
    }

    /*
      Method to remove duplicates from array in Java, without using
      Collection classes e.g. Set or ArrayList. 
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);     
      
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }
}



