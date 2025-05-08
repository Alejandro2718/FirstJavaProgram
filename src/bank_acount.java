import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class bank_acount {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("3-first_digits of bank account: ");
            String firstThreeDigits = scanner.nextLine().trim();

            if (firstThreeDigits.length() != 3 || !firstThreeDigits.matches("\\d{3}")) {
                System.out.println("Error: please enter a valid 3 digit number");
                scanner.close();
                return;
            }

            String urlString = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";
            URL url = new URL(urlString);

            System.out.println("Loading...");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                boolean found = false;

                while ((line = reader.readLine()) != null) {
                    if (line.contains(firstThreeDigits)) {
                        String[] parts = line.split("\\s+");
                        if (parts.length >= 2) {
                            String bankNumber = parts[0];
                            StringBuilder bankName = new StringBuilder();
                            for (int i = 1; i < parts.length; i++) {
                                bankName.append(parts[i]).append(" ");
                            }

                            System.out.println("\nInformation:");
                            System.out.println("Bank number: " + bankNumber);
                            System.out.println("Bank name: " + bankName.toString().trim());
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    System.out.println("No se encontró información para los dígitos: " + firstThreeDigits);
                }
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}