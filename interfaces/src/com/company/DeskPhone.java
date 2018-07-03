package com.company;

public class DeskPhone implements ITelephone
{
private int myNumber;
private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("NO ACTION TAKEN. THE DESKTOP DOES NOT HAVE A POWER BUTTON");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing"+phoneNumber);

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering");
            isRinging=false;
        }
        System.out.println("not ringing");

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
