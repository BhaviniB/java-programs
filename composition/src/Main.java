public class Main {

    public static void main(String args[])


{
    Dimensions dimensions=new Dimensions(10,10,5);
Case theCase=new Case("xyz","dell","00",dimensions);
Monitor theMonitor=new Monitor("ccc","cccc",99,new Resolution(2500,2440));
Motherboard motherboard=new Motherboard("bj-23","asus",46,55,"v2");
PC thePC = new PC(theCase,theMonitor,motherboard);

thePC.getTheMonitor().drawPixels(3,3,"red");
thePC.getTheMotherBoard().loadProgram("Windows 1.0");
thePC.getTheCase().pressPowerButton();


}

}
