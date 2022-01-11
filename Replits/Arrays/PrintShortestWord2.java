package Arrays;
import java.util.*;
public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // write your code below
        String[] array = str.split(", ");
        int length= array[0].length();
        String words = "";
        for(int i=0; i< array.length;i++){
            if(array[i].length()<length){
                length=array[i].length();
            }
        }
        for(String each: array){
            if(each.length()==length){
                words+=each+" ";
            }
        }
        String[] shortestWords= words.split(" ");
        Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));
    }
}
