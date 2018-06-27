package com.company;

import com.company.Hamburger;

import com.company.HealthyBurger;
public class Main {

    public static void main(String[] args) {


        Hamburger ham=new Hamburger("basic","sausage",3.56,"white");

        double price=ham.automiseHamburger();
        ham.addHamburgerAddition1("onions",0.2);
        price=ham.automiseHamburger();
        System.out.print(price);
        HealthyBurger heal=new HealthyBurger("white",2.22);
        heal.automiseHamburger();
        heal.addHealthyAddition1("cheese",0.22);
        price=heal.automiseHamburger();
        System.out.print(price);
	// write your code here
    }
}
