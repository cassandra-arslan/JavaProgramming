package day25_CustomMethods_Overloading;
import util.StringUtility;
public class Test {
    public static void main(String[] args) {
        String str = "Java";
        StringUtility.printEachChar(str);
        System.out.println("-------------------------------------");
        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("-------------------------------------");
        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("Palindrome = "+palindrome);
        System.out.println("-------------------------------------");
        String[] names = {"Anna", "Java", "Python", "racecar","Mom","Cydeo"};
        int count = 0;
        for (String each : names){
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-------------------------------------");
        String str4 = "aaaaaasssssaaabbbbbbbbb";
        System.out.println(StringUtility.removeDuplicates(str4));


    }
}
