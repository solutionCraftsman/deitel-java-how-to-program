package vehicle;

public class Vehicle {

    private String name;
    private double direction;
    private int speed;
    private boolean isOn;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void accelerate() {
        System.out.println(name + " now accelerating");
    }

    public void turnRight() {

    }

    public void turnLeft() {

    }
}
