package day13_String;
import java.util.Scanner;
public class Task4_ThreeLetterWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three letter word");
        String word1 = scan.nextLine().toLowerCase();
        String middleLetter = (""+word1.charAt(word1.length()-2));
        if (word1.length()==3){
            if (middleLetter.equals("a")){
                System.out.println("Cool word");
            }else {
                System.out.println("Okay word");
            }
        }else if (word1.length()>3){
            System.out.println("Word is too long");
            if (word1.equals("love")||word1.equals("peace")||word1.equals("unity")){
                System.out.println("but.. COOL WORD!");
            }
        }else {
            System.out.println("Word is too short");
        }
        scan.close();
    }
}
/*4. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"*/