package animals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class fish extends Animal {
    String waterType;

    public fish() {
        super();
        this.waterType = "Unknown";
    }

    public fish(String name, int age, int weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println("fish eat");
    }

    @Override
    public void getVoice() {
        System.out.println("fish voice");
    }

    @Setter
    @Getter
    public static class blowfish extends fish implements AnimalBehavior {
        int spineCount;

        public blowfish() {
            super();
            this.spineCount = 0;
        }

        public blowfish(String name, int age, int weight, int spineCount) {
            super(name, age, weight, "Saltwater");
            this.spineCount = spineCount;
        }

        @Override
        public void eat() {
            System.out.println("blowfish eat");
        }

        @Override
        public void getVoice() {
            System.out.println("blowfish voice");
        }

        @Override
        public void sleep() {
            System.out.println("Blowfish " + getName() + " is sleeping");
        }

        @Override
        public void move() {
            System.out.println("Blowfish " + getName() + " swims");
        }
    }
}