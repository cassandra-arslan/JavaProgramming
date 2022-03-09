package StudyHardGroupTasks;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args) {
        String[] str = {"1","2","3","4"};
        System.out.println(Arrays.toString(reverse(str)));
    }
    public static String[] reverse(String[] str){
        String[] result = new String[str.length];
        int count = 0;
        for(int i= str.length-1; i>=0; i-- ){
            result[count++]=(str[i]);
        }
        return result;
    }
}
