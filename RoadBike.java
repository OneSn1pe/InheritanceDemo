public class RoadBike extends Vehicle{
    private String gears;
    private String brakes;


    public RoadBike(int passangers, int gears,  String brakes, String color, String type) {
        
        super(passangers, color, type);

        this.gears = gears;
        this.brakes = brakes;
    }
    }
   
 
    public String getGears() {
        return gears;
    }
    public String getBrakes() {
        return brakes;
    }
    public String getType() {
        return "RoadBike";
    }
}
