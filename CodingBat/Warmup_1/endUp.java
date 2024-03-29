package Warmup_1;

public class endUp {
    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
        System.out.println(endUp("woo hoo"));
        System.out.println(endUp("xyZ12"));
        System.out.println(endUp("x"));
        System.out.println(endUp(""));

    }
/*Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"*/

    public static String endUp(String str){
         if(str.length()<=3){
             return str.toUpperCase();
         }else{
             String first = str.substring(0, str.length()-3);
             String last3 = str.substring(str.length()-3).toUpperCase();
             return first+last3;
        }
    }
}
