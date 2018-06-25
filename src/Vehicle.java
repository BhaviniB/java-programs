public class Vehicle {


    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

}

public Vehicle(String name, String  size)
{
    this.name=name;
    this.size=size;
    this.currentDirection=0;
    this.currentVelocity=0;
}

public void steer(int direction)
{
    this.currentDirection+=direction;
    System.out.println("Steering at "+currentDirection+"degrees");
    
}