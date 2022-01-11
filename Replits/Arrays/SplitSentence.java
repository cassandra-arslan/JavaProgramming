package Arrays;
import java.util.*;
public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        //type your code below
        String[] s = sentence.split(" ");
        for(String each: s){
            System.out.println(each);
        }
    }
}
