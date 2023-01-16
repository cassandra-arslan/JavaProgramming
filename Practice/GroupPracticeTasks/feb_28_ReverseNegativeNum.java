package GroupPracticeTasks;
import java.util.Scanner;
public class feb_28_ReverseNegativeNum {
    //Number - Reverse negative number
    //Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a negative number: ");
        int n = scan.nextInt();
        if(n<0){
            System.out.println(reverseNum1(n));
        }else{
            System.err.println("Invalid input");
        }
    }

    public static int reverseNum1(int num){
        boolean isNegative = num<0;
        if (isNegative){
            num *= -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        while (num>=1){
            lastDigit = num%10;
            reverse = reverse*10+lastDigit;
            num /=10;
        }

        if (isNegative){
            return reverse*-1;
        }else {
            return reverse;
        }

    }

    //2 solution
    public static int reverseNum2(int num){

        String numToStr = String.valueOf(num);

        boolean isNegative = numToStr.startsWith("-");

        if (isNegative){
            numToStr = numToStr.replaceFirst("-","");
        }

        String reverse = "";

        for (int i=numToStr.length()-1; i>=0; i--){
            reverse+=numToStr.charAt(i);
        }

        int result = Integer.parseInt(reverse);

        if (isNegative){
            return result*-1;
        }else{
            return result;
        }

    }
}
