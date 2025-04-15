import lombok.Getter;
import lombok.Setter;

public abstract class Animal {
    @Getter @Setter
    protected String name;
    @Getter @Setter
    protected int age;
    @Getter @Setter
    protected int weight;

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