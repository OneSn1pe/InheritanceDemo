public class Vehicle {
    private int passangers;
    private String color;
    private String type;

    public Vehicle(int passangers, String color, String type){
        
        this.passangers = passangers;
        this.color = color;
        this.type = type;
    }

    public int getPassangers() {
        return passangers;
    }

    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
}
