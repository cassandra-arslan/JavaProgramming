package day16_ForLoopStringPractice;
import java.util.Scanner;
public class AykhanFrequencyOfWord {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter sentence:");
    String sentence = input.nextLine().toLowerCase();
    int result = 0;
        for (int i = 0; i < sentence.length(); i++) {
        if (sentence.charAt(i) == 'j') {
            if (sentence.charAt(i + 1) == 'a') {
                if (sentence.charAt(i + 2) == 'v') {
                    if (sentence.charAt(i + 3) == 'a') {
                        result += 1;
                    }
                }

            }
        }
    }
        System.out.println(result);
        input.close();
}
}
