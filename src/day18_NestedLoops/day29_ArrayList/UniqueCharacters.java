package day18_NestedLoops.day29_ArrayList;
import java.util.*;
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeefff";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")) );
        System.out.println("list = " + list);
        
        String unique = "";
        for(String each :list){
            int frequency = Collections.frequency(list,each);
            if(frequency==1){
                unique += each;
            }
        }
        System.out.println("unique = " + unique);
    }
}
