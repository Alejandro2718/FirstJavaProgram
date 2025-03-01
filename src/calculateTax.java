import java.math.BigDecimal;
import java.math.RoundingMode;


public class calculateTax {
    public static void main(String[] args) {
        double productPrice = 9.99;
        double vat = 0.23;
        double product_vat = productPrice * vat;
        double productFinalPrice = product_vat + productPrice;
        System.out.println("Product price: " + productPrice);
        System.out.println("Product price (with VAT): " + productFinalPrice);
        System.out.println("10,000 units = " + (productPrice * 10000));
        System.out.println("10,000 units (with VAT) = " + productFinalPrice * 10000);
       
        //Using Big Decimal Class
        BigDecimal productPrice1 = new BigDecimal("9.99");
        BigDecimal vat1 = new BigDecimal("0.23");
        BigDecimal product_vat1 = productPrice1.multiply(vat1);
        BigDecimal totalPrice = product_vat1.add(productPrice1);
        BigDecimal quantity = new BigDecimal("10000");
        BigDecimal totalWithoutVat = productPrice1.multiply(quantity);
        BigDecimal total = totalPrice.multiply(quantity);
        System.out.println("\n\nProduct price: " + productPrice1);
        System.out.println("Product price (with VAT): " + totalPrice.setScale(2, RoundingMode.HALF_UP));
        System.out.println("10,000 units = " + totalWithoutVat);
        System.out.println("10,000 units (with VAT) = " + total.setScale(2,RoundingMode.HALF_UP));
    }
}
