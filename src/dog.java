public class dog extends mammal {
    String rzad;
    String breed;
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog rzard: " + rzad);
        System.out.println("Dog breed: " + breed);
    }
}
