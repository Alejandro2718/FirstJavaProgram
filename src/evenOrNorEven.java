public class evenOrNorEven {

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100);
        if (rand % 2 == 0) {
            System.out.println("Its even");
            System.out.println(rand);
        }
        else {
            System.out.println("Its not even");
            System.out.println(rand);
        }
    }
}