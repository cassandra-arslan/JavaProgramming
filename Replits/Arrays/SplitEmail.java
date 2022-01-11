package Arrays;
import java.util.*;
public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        //Write your code below
        if(email.contains("@")) {
            if(email.indexOf("@")==email.lastIndexOf("@")) {
                String[] arr1 = email.split("@");
                System.out.println("Email id: " + arr1[0]);
                System.out.println("Email domain: " + arr1[1]);
            }else{
                System.out.println("invalid email");
            }
        }else{
            System.out.println("invalid email");
        }
    }
}
