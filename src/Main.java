public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[5];

        animal[0] = new mammal("Little Brown", 2, 3, "Bat");
        animal[1] = new mammal.dog("Rex", 5, 25, "German Shepherd");
        animal[2] = new bird("Tweety", 1, 1, "Yellow");
        animal[3] = new bird.pigeon("Messenger", 3, 2, "Rock Dove");
        animal[4] = new fish.blowfish("Puffy", 2, 1, 50);

        for (Animal a : animal) {
            a.getVoice();
            a.eat();
            System.out.println();
        }
    }
}