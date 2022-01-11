package day30_CustomClasses;

import java.text.DecimalFormat;

public class Car {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    public String make;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carMake, String carModel, String carColor, int carYear, double carPrice){
        make = carMake;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + df.format(price) +
                '}';
    }
    public void drive(){
        System.out.println("Driving "+make+model);
    }
}
