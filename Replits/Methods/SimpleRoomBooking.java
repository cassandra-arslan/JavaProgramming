package Methods;
import java.util.*;
public class SimpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here
    if(year==2018){
        if(month==7&&(day>=1&&day<=8)){
            return false;
        }else {
            return isAvailable;
        }
    }else{
        return false;
    }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
