package animals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class mammal extends Animal {
    String order;

    public mammal() {
        super();
        this.order = "Unknown";
    }

    public mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    @Override
    public void eat() {
        System.out.println("mammal eat");
    }

    @Override
    public void getVoice() {
        System.out.println("mammal voice");
    }

    @Setter
    @Getter
    public static class dog extends mammal implements AnimalBehavior {
        String breed;

        public dog() {
            super();
            this.breed = "Unknown";
        }

        public dog(String name, int age, int weight, String breed) {
            super(name, age, weight, "Canine");
            this.breed = breed;
        }

        @Override
        public void eat() {
            System.out.println("dog eat");
        }

        @Override
        public void getVoice() {
            System.out.println("dog voice");
        }

        @Override
        public void sleep() {
            System.out.println("Dog " + getName() + " is sleeping");
        }

        @Override
        public void move() {
            System.out.println("Dog " + getName() + " runs");
        }
    }
}