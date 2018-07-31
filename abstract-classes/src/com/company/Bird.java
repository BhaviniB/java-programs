package com.company;

public abstract class Bird extends Animal{
    private String name;

    public Bird(String name) {
    super(name);

    }

    @Override
    public void breathe() {
        System.out.println("breathin");
    }

    @Override
    public void eat() {
        System.out.println("peckin");
    }

    public abstract  void fly();

}
