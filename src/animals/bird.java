package animals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class bird extends Animal {
    String featherColor;

    public bird() {
        super();
        this.featherColor = "Unknown";
    }

    public bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("bird eat");
    }

    @Override
    public void getVoice() {
        System.out.println("bird voice");
    }

    @Setter
    @Getter
    public static class pigeon extends bird implements AnimalBehavior {
        String species;

        public pigeon() {
            super();
            this.species = "Unknown";
        }

        public pigeon(String name, int age, int weight, String species) {
            super(name, age, weight, "Gray");
            this.species = species;
        }

        @Override
        public void eat() {
            System.out.println("Pigeon food");
        }

        @Override
        public void getVoice() {
            System.out.println("Pigeon voice: " + species);
        }

        @Override
        public void sleep() {
            System.out.println("Pigeon " + getName() + " is sleeping");
        }

        @Override
        public void move() {
            System.out.println("Pigeon " + getName() + " flies");
        }
    }
}