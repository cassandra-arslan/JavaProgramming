package day19_NestedLoops;
import java.util.Scanner;
public class Task1_ReturnFirstDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text:");
         String str = scan.nextLine();
         String result = "";
        for (int j =0; j< str.length(); j++){
            int count = 0;
            char ch = str.charAt(j);
            for (int i= 0; i<str.length(); i++){
                char each = str.charAt(i);
                if (ch== ' '){
                    continue;
                }
                if (ch==each){
                    count++;
                }
            }
            if(count>=2){
                result +=ch+"";
                break;
            }
        }
        System.out.println(result);
        scan.close();
    }
}
/*1. Write a program that can return the first duplicated character from a string*/
