package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any sentence:");
        String str = scan.nextLine();
        System.out.println("Please enter word you want to remove and count:");
        String word = scan.next();

        int count = 0;
        while (str.contains(word)){
            str =  str.replaceFirst(word, "");
            count++;
        }
        System.out.println("Removed "+count+" occurrences of the word "+word+"\n"+str);
    }
}
