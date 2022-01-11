package Arrays;
import java.util.*;
public class ReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        //TODO: start your code here
        String reversed = "";
        String[] word = sentence.split(" ");
        for(int i=word.length-1; i>=0; i--) {
            reversed += word[i] + " ";
        }
        System.out.println(reversed);
    }
}
