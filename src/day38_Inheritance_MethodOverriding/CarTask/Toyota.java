package day38_Inheritance_MethodOverriding.CarTask;

public class Toyota extends Car{
    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }
    public void reliable(){
        System.out.println(make+" "+model+ " is a reliable vehicle");
    }
    @Override
    public void start(){
        System.out.println("For "+make+" "+model+", you must twist key in ignition port to start");
    }
}
