import java.util.Scanner;

public class equationSquare {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer input del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer los valores de a, b y c
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        // Cerrar el scanner
        scanner.close();

        // Obtener las soluciones
        double[] soluciones = resolverEcuacionCuadratica(a, b, c);

        // Imprimir resultados
        if (soluciones.length == 2) {
            System.out.println("x1 = " + soluciones[0]);
            System.out.println("x2 = " + soluciones[1]);
        } else {
            System.out.println("Las soluciones son complejas");
            System.out.println("x1 = " + soluciones[0] + " + " + soluciones[1] + "i");
            System.out.println("x2 = " + soluciones[0] + " - " + soluciones[1] + "i");
        }
    }

    public static double[] resolverEcuacionCuadratica(double a, double b, double c) {
        // Calculamos el discriminante
        double discriminante = b * b - 4 * a * c;

        // Array para almacenar los resultados
        double[] resultado;

        if (discriminante >= 0) {
            // Soluciones reales
            resultado = new double[2];
            resultado[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            resultado[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
        } else {
            // Soluciones complejas (devolvemos la parte real y la imaginaria)
            resultado = new double[2];
            resultado[0] = -b / (2 * a);  // Parte real
            resultado[1] = Math.sqrt(Math.abs(discriminante)) / (2 * a);  // Parte imaginaria
        }

        return resultado;
    }
}