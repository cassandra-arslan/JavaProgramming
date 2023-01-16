package day43_Abstraction.car;

public final class Audi extends Car{
    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }
    public void start(){
        System.out.println("Engine is starting");
    }
    public void stop(){
        System.out.println("Vehicle is stopped");
    }

    @Override
    public String toString() {
        return "Audi{}";
    }
}
