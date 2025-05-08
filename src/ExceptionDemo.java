class ExceptionGenerator {
    public void generateNullPointerException() {
        String str = null;
        System.out.println("String length: " + str.length());
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            System.out.println("Attempting to call a method with NullPointerException");
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("\n=== ERROR DETECTED ===");
            System.out.println("A NullPointerException occurred: You tried to use an object that was null.");

            System.out.println("\n=== Exception toString() ===");
            System.out.println(e.toString());

            System.out.println("\n=== Stack Trace ===");
            e.printStackTrace();

            System.out.println("\n=== End of Error Report ===");
        }
    }
}