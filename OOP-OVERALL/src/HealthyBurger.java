package com.company;

import com.company.Hamburger;


public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("HEALTHY HAM", meat, price, "BROWN");
    }
    public void addHealthyAddition1(String name, double cost){

        this.healthyExtra1Name=name;
        this.healthyExtra1Price=cost;
    }

    public void addHealthyAddition2(String name, double cost){

        this.healthyExtra2Name=name;
        this.healthyExtra2Price=cost;
    }

    @Override
    public double automiseHamburger() {
        double hamburgerPrice=super.automiseHamburger();


        if(this.healthyExtra1Name!=null){


            hamburgerPrice+=healthyExtra1Price;
            System.out.println("Added the item "+this.healthyExtra1Name+"price"+this.healthyExtra1Price);

        }

        if(this.healthyExtra2Name!=null){


            hamburgerPrice+=healthyExtra2Price;
            System.out.println("Added the item "+this.healthyExtra2Name+"price"+this.healthyExtra2Price);

        }
    return hamburgerPrice;
    }
}
