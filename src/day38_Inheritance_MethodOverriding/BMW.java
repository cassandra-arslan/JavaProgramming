package day38_Inheritance_MethodOverriding;

public class BMW extends Car{
    public BMW(String make, String model, String color, int year, int miles, double price) {
        super(make, model, color, year, miles, price);
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
