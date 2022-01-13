package day38_Inheritance_MethodOverriding;

public class Tesla extends Car{
    public Tesla(String make, String model, String color, int year, int miles, double price) {
        super(make, model, color, year, miles, price);
    }
    public void autoPilot(){
        System.out.println(make+" "+model+" is using auto pilot");
    }

    public String toString() {
        return "Tesla{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
