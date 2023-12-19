package Cars.company.vehicles;

public class Car {
    String carClass;
    Engine engine;
    Driver driver;
    String marka;
    int weight;
    public void start() {
        System.out.println("Let's GO!");
    }
    public void stop() {
        System.out.println("Let's stop");
    }
    public void turnRight() {
        System.out.println("Turn Right");
    }
    public void turnLeft() {
        System.out.println("Turn Left");
    }
    public String toString() {
        return "";
    }
}
