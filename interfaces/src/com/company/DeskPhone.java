package com.company;

public class DeskPhone implements ITelephone
{
private int myNumber;
private boolean isRinging;

    @Override
    public void powerOn() {
        
    }

    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
