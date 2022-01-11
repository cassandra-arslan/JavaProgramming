package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task1_DuplicatedCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";

        for (int i = 0; i<=str.length()-1; i++){
            String ch = ""+str.charAt(i);

            if(!result.contains(ch)){
                result+=ch;
            }
        }
        System.out.print(result);
    }
}
/*1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String before you are adding

*/