package day08_IfStatements;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your country of birth: ");
        String citizen = sc.next();
        if (age >= 18 && citizen.equals("USA")) {
            System.out.println("Congratulations! " + name + " is eligible to vote!");

        }else {
                System.out.println("Sorry, " + name + " is not eligible to vote.");

            }
        sc.close();
        }
    }
