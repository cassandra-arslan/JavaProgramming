package OfficeHours;
import java.util.Scanner;
public class OfficeHours_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any word:");
        String word = scan.nextLine();
        String result ="";

        for (int i =word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }
        if (result.equalsIgnoreCase(word)){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println(word+" is NOT a palindrome");
        }
        scan.close();
    }
}
