package ArrayLists;
import java.util.*;
public class DeliveryCalc {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        int sum = 0, result = 0;
        for(Integer each: deliveries){
            sum+=each;
        }
        result = sum/max_fuel;
        if(sum%max_fuel!=0)
            result++;
        return result;
    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }

}
