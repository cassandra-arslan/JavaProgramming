package day1;

public class Task1PalindromeNumber {

    /*
        Palindrome Number

        Create a program that will check if the given number is palindrome.
        A number is palindrome if the digits are the same read forwards and backwards.
        Do not use a String

        Ex:
            Given n = 1234321 -> palindrome   - how to find the last digit mathematically %10
            Given n = 15651 -> palindrome
            Given n = 18374 -> not palindrome
            Given n = 1264628 -> not palindrome


            7894566/10=789456 remainder 6  789456/10 remainder 6

     */



















    public static void main(String[] args) {

        int n = 1264628;
        int orig = n;
        int reverse = 0;

        while(n > 0){
            int lastDigit = n % 10; // reads the last digit in the number
            reverse = reverse * 10 + lastDigit; //0*10=0+1  -> 1*10=10+2= 12 -> 12*10=120+3=123
            n /= 10;
        }
        System.out.println(n);

        System.out.println(orig + " " + (reverse == orig ? "Palindrome" : "Not Palindrome"));




    }




}
