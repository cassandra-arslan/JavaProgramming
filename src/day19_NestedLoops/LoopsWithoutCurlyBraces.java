package day19_NestedLoops;
import java.util.Scanner;
public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println("Cydeo"); //no curly braces then it can only execute one line of code

        for (int i = 0 ; i <5; i++){ //curly braces allow it to execute multiple lines of code
            System.out.println("Batch 25");

        }
    }
}