package com.company;

public class Main {

    public static void main(String[] args) {
        Car car=new Car(3,"base car");
         System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());
        Scorpio S=new Scorpio(3,"Scorp");
        System.out.println(S.accelerate());
        System.out.println(S.brake());
        System.out.println(S.startEngine());

    }
}
 class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {

        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }



    public String startEngine()
    {
        return "startEngine() called";

    }
    public  String accelerate(){

        return "accelerate()called";
    }

    public String brake(){



        return "brake called";
    }


}
class Scorpio extends Car{


    public Scorpio(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {

        return "startEngine() called by Scorpio";


    }

    @Override
    public String accelerate() {
        return "accelerate()called by Scorpio";

    }

    @Override
    public String brake() {
        return "brake called  by Scorpio";
    }
}
class BMW extends Car{


    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {

        return "startEngine() called by BMW";


    }

    @Override
    public String accelerate() {
        return "accelerate()called by BMW";

    }

    @Override
    public String brake() {
        return "brake called  by BMW";
    }
}

