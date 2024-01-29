public class Plane extends Vehicle{
    private int altitude;
    private int engines;


    public Plane(int passangers, int engines, int altitude, String color, String type) {
        
        super(passangers, color, type);

        this.altitude = altitude;
        this.engines = engines;
    }
    
   
 
    public int getEngines() {
        return engines;
    }
    public int getAltitide() {
        return altitude;
    }

    public String getType() {
        return "plane";
        }
}
