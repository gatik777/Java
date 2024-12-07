import GatikPrasher.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Wolf" , "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepherd", "big", 150));
        animals.add(new Fish("Goldfish", "big", 1));
        animals.add(new Fish("Baracudda", "small", 75));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));

        animals.add(new Mammal("Human", "Large", 65));
        

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {

            }


        }

    }

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }



}