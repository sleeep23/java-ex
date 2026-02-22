package poly.ex1;

public class AnimalPolyMain {
    static void main() {
        Animal[] animals = new Animal[] {new Dog(), new Cat()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }

        Dog dog = new Dog(); // new Dog 쓰고 option + command + v 누르면 됨
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("sound start");
        animal.sound();
        System.out.println("sound end");
    }
}
