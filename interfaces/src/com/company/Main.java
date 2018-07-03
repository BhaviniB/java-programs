package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone bhavinisPhone;
        bhavinisPhone=new DeskPhone(8979944,false);
        bhavinisPhone.powerOn();
        bhavinisPhone.answer();
        bhavinisPhone.callPhone(4433);
        bhavinisPhone=new MobilePhone(999,true);
        bhavinisPhone.callPhone(33);
        bhavinisPhone.answer();


    }
}
