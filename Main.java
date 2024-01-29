import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

    MountainBike m = new MountainBike(1, 3,  "disc-brakes", "red", "good", "mountian-bike");

    RoadBike r = new RoadBike(1, 2, "disc-brakes", "blue", "road-bike");

    Car c = new Car(2, 220, "green", "car");

    Plane p = new Plane(50, 4, 2000, "white", "plane");

    Submarine s = new Submarine(10, 200, 2, "electric", "blue", "submarine");

    Helicopter h = new Helicopter(5, 2, 200, "yellow", "helicopter");

    ArrayList<Vehicle> Vehicles = new ArrayList<>();
    Vehicles.add(m);//example of polymorphism
    Vehicles.add(r);//a student is being stored as a person
    Vehicles.add(c);//
    Vehicles.add(p);
    Vehicles.add(s);
    Vehicles.add(h);

for(Vehicle x: Vehicles) {
    System.out.println(x.getType());
    System.out.println(x.getPassangers());
}

}
}

