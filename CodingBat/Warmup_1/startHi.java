package Warmup_1;

public class startHi {
    public static void main(String[] args) {
        System.out.println(startHi("H"));

    }

    public static boolean startHi(String str) {
        if (str.length() > 2) {

            if ((str.substring(0, 2)).equalsIgnoreCase("hi")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
