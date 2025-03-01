import javax.swing.*;

public class WeightInMars {

    static float weight = 60;
    static float marsWeightJimenez = weight * 0.38f;
    static double marsdoubleJimenez = (double)marsWeightJimenez;
    static int intmarsWeightJimenez = (int) marsWeightJimenez;
    static char charMarsJimenez = (char)intmarsWeightJimenez;
    static int charWeightJimenez = (int) charMarsJimenez + (int) charMarsJimenez;

    public static void main(String[] args) {
        marsWeightJimenez = weight * 0.38f;
        System.out.println(weight + "Kg on Earth is " + marsWeightJimenez + "Kg on Mars");
        System.out.println("Kilograms on Mars after converting to double " + marsdoubleJimenez);
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f%n", marsWeightJimenez);
        System.out.println("Kilograms on Mars when casted to integer " + intmarsWeightJimenez);
        System.out.println("The ASCII table equivalent of marsWeightJimenez is " + charMarsJimenez);
        System.out.println("An example of a mathematical operation on the char type: " + charWeightJimenez);
    }
}
