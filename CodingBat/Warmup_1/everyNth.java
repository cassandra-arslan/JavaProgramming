package Warmup_1;

public class everyNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));

    }
    /*Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg"*/

    public static String everyNth(String str, int n){
        if((str.isEmpty())||n<1){
            return str;
        }
        String result = "";
        char[] s1 = str.toCharArray();
        for(int i=0; i<s1.length; i+=n){
            result+= str.charAt(i);
        }
        return result;
    }

}
