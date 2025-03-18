import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class CarWithLombok {
    private String model;

    @EqualsAndHashCode.Include
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}

class CarDemoWithLombok {
    public static void main(String[] args) {
        CarWithLombok carWithLombok1 = new CarWithLombok("GLE", "Mercedes", 2020, 350_000, "white", 5);
        CarWithLombok carWithLombok2 = new CarWithLombok("GLC", "Mercedes", 2023, 200_000, "silver", 3);
        System.out.println(carWithLombok1);
        System.out.println(carWithLombok2);
        System.out.println(carWithLombok1.getColor());
        int year = carWithLombok1.getYear();
        carWithLombok1.setColor("black");
        System.out.println("Are these objects equal? " + carWithLombok1.equals(carWithLombok2));
        System.out.println("The HashCode of this object is: " + carWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: " + carWithLombok1.hashCode());
    }
}