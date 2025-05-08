package animals;

interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " moves");
    }
}