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
public void move(int velocity,int direction){

    currentDirection=direction;
    currentVelocity=velocity;
    System.out.println("Vehicle is moving at"+currentVelocity+"in the direction"+currentDirection);
}
public String getName()
{
 return  name;
}

    public String getSize()
    {
        return  size;
    }
