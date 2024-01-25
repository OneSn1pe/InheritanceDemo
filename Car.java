public class Car extends Vehicle{
    private int topSpeed;

    public Car(int passangers, int topSpeed, String color, String type) {
        
        super(passangers, color, type);

        this.topSpeed = topSpeed;
    }
    }
   
 
    public int getTopSpeed() {
        return topSpeed;
    }

    public String getType() {
        return "Car";
        }
}
