package day20_Arrays;
import java.util.Scanner;
public class DinnerTask1_ClassMateInitials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] classMates = {"Aliya Gazizova","Yuliya Shea","Allison Camizci","Farangez Hikmatova","Elena Baidalo",
                "Sinem Kaya","Madina Ramazanova","Nesibe Sabanci","Magdalena Gruszka", "Hulya Keles"};

        for (int i=0; i<classMates.length; i++){
            System.out.println(classMates[i].charAt(0)+"."+classMates[i].charAt(classMates[i].lastIndexOf(" ")+1));
        }
    scan.close();
    }
}
/*1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each class-mates in separate lines*/