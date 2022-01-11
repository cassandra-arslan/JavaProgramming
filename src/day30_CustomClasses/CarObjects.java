package day30_CustomClasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;
public class CarObjects {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$###,###.00");

        Car car1 = new Car();
        car1.setInfo("Mercedes", "E63 AMG", "White", 2013,67000 );
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Porsche", "911 Turbo", "Black", 2007, 110000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Buick", "RoadMaster Wagon", "White",1996,12500);
        System.out.println(car3);

        //Car[] cars = {car1, car2, car3};  - not ideal as less methods

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each :carList){
            System.out.println(each.make +" ==> "+df.format(each.price));
        }

    }
}
