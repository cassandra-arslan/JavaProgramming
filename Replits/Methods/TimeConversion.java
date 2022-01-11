package Methods;
import java.util.*;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }
    public static void timeConversion(String s) {
        //Write your code here
        s=s.trim();
        if (s.length()<10) s = "0"+s;
        String time = s.substring(0, s.length()-2);
        String[] digits = time.split(":");
        if ( s.substring(s.length()-2).contains("PM")){
            if (digits[0].equals("11")) digits[0] = "23";
            else if (digits[0].equals("10")) digits[0] = "22";
            else if (digits[0].equals("09")) digits[0] = "21";
            else if (digits[0].equals("08")) digits[0] = "20";
            else if (digits[0].equals("07")) digits[0] = "19";
            else if (digits[0].equals("06")) digits[0] = "18";
            else if (digits[0].equals("05")) digits[0] = "17";
            else if (digits[0].equals("04")) digits[0] = "16";
            else if (digits[0].equals("03")) digits[0] = "15";
            else if (digits[0].equals("02")) digits[0] = "14";
            else if (digits[0].equals("01")) digits[0] = "13";
        } else {
            if (digits[0].equals("12")) digits[0] = "00";
        }
        System.out.println(digits[0]+":"+digits[1]+":"+digits[2]);
    }
}
