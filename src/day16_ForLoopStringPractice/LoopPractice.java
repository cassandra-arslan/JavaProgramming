package day16_ForLoopStringPractice;
import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any combination of letters, digits, and special characters:");
        String str = scan.nextLine();
        String digits = "";
        String letters = "";
        String special = "";

        for (int i= 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            if (ch>='0'&&ch<='9'){
                digits+=ch;
            }else if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                letters+=ch;
            }else {//if character is not digit or letter, then it is special
                if (ch!= ' '){ //if special character is not a space
                    special +=ch;
                }
            }
        }
    }
}
