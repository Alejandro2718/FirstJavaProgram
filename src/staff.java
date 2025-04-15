import java.util.Scanner;

public class staff extends person {
    String education;
    String position;

    public void initialize1() {
        initialize();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Education: ");
        education = input.nextLine();
        System.out.print("Enter Position: ");
        position = input.nextLine();
    }

    public void print1() {
        print(surname, firstname, street, zipCode, city);
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

    public static void main(String[] args) {
        staff staff = new staff();
        staff.initialize1();
        staff.print1();

    }
}
