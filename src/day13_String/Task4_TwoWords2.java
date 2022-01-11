package day13_String;
import java.util.Scanner;
public class Task4_TwoWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words:");
        String word1= scan.next();
        String word2= scan.next();
        String word3= word1+word2;

        if (word1.charAt(word1.length()-1)==word2.charAt(0)) {
            word3= ""+word1.substring(0)+word2.substring(1);
            System.out.println(word3);
        }else{
            System.out.println(word3);
        }
        scan.close();
    }
}
/*4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight*/
