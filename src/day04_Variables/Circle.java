package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 3.2;
        double diameter = radius*2;
        double perimeter = 2 * radius * PI ;
        double area = PI * (radius*radius);

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }
}
