package day15_String;
import java.util.Scanner;
public class Task8_Palindrome {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Palindrome checker!\nPlease enter any string of text:");
        String str = scan.nextLine();
        for (int i = str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }
        if (str.equalsIgnoreCase(result)){
            System.out.println(str +" is a palindrome");
        }else{
            System.out.println(str+" is NOT a palindrome");
        }
    scan.close();
    }
}
/*Tasks:
	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true*/