import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

public class bird extends Animal {
    @Getter @Setter
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

    public static class pigeon extends bird {
        @Getter @Setter
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
            System.out.println("Pigeon eat");
        }

        @Override
        public void getVoice() {
            System.out.println("Pigeon voice: " + species);
        }
    }
}