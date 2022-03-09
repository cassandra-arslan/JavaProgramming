package GroupPracticeTasks;
import java.util.Scanner;
public class feb_22_PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int num = scan.nextInt();
        System.out.println(isPrime(num));
    }
    public static String isPrime(int num){
        String result = "";
        boolean isPrime =false;
        for(int i= 2; i<num; i++){
            if(num%i==0){
                isPrime = true;
            }
            }
        return num+" is prime number: "+isPrime;
    }
}
