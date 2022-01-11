package day20_Arrays;
import java.util.*;
public class ArraysPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char [] letters = new char[26];

        for (char i = 'Z', j=0; i>='A'&&j<letters.length; i--, j++){
            letters[j]=i;

        }
        System.out.println(Arrays.toString(letters));
    }
}
