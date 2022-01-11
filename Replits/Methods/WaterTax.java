package Methods;
import java.util.*;
public class WaterTax {
    public static double waterTax(double units){
        double bill = 0.0;
        //your code here
        if(units<=50){
            bill= units*.60;
        }else if(units>50&&units<100){
            bill= units*.90;
        }else if(units>=100&&units<150){
            bill= 50+(units*.90);
        }else if(units>=150){
            bill= 100+(units*.90);
        }else{
            bill= 0;
        }
        //end your code here
        return bill;
    }//end waterTax
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
}
