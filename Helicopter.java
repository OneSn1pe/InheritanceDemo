public class Helicopter extends Vehicle{
    private int altitude;
    private int blades;


    public Helicopter(int passangers, int blades, int altitude, String color, String type) {
        
        super(passangers, color, type);

        this.altitude = altitude;
        this.blades = blades;
    }
    
   
 
    public int getBlades() {
        return blades;
    }
    public int getAltitide() {
        return altitude;
    }

    public String getType() {
        return "helicopter";
        }
}
