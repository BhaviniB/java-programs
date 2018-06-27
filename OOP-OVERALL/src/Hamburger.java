package com.company;
public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1name;
    private double addition1cost;

    private String addition2name;
    private double addition2cost;

    private String addition3name;
    private double addition3cost;

    private String addition4name;
    private double addition4cost;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1(String name,double cost)
    {
        this.addition1name=name;
        this.addition1cost=cost;

    }
    public void addHamburgerAddition2(String name,double cost)
    {
        this.addition2name=name;
        this.addition2cost=cost;

    }  public void addHamburgerAddition3(String name,double cost)
    {
        this.addition3name=name;
        this.addition3cost=cost;

    }

    public void addHamburgerAddition4(String name,double cost)
    {
        this.addition4name=name;
        this.addition4cost=cost;

    }


    public double automiseHamburger(){
        double hamburgerPrice=this.price;
        System.out.println(this.name+"hamburger"+this.breadRollType+"bread roll"+this.price+"price");
        if(this.addition1name!=null){
            hamburgerPrice+=this.addition1cost;
            System.out.println("added"+this.addition1name+"so total cost is"+hamburgerPrice);
        }
       else if(this.addition2name!=null){
            hamburgerPrice+=this.addition2cost;
            System.out.println("added"+this.addition2name+"so total cost is"+hamburgerPrice);
        }
        else if(this.addition3name!=null){
            hamburgerPrice+=this.addition3cost;
            System.out.println("added"+this.addition3name+"so total cost is"+hamburgerPrice);
        } else if(this.addition4name!=null){
            hamburgerPrice+=this.addition4cost;
            System.out.println("added"+this.addition4name+"so total cost is"+hamburgerPrice);
        }
        return hamburgerPrice;
    }

}
