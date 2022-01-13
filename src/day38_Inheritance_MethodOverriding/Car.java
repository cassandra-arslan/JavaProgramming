package day38_Inheritance_MethodOverriding;

public class Car {
    public String make, model, color;
    public int year, miles;
    public double price;

    public Car(String make, String model, String color, int year, int miles, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    public void start(){
        System.out.println(make+ " "+model+ " is starting");
    }

    public void drive(){
        System.out.println(make+ " "+model+ " is driving");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
