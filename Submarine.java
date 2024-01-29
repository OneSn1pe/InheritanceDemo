public class Submarine extends Vehicle{
    private int depth;
    private int engines;
    private String powerSource;


    public Submarine(int passangers, int depth, int engines, String powerSource, String color, String type) {
        
        super(passangers, color, type);

        this.depth = depth;
        this.engines = engines;
        this.powerSource = powerSource;
    }
    
   
 
    public int getDepth() {
        return depth;
    }
    public int getEngines() {
        return engines;
    }
    public String getPowerSource() {
        return powerSource;
    }

    public String getType() {
        return "submarine";
        }
}
