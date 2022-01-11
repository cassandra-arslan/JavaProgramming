package Arrays;
import java.util.*;
public class PrintFirstLastCharOfElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        //TODO: Write your code below
        String[]firstLast= new String[words.length];
        for(int i= 0; i<words.length;i++){
            String result= "";
            result = ""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            firstLast[i]=result;
        }
        System.out.println(Arrays.toString(firstLast));
    }
}
