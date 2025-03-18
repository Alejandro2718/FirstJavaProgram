public class sort {
    public static void main(String[] args) {
        int b = (int) (Math.random() * 100);
        int min = 101, max = 0;
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", b);
            if (b > max)
                max = b;
            if (b < min)
                min = b;
            b = (int) (Math.random() * 100);
        }
        System.out.printf("\nMax: %d\nMin: %d", max, min);

    }
}
