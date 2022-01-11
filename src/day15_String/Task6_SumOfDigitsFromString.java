package day15_String;
import java.util.Scanner;
public class Task6_SumOfDigitsFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text (letters or digits):");
        String str = scan.nextLine();

        int sum = 0;

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                sum+= str.charAt(i)-'0';
            }else{
                sum+= str.charAt(i)-0;
            }
        }
        System.out.println(sum);
    scan.close();
    }
}
/*6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1&
						             	   */
