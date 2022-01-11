package day19_NestedLoops;
import java.util.Scanner;
public class Task4_ReturnIndexOfUniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String str = scan.nextLine();
        int result = 0;

        for (int i = 0; i<str.length(); i++){
            int count=0;
            for (int j = 0; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    result = str.indexOf(str.charAt(i));
                    count++;
                }
            }
            if(count==1){
                break;
            }
        }
        System.out.println("Index of first unique Char is: "+result);
    }
}
/* 4. Write a program that can return the index number of the first unique character.*/
