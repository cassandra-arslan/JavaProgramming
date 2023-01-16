package day38_Inheritance_MethodOverriding.CarTask;

public class ParkingLot {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "Silver", 2013, 93_000, 13_000);
        BMW bmw = new BMW("M5", "Blue", 2011, 43_000, 16_000);
        Tesla tesla = new Tesla("Model X", "White", 2019, 8_500, 89_000);


        toyota.start();
        tesla.start();
        bmw.start();

    }
}
