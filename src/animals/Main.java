package animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
//        animals[0] = new mammal("Little Brown", 2, 3, "Bat");
//        animals[2] = new bird("Tweety", 1, 1, "Yellow");
        animals[0] = new mammal.dog("Rex", 5, 25, "German Shepherd");
        animals[1] = new bird.pigeon("Messenger", 3, 2, "Rock Dove");
        animals[2] = new fish.blowfish("Puffy", 2, 1, 50);

        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new mammal.dog("Buddy", 3, 15, "Labrador");
        behaviors[1] = new bird.pigeon("Swift", 2, 1, "Carrier Pigeon");
        behaviors[2] = new fish.blowfish("Spiky", 1, 1, 40);

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();

        for (Animal animal : animals) {
            animal.move();
        }

        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }
    }
}