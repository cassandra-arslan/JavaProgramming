package day38_Inheritance_MethodOverriding.CarTask;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }
    @Override
    public void start(){
        System.out.println("For "+make+" "+model+", you can use auto start feature from key fob or app");
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
