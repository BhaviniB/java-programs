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
}
