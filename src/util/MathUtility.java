package util;

public class MathUtility {
    // 1 Create a method that can return the sum of two integers
    public static int sum (int num1,int num2){
        return num1+num2;
    }

    // 2 Create a method that can return the sum of two decimal numbers
    public static double sum (double num1,double num2) {
        return num1 + num2;
    }

    // 3 Create a method that can return the subtraction of two integers
    public static int subtract (int num1, int num2){
        return num1-num2;
    }

    // 4 Create a method that can return the subtraction of two decimals
    public static double subtract (double num1, double num2){
        return num1-num2;
    }

    // 5 Creat a method that can return the multiplication of two integers
    public static int multiplication (int num1, int num2){
        return num1*num2;
    }

    // 6 Create a method that can return the multiplication of two decimals
    public static double multiplication (double num1, double num2){
        return num1*num2;
    }

    // 7 Create a method that passes two double parameters and return the division result
    public static double division (double num1,double num2){
        return num1/num2;
    }

    // 8 Create a method that can check if an integer is even number
    public static boolean evenNumber (int number){
        boolean even = false;
        if(number %2 ==0){
            even= true;
        }
        return even;
    }
    // 9 Create a method that can check if an integer is odd number
    public static boolean oddNumber (int number){
        boolean odd = false;
        if(number %2 !=0){
            odd = true;
        }
        return odd;
    }

    // 10 Create a method that can return the maximum number between two integers
    public static int maximumNumber (int num1,int num2) {
        int result = num2;

        if (num1 > num2) {
            result = num1;
        }
        return result;
    }

    // 11 Create a method that can return the maximum number between two decimal numbers
    public static double maximumNumber (double num1,double num2) {
        double result = num2;

        if (num1 > num2) {
            result =num1;
        }
        return result;
    }

    // 12 Create a method that can return the minimum number between two integers
    public static int minimumNumber (int num1, int num2){
        int result = num2;
        if (num1<num2){
            result = num1;
        }
        return result;
    }

    // 13 Create a method that can return the minimum number between two decimal numbers
    public static double minimumNumber (double num1, double num2){
        double result = num2;
        if (num1<num2){
            result = num1;
        }
        return result;
    }

    // 14 Create a method that can return the square of an integer
    public static int square (int number){
        return number*number;
    }

    // 15 Create a method that can return the square of a double
    public static double square (double number){
        return number*number;
    }

    // 16 Create a method that can return the cube of an integer
    public static int cubicSquare (int number){
        return square(number)*number;
    }

    // 17 Create a method that can return the cube of a double
    public static double cubicSquare (double number){
        return square(number)*number;
    }
}
