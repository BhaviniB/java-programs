package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Test<Integer> iobj=new Test<Integer> (15);
        System.out.println(iobj.getObj());

        Test<String >sobj=new Test<String>("hi");
        System.out.println(sobj.getObj());
        
    }
}
