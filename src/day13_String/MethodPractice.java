package day13_String;
import java.util.Scanner;
public class MethodPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println(email);

        String sentence = "Java Java Python Python C# C# C++ Python Python Python Python ";
        String sentence2 = sentence.replace("Python ", "");
        System.out.println(sentence2);
    }
}
