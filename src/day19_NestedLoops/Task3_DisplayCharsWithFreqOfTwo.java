package day19_NestedLoops;
import java.util.Scanner;
public class Task3_DisplayCharsWithFreqOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String str = scan.nextLine();
        String result = "";

        for (int i=0; i<str.length(); i++){
            int count= 0;
            for( int j=0; j<str.length(); j++){
                if (str.charAt(i)==' '){
                    continue;
                }
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count>=2){
                if (result.contains(""+str.charAt(i))){
                    continue;
                }
            result += ""+str.charAt(i);
            }
        }
        System.out.println("All duplicated chars are: "+result);
        scan.close();
    }
}
/* 3. Write a program that can display all the characters that appeared twice in the string.*/
