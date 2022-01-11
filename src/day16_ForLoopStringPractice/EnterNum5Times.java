package day16_ForLoopStringPractice;
import java.util.Scanner;
public class EnterNum5Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        for (int i= 0; i<=5; i++){
            System.out.println("Please enter 5 different numbers (neg or pos):");
            int num = scan.nextInt();
            if (num>0){
                pos+=1;
            }else if (num<0){
                neg+=1;
            }else{
                num=0;
            }
        }
        System.out.println(pos+" positives and "+neg+" negatives");
        scan.close();
    }
}
/*1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative*/
