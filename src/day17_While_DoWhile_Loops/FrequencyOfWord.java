package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text:");
        String sentence = scan.nextLine();
        System.out.println("Please enter the word you would like to find:");
        String word = scan.next();

        int count = 0;
        int wordLength = word.length();
        for (int i= 0; i< sentence.length()-wordLength; i++){
            String eachSub = sentence.substring(i, i+wordLength);
            if (eachSub.equals(word)){
                count++;
            }
        }
        System.out.println(word+" occurs "+count+" times in the sentence");
    }
}
