package OfficeHours.OH_01_19_2022;

public class Fruit{
    Juice juice = new Juice("White");
}

class Juice{
    String color;

    public Juice(String color){
        this.color = color;
    }
}