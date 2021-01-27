package ten;

public class Car implements Moveable {
    private int everythingThatCarHas;

    public void everythingThatCarDoes() {
        System.out.println("Like a car");
    }

    @Override
    public void move() {
        System.out.println("Move like a car");
    }
}
