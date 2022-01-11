package day07_Operators;

public class TempVariable {
    public static void main(String[] args) {
        int a = 10, b = 15;
        int temp = 0;

        temp = b;
        b= a;
        a=temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

/*Practice Tasks:
	1. write a program that can swap two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15
		        b = 10
 */