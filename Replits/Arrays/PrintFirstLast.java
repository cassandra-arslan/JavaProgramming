package Arrays;
import java.util.*;
public class PrintFirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line
        //TODO: Write your code below
        String firstLast = "";
        for(String each : words){
            firstLast=each.substring(0,1)+each.substring(each.length()-1);
            System.out.println(firstLast);
        }
    }
}
