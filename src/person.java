import java.util.Scanner;

public class person {
    String surname;
    String firstname;
    String street;
    String zipCode;
    String city;

    public void initialize()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Surname: ");
        surname = input.nextLine();
        System.out.print("Enter Firstname: ");
        firstname = input.nextLine();
        System.out.print("Enter Street: ");
        street = input.nextLine();
        System.out.print("Enter Zip Code: ");
        zipCode = input.nextLine();
        System.out.print("Enter City: ");
        city = input.nextLine();
    }

    public void print(String surname, String firstname, String street, String zipCode, String city) {
        System.out.println(surname + " " + firstname + " " + street + " " + zipCode + " " + city);
    }
}

