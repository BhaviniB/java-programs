public class Outlander extends Car {

    private int roadservice;

    public Outlander(int roadservice) {
        super("Outlander", "4ED", 5, 5, 6, false);
        this.roadservice = roadservice;
    }

    public void accelerate(int rate) {


        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
        changeGear(1);}
        else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);

        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30) {
            changeGear(4);


        }
    }
}