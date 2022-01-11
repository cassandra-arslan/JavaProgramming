package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task5_CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type any sentence with the words dog and cat multiple times");
        String sentence = scan.nextLine();
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i <= sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                countCat++;
            }else if(sentence.substring(i, i+3).equalsIgnoreCase("dog")){
                countDog++;
            }else{
            }
        }
        if (countDog==countCat){
            System.out.println("Dog: "+countDog+"\nCat: "+countCat+"\ntrue");
        }else{
            System.out.println("Dog: "+countDog+"\nCat: "+countCat+"\nfalse");
        }
        scan.close();
    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

*/