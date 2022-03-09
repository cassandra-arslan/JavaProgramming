package StudyHardGroupTasks;
import java.util.Scanner;
import java.lang.Math;
public class feb_28_ArmstrongNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Armstrong number checker\nPlease enter any number: ");
        int num = scan.nextInt();
        System.out.println(num+" is an armstrong number: " + isArmstrong(num));
    }

    public static boolean isArmstrong(int n){
        if (n<=0){
            throw new RuntimeException("Invalid number");
        }
        boolean isArmstrong = false;
        String[] array = String.valueOf(n).split("");
        int result = 0;
        int power = array.length;
        for(int i=0; i<array.length; i++){
            result +=Math.pow(Integer.parseInt(array[i]), power);
            }
            if(result == n){
                isArmstrong= true;
            }
        return isArmstrong;
        }
    }

    /*public static boolean isArmstrong(int num){
        if (num<=0){
            throw new RuntimeException("Invalid number");
        }
        String number = String.valueOf(num);
        char[] eachNum = number.toCharArray();
        int[] eachNumInArr = new int[eachNum.length];

        for (int i = 0; i<eachNum.length; i++){
            eachNumInArr[i] = Integer.parseInt(eachNum[i]+"");
        }

        int power = eachNum.length;

        int sum = 0;

        for (int each : eachNumInArr) {
            int multiplication = 1;
            for (int i=0; i<power; i++){
                multiplication*=each;
            }
            sum+=multiplication;
        }

        return sum==num;
    }*/


