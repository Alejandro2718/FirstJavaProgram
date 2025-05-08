import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class grade_5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\aleja\\Desktop\\studentsEN.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("grade5Students.txt");

            String line;
            while ((line = br.readLine()) != null) {
                if (line.endsWith("5")) {
                    fw.write(line + "\n");
                }
            }

            br.close();
            fw.close();
            System.out.println("Students with 5 saved in grade5Students.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}