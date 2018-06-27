package com.company;

import com.company.PP;

public class Main {

    public static void main(String[] args) {
        PP printer=new PP(5,true);
        System.out.print("init page count="+printer.getNumberOfPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("pages printed="+pagesPrinted);
        System.out.println("new total="+printer.getNumberOfPagesPrinted());
         pagesPrinted=printer.printPages(2);
        System.out.println("pages printed="+pagesPrinted);
        System.out.println("new total="+printer.getNumberOfPagesPrinted());



    }
}
