package ten;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animalCat = new Cat();
        Animal animalDog = new Dog();
        animal.move();
        animalCat.move();
        animalDog.move();
//        Cat cat = new Cat();
        makeAnimalMove(animal);
        makeAnimalMove(animalCat);
        makeAnimalMove(animalDog);

        System.out.println("\n\nMoveables");

        Car car = new Car();
        playWithMovables(car);
        playWithMovables(new Human());
//        playWithMovables(animalCat);
    }

    public static void playWithMovables(Moveable moveable) {
        moveable.move();
    }

    public static void makeAnimalMove(Animal animal) {
        animal.move();
    }

}
