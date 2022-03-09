package GroupPracticeTasks;
import java.util.Scanner;
public class mar_9_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of chars:");
        String str = scan.nextLine();
        System.out.println(remove_duplicates(str));
    }
    public static String remove_duplicates(String str){
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(!(result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
