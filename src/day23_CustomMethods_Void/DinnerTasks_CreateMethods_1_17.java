package day23_CustomMethods_Void;
import java.text.DecimalFormat;
import java.util.Arrays;
public class DinnerTasks_CreateMethods_1_17 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.00");
        printOddNums1_100();
        System.out.println();
        System.out.println("-----------------------------------");
        printEvenNums1_100();
        System.out.println();
        System.out.println("-----------------------------------");
        eligibleToBuyAlcohol(19);
        System.out.println("-----------------------------------");
        eligibleToVote(34, "USA");
        System.out.println("-----------------------------------");
        System.out.print("Your grade is ==> ");
        calculateGrade(93);
        System.out.println("-----------------------------------");
        System.out.print("Area of the circle is: ");
        areaOfCircle(5.7);
        System.out.println("-----------------------------------");
        System.out.print("Area of the square is: ");
        areaOfSquare(4.1);
        System.out.println("-----------------------------------");
        dollarToEuro(500.00);
        System.out.println("-----------------------------------");
        dollarToLira(500.00);
        System.out.println("-----------------------------------");
        convertKGtoLB(66);
        System.out.println("-----------------------------------");
        posNegZero(5);
        System.out.println("-----------------------------------");
        printEachChar("Hello, how are you?");
        System.out.println("-----------------------------------");
        int[] nums = {1, 25, 67, 98, 45, 32};
        printEachElement(nums);
        System.out.println("-----------------------------------");
        calculate(5, 3, '+');
        System.out.println("-----------------------------------");
        nameFormat("enes", "arslan");
        System.out.println("-----------------------------------");
        anagram("listen", "quite");
    }
    //1. create a method that can print odd numbers between 1~100 in a same line separated by space
    public static void printOddNums1_100() {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }

    //2. create a method that can print even numbers between 1~100 in a same line separated by space
    public static void printEvenNums1_100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }

    //3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
            ;
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }
    }

    //4. create a method that can check if a person is eligible to vote
    public static void eligibleToVote(int age, String citizenship) {
        if (age >= 18 && (citizenship.equalsIgnoreCase("USA") || citizenship.equalsIgnoreCase("US") || citizenship.equalsIgnoreCase("America") | citizenship.equalsIgnoreCase("American"))) {
            System.out.println("You are eligible to vote in America");
        } else {
            System.out.println("You are not eligible to vote in America");
        }
    }

    //5. create a method that can calculate the grade of the student based on the score
    public static void calculateGrade(int score) {
        char grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
        System.out.println(grade);
    }

    //6. create a method that can calculate the area of a circle
    public static void areaOfCircle(double radius) {
        double area = radius * radius * 3.14;
        System.out.println(area + "cm");
    }

    //7. create a method that can calculate the area of a square
    public static void areaOfSquare(double side) {
        double area = side * side;
        System.out.println(area + "cm");
    }

    //9. create a method that can convert dollar to euro
    public static void dollarToEuro(double dollars) {
        DecimalFormat df = new DecimalFormat("###,###.00");
        double euro = dollars * 1.13;
        System.out.println("$" + df.format(dollars) + " dollars are equal to €" + df.format(euro) + " euro");
    }

    //10. create a method that can can convert dollar to lira
    public static void dollarToLira(double dollars) {
        DecimalFormat df = new DecimalFormat("###,###.00");
        double lira = dollars * 14.41;
        System.out.println("$" + df.format(dollars) + " dollars are equal to ₺" + df.format(lira) + " lira");
    }

    //11. create a method that can convert kg to lb
    public static void convertKGtoLB(double kg) {
        double lb = kg * 2.205;
        System.out.println(kg + " kilograms are equal to " + lb + " pounds");
    }

    //12. create a method that can if the given integer is positive, negative or zero
    public static void posNegZero(int num) {
        String result = num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero";
        System.out.println(result);
    }

    //13. create a method named printEachChar that can print each of the characters of a string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "  ");
        }
        System.out.println();
    }

    //14. create a method named printEachElement that can print each of the elements of an integer array
    public static void printEachElement(int[] nums) {
        for (int each : nums) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    //15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculate(double num1, double num2, char operator) {
        double result = 0;
        String symbol = "";
        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {
            if (operator == '+') {
                result = num1 + num2;
                symbol = "Add";
            } else if (operator == '-') {
                result = num1 - num2;
                symbol = "Subtract";
            } else if (operator == '*') {
                result = num1 * num2;
                symbol = "Multiply";
            } else {
                result = num1 / num2;
                symbol = "Divide";
            }
        }
        System.out.println(symbol + " " + num1 + " and " + num2 + " = " + result);
    }

    //16. write a method that can print out the full name of a person in regular format
    public static void nameFormat(String firstName, String lastName) {
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = firstName + " " + lastName;
        System.out.println("Full name is " + fullName);
    }

    //17. create a method that can check if two strings are anagram
    public static void anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            System.out.println(str1+" and "+str2+" are anagrams");
        }else{
            System.out.println(str1+" and "+str2+" are NOT anagrams");
        }

    }
}