package com.company;

public class MobilePhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;


    public MobilePhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("ON NOW");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("now ringing" + phoneNumber);

        } else {
            System.out.println("off");
        }
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
        if (phoneNumber == myNumber && isOn) {

            isRinging = true;
            System.out.println("ring ring");

        } else {
            isRinging = false;

            System.out.println("mobile phone on");

        }
        return isRinging;
    }


        @Override
    public boolean isRinging() {
        return isRinging;
    }
}


