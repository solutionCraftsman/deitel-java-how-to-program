package ten;

public abstract class AnimalAbstract {
    private int numberOfEyes;
    private int numberOfLegs;

    public abstract void move();

    public void eat(){
        System.out.println("Eat and smile");
    }
}
