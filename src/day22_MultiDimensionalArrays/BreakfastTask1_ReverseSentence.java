package day22_MultiDimensionalArrays;
import java.util.Scanner;
public class BreakfastTask1_ReverseSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any sentence:");
        String s = scan.nextLine();
        String cleanS= "";
        String reversed = "";
        for (int i=0; i<s.length(); i++){
            if ((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)==' ')){
                cleanS +=s.charAt(i);}
        }
        String[] arrayString = cleanS.split(" ");
        for (int i=arrayString.length-1; i>=0; i--){
            reversed+=arrayString[i]+" ";}
        System.out.println(reversed);
        scan.close();
    }
}
/*1. Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today*/