public class ExceptionHandlingDemo {
    public void methodThatMayThrowException(int value) {
        if (value == 1) {
            // Dividing by zero to trigger ArithmeticException
            int result = 10 / 0;
        } else if (value == 2) {
            // Accessing invalid array index to trigger ArrayIndexOutOfBoundsException
            int[] arr = new int[3];
            int element = arr[5];
        }
        // For any other value, no exception is thrown
        System.out.println("Method completed successfully without exceptions");
    }

    public static void main(String[] args) {
        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();

        // Test with different values
        for (int i = 0; i <= 2; i++) {
            System.out.println("\nTesting with value: " + i);

            try {
                demo.methodThatMayThrowException(i);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            } finally {
                System.out.println("This is the finally message");
            }
        }
    }
}