package day37_Inheritance.PhoneTask;
import java.text.DecimalFormat;
public class Phone {
    DecimalFormat df = new DecimalFormat("$###.00");
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+ " is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+ " is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + df.format(price) +
                ", color='" + color + '\'' +
                '}';
    }
}
