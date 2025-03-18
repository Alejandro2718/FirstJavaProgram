import java.util.Scanner;

class RectangleArea {
    private int width;
    private int height;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = scanner.nextInt();
        System.out.print("Enter height: ");
        height = scanner.nextInt();
        scanner.close();
    }
    public int computeField() {
        return width * height;
    }
    public void fieldDisplay() {
        System.out.println("Rectangle Area: " + computeField());
    }

    public RectangleArea()
    {
        int weight;
        int height;
        this.getData();
        this.computeField();
        this.fieldDisplay();

    }
}