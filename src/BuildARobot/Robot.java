package BuildARobot;

public class Robot {
    //instance fields:
    String name;
    int batteryLevel;

    //constructor method:
    public Robot(String robotName){
        name = robotName;
        batteryLevel = 100;
    }
    public String toString() {
        return "Hello, I'm the robot: " + name;
    }

    public static void main(String[] args) {
        Robot codey = new Robot("Codey");
        System.out.println(codey);
    }

}
