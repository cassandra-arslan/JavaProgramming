package day38_Inheritance_MethodOverriding;

public class Toyota extends Car{
    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }
    public void reliable(){
        System.out.println(make+" "+model+ " is a reliable vehicle");
    }

    public String toString() {
        return "Toyota{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
