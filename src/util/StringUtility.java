package util;
import java.util.Arrays;
public class StringUtility {


    //Prints each char in a String
    public static void printEachChar(String str){
    for (int i=0; i<str.length(); i++){
        System.out.println(str.charAt(i));
    }
    }
    //Remove duplicates in a String
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }
    //Reverses a given String amd returns the result
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i>=0; i--){
            result +=str.charAt(i);
        }
        return result;
    }
    //Checks if given String is Palindrome, return boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }
    //checks if the given String is anagram, return boolean
    public static boolean anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

}
