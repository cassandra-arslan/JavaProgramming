package Warmup_1;

public class missingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("Hi", 0));

    }


    public static String missingChar(String str, int n) {
        str = str.replaceFirst(""+str.charAt(n), "");
        return str;
    }
}
