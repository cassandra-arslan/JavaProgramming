package Warmup_1;

public class frontBack {

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
    }





    public static String frontBack(String str) {
        if (str.length() > 1) {
            String str1 = str.substring(1, str.length() - 1);
            return str = "" + str.charAt(str.length() - 1) + str1 + str.charAt(0);
        } else {
            return str;
        }
    }
}
