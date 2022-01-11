package day13_String;
import java.util.Scanner;
public class Task5_CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three words on separate lines:");
        String word1= scan.next();
        String word2= scan.next();
        String word3= scan.next();

        if (word1.length()==word2.length()&&word2.length()==word3.length()){
            System.out.println("All words are the same length");
        }else if (word1.length()==word2.length()&&word1.length()!=word3.length()||word1.length()==word3.length()&&word2.length()!=word3.length()||word2.length()==word3.length()&&word1.length()!=word3.length()){
            System.out.println("Varied lengths. Some equal, some not.");
        }else{
            System.out.println("All different lengths");
        }
    }
}
/*5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"*/