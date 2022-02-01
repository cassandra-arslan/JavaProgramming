package day08_IfStatements.day09_IfElseStatements;
import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char input= scan.next().charAt(0);
        if ((input >=65 && input <=90) || (input>=97 && input <=122)){
            System.out.println("Alphabetic Character");
        }else if ((input>=48&&input<=57)){
            System.out.println("Numeric Character");
        }else{
            System.out.println("Special Character");
        }
        scan.close();
    }
}
/*4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'
		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table*/
