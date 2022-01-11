package day16_ForLoopStringPractice;
import java.util.Scanner;
public class ReturnUniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text:");
        String str = scan.nextLine();

        String result = "";
        for (int i= 0; i<=str.length()-1; i++){ //i: index numbers of str (starting from 0)
            char ch = str.charAt(i);
            if( str.indexOf(ch)==str.lastIndexOf(ch)){//if the first and the last index #s are same, then it only occurs once (unique)
                result += ch;
            }
        }
        System.out.println(result);

    }
}
