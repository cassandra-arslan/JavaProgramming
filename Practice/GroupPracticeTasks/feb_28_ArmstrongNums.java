package GroupPracticeTasks;
import java.util.Scanner;
public class feb_28_ArmstrongNums {
    //Numbers - Armstrong numbers
    //Write a method that can check if a number is Armstrong  number
    //An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Armstrong number checker\nPlease enter any number: ");
        int num = scan.nextInt();
        int a, b,c,d;
        boolean isArmstrong = false;
            if(num>0&&num<=9){
                isArmstrong = true;
            }else if(num<=999){
                a = (num/100)%10;
                b = (num/10)%10;
                c =  num%10;
                if((a*a*a)+(b*b*b)+(c*c*c)==num){
                    isArmstrong = true;
                }
            }else if(num<=9999){
                a = num/1000;
                b= (num/100)%10;
                c = (num/10)%10;
                d = num%10;
                if((a*a*a*a)+(b*b*b*b)+(c*c*c*c)+(d*d*d*d)==num){
                    isArmstrong = true;
                }
            }else{
                System.err.println("Num too large");;
            }
        System.out.println(isArmstrong);
    }


    public static boolean isArmstrong(int num){

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
    }
}
