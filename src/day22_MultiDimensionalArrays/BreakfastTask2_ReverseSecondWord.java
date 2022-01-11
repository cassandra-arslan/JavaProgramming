package day22_MultiDimensionalArrays;
import java.util.Scanner;
public class BreakfastTask2_ReverseSecondWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String sentence = scan.nextLine();
        String [] words = sentence.split(" ");
        String reverse = "";
        for (int i = words[1].length()-1; i >=0; i--){
            reverse += words[1].charAt(i);}
        sentence = sentence.replaceFirst(words[1], reverse);
        System.out.println(sentence);
       scan.close();
    }
}
/* //System.out.println(reverse);
        //words[1] = reverse;
        //System.out.println(Arrays.toString(words));

        /*for (String word : words){
            System.out.println(word +" ");
        }
2. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java*/