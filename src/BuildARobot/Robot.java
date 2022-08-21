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

    public static void main(String[] args) {
        Robot codey = new Robot("Codey");
        System.out.println(codey);
    }
}
