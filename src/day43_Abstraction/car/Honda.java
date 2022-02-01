package day43_Abstraction.car;

public final class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }
    public void start(){
        System.out.println("Twist key in ignition to start");
    }
    public void stop(){
        System.out.println("Press brake to stop");
    }
}
