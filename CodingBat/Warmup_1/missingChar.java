package Warmup_1;

public class missingChar {
    public static void main(String[] args) {

    }


    public String missingChar(String str, int n) {
        str = str.charAt(str.length()-1)+str.substring(1, str.length()-2)+str.charAt(0);
        return str;
    }
}
