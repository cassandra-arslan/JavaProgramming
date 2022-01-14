package day38_Inheritance_MethodOverriding.CarTask;

public class BMW extends Car{
    public BMW(String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }
    @Override
    public void start(){
        System.out.println("For "+make+" "+model+", you must press the IGNITION START button when key is present in vehicle");
    }
    public void breaksDown(){
        System.out.println(make+" "+model+" is stuck on the side of the road");
    }
    public void racing(){
        System.out.println(make+" "+model+" is illegally racing down the street");
    }

    public String toString() {
        return "BMW{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
