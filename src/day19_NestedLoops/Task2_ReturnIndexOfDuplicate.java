package day19_NestedLoops;
import java.util.Scanner;
public class Task2_ReturnIndexOfDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String str = scan.nextLine();
        int result = 0;
        for (int i = 0; i<str.length(); i++){
            int count = 0;
            for (int j= 0; j<str.length(); j++){
                if (str.charAt(i)==' '){
                    continue;
                }
                if (str.charAt(i)==str.charAt(j)){
                    result = str.indexOf(str.charAt(i));
                    count++;
                }
            }
            if (count>=2){
                break;
            }
        }
        System.out.println("First index of duplicated char is: "+result);
        scan.close();
    }
}
/*2. Write a program that cna return the index number of the first duplicated character from a string*/