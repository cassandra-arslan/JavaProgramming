package day23_CustomMethods_Void;
import java.util.Scanner;
public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(8);
        oddOrEven(225);
        oddOrEven(250);
        System.out.println("--------------------------");
        displayAge(1987);
    }

    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number +" is even");
        }else{
            System.out.println(number +" is odd");
        }
    }
    public static void displayAge(int birthYear){
        int currentYear= 2021;
        int age = currentYear-birthYear;
        System.out.println("A person born in "+birthYear+" is "+age+" years old");
    }
}
