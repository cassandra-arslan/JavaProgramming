package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class EligibleTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            for (int i = 0; i <= 100; i++) {
                System.out.println("Let's see who can vote? \nEnter a name: ");
                String name = scan.nextLine();
                System.out.println("Enter age: ");
                int age = scan.nextInt();
                while (!(age >= 1 && age <= 110)) {
                    System.err.println("Invalid age, please re-enter:");
                    System.out.println("Enter age: ");
                    age = scan.nextInt();
                }
                scan.nextLine();
                System.out.println("Enter country of citizenship:");
                String citizenOf = scan.nextLine();
                boolean usCitizen = (citizenOf.equalsIgnoreCase("USA") || citizenOf.equalsIgnoreCase("US") || citizenOf.equalsIgnoreCase("AMERICA") || citizenOf.equalsIgnoreCase("UNITED STATES"));

                boolean isEligible = age >= 21 && usCitizen;
                if (isEligible) {
                    System.out.println(name + " is eligible to vote in America");
                    System.out.println();
                } else {
                    System.err.println(name + " cannot vote in America :(");
                    System.out.println();
                }
            }
        scan.close();
        }
        }


