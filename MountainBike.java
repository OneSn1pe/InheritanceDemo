public class MountainBike extends Vehicle {
    private String shocks;
    private String gears;
    private String brakes;


    public MountainBike(int passangers, int gears,  String brakes, String color, String shocks, String type) {
        
        super(passangers, color, type);

        this.shocks = shocks;
        this.gears = gears;
        this.brakes = brakes;
    }
    }
   
    public String getShocks() {
        return shocks;
    }
    public String getGears() {
        return gears;
    }
    public String getBrakes() {
        return brakes;
    }
    public String getType() {
        return type;
    }
}
