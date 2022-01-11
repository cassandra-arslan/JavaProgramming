package day15_String;
import java.util.Scanner;
public class Task7_ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text:");
        String str = scan.nextLine();
        String result = "";
        for (int i= str.length()-1; i>=0; i--){
            result +=str.charAt(i);
        }
        System.out.println(str+" is: "+ result+" backwards");
        scan.close();
    }
}
/*7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW*/