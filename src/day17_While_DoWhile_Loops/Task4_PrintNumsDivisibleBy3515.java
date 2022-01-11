package day17_While_DoWhile_Loops;
import java.util.Scanner;
public class Task4_PrintNumsDivisibleBy3515 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scan.nextInt();
        String divBy3 = "", divBy5 = "", divBy15 = "";
        while (num<0){
            System.err.println("Invalid entry, try again");
            System.out.println("Enter a number:");
            num = scan.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                divBy15 += i+" ";
            }
            else if (i % 5 == 0) {
                divBy5 += i+" ";
            }
            else if (i % 3 == 0) {
                divBy3 += i+" ";
            }
            else{
                continue;
            }
        }
        System.out.println("Divisible by 3: " + divBy3);
        System.out.println("Divisible by 5: " + divBy5);
        System.out.println("Divisible by 15: " + divBy15);
    }
}

/*	4. Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
            then it should only be displayed in DivisibleBy15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
            then it should only be displayed in DivisibleBy3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
            then it should only be displayed in DivisibleBy5' section

            EX:
            input: 100

            Output:
            Divisible By 15 15 30 45 60 75 90
            Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
            Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

            Manas:        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        String div15="Divisible By 15: ", div5="Divisible By  5: ", div3="Divisible By  3: ";

        while (num<0){
            System.err.println("Invalid. Negative number.");
            System.out.println("Enter a number");
            num = new Scanner(System.in).nextInt();
        }

        for (int i = 1; i <= num; i++) {

            div3 = (i%3==0)?div3+i+" ":div3;
            div5 = (i%5==0)?div5+i+" ":div5;
            div15 = (i%15==0)?div15+i+" ":div15;

        }
        System.out.println(div15+"\n"+div5+"\n"+div3);

    }
}


            */
