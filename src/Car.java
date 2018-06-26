public class Car extends Vehicle {
private int wheels;
private int doors;
private int gears;
private int isManual;
private int currentGear;


    public Car(String name, String size, int wheels, int doors, int gears, int isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }


}
