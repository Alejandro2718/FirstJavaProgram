package animals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Animal implements AnimalMove, AnimalName {
    public String name;
    public int age;
    public int weight;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();
    public abstract void getVoice();
}