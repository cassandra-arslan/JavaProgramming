package day21_ArraysUtility;
import java.util.Scanner;
public class DinnerTask6_FreqOfJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any sentence:");
        String sentence = scan.nextLine().toLowerCase();
        String cleanString = "";
        int countJava= 0, countPython=0;
        for (int i=0; i<sentence.length(); i++){
            if ((sentence.charAt(i)>='A'&&sentence.charAt(i)<='Z')||(sentence.charAt(i)>='a'&&sentence.charAt(i)<='z')||(sentence.charAt(i)==' ')){
                cleanString +=sentence.charAt(i);}
        }
        String[] arrayString = cleanString.split(" ");
        for (String each : arrayString){
            if (each.contains("java")){
                countJava++;
            }else if(each.contains("python")){
                countPython++;}
        }
        System.out.println("In the sentence:\n"+sentence+"\nThe word java appears "+countJava+" times and the word python appears "+countPython+" times");
        scan.close();
    }
}
/*6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)*/