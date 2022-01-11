package day08_IfStatements;
import java.util.Scanner;
public class EligibleTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            for (int i = 1; i<=10; i++) {
                System.out.println("Who can buy cigars? \nEnter name: ");
                String name = scan.next();
                System.out.println("Age: ");
                int age = scan.nextInt();
                boolean isEligible = age >= 21;
                if (isEligible) {
                    System.out.println(name + " is eligible to buy cigars");
                }
                if (!isEligible) {
                    //System.out.println(name + " cannot buy cigars :(");
            }
            }
            scan.close();
        }
    }
}
