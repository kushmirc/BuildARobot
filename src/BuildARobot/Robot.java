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
    //toString to print robot name:
    public String toString() {
        return "Hello, I'm the robot: " + name;
    }
    //perform task method:
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public static void main(String[] args) {
        Robot codey = new Robot("Codey");
        System.out.println(codey);
    }

}
