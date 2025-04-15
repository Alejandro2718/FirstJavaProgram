import lombok.Getter;
import lombok.Setter;

public class mammal extends Animal {
    @Getter @Setter
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

    public static class dog extends mammal {
        @Getter @Setter
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
    }
}