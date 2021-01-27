package ten;

public class Human implements Moveable {
    private int everythingHumanHas;

    public void everyThingHumanHas() {
        System.out.println("Human activity");
    }

    @Override
    public void move() {
        System.out.println("Move like a human");
    }
}
