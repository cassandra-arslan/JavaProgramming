package day15_String;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String str= " ";
        str.isEmpty();
        str.isBlank();

        String str2 = "Cydeo";
        System.out.println(str2.isBlank());
        System.out.println("__________________________________");

        String s1= "CYDEO";
        String s2= "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("__________________________________");

        String sentence = "I love Java, it is my favorite programming language";
        sentence.contains ("java");
        System.out.println(sentence.contains("java"));
        System.out.println(sentence.toLowerCase().contains("java"));


        //scan.close();
    }
}
