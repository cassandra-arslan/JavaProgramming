package day15_String;
import java.util.Scanner;
public class Task5_RetrieveChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digit = "";
        String letter = "";
        String character = "";
        System.out.println("Please enter any string of characters:");
        String str = scan.nextLine();

        for (int i= 0; i<str.length(); i++){
            if (str.charAt(i)>='0'&& str.charAt(i)<='9'){
                digit += str.charAt(i);
            }else if (str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z'){
                letter+= str.charAt(i);
            }else{
                character+= str.charAt(i);
            }
        }
        System.out.println("Digits: "+digit+"\nLetters: "+letter+"\nSpecial Characters: "+character);
        scan.close();
    }
}
/*    5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!*/
