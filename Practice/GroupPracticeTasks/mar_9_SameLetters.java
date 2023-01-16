package GroupPracticeTasks;
import java.util.Arrays;
import java.util.Scanner;
public class mar_9_SameLetters {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your first string of chars:");
            String str1 = scan.nextLine();
            System.out.println("Please enter your second string of chars:");
            String str2 = scan.nextLine();
            System.out.println("str1 and str2 are built from the same letters: "+same(str1, str2));
        }

        public static boolean same(String str1, String str2){
            char [] arr1=str1.toCharArray();
            char [] arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String result1="";
            String result2="";
            for(char each : arr1){
                result1+=each;
            }
            for(char each : arr2){
                result2+=each;
            }
            return result1.equals(result2);
        }
    }

