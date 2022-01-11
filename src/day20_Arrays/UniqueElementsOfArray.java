package day20_Arrays;
import java.util.*;
public class UniqueElementsOfArray {
    public static void main(String[] args) {

        String [] word = {"Java", "Java", "Python", "C#", "Python"};
        for (int j = 0; j < word.length; j++) {
            String element = word[j]; //"Java"
            int count = 0;
            for (int i = 0; i < word.length; i++) {
                if (word[i].equals(element)) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(element);
            }
        }
    }
}
