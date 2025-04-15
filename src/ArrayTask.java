import java.util.Scanner;

public class ArrayTask {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int counter = 0;

    public static int sorter() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                counter = 0;
                return 0;
            }
            counter++;
        }
        return 1;
    }
    {



        /*              Task 1           */
//        int[] numbers = new int[10];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = 9 - i;
//        }
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }


        /*              Task 2           */
//        int[] numbers = new int[10];
//        int min = 101, max = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random() * 100);
//        }
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//        for(int i = 0; i < 10; i++) {
//            if (numbers[i] > max)
//                max = numbers[i];
//            if (numbers[i] < min)
//                min = numbers[i];
//        }
//        System.out.printf("\nMax: %d\nMin: %d", max, min);


        /*              Task 3           */
//        int[][] matrix = new int[10][10];
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    matrix[i][j] = i;
//                    sum += matrix[i][j];
//                }
//            }
//        }
//        for (int[] row : matrix) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Sum: " + sum);



        /*              Task 5           */
//        String word;
//        int i = 0;
//        System.out.println("Please enter a word: ");
//        Scanner sc = new Scanner(System.in);
//        word = sc.nextLine().toLowerCase();
//        sc.close();
//        for (i = 0; i < word.length(); i++) {
//            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//                System.out.println("Not Palindrome");
//                return;
//            }
//        }
//        System.out.println("Palindrome");
//

        /*          Task 1.A         */

//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//
//        System.out.println("Before: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\nAfter: ");
//        for (int j = 0; j < arr.length - 1; j++) {
//            if (arr[j] > arr[j + 1]) {
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        /*          Task 1.B          */

//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int counter = 0;
//
//        System.out.println("Before: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println("\nAfter: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    counter++;
//                }
//                counter++;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\nCounter: " + counter);


        /*          Task 1.C          */

//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int counter = 0;
//
//        System.out.println("Before: ");
//        for (int k : arr) {
//            System.out.print(k + " ");
//        }
//
//        System.out.println("\nAfter: ");
//        for (int i = 0; i < arr.length; i++) {
//            counter++;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                counter++;
//                if (arr[j] > arr[j + 1]) {
//                    counter++;
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println("\nCounter: " + counter);


        /*          Task 1.D          */

//        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int counter = 0;



        System.out.println("Before: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println("\nAfter: ");
        if (sorter() == 0)
        {
            for (int i = 0; i < arr.length; i++) {
                counter++;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    counter++;
                    if (arr[j] > arr[j + 1]) {
                        counter++;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }


        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\nCounter: " + counter);


    }
}
