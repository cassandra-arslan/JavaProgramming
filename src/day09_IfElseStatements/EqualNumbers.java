package day09_IfElseStatements;
import java.util.Scanner;
public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt();
        String isEqual = "";

        isEqual= (n1 == n2 && n1 == n3)?"All are equal":(n1 == n2 && n1 != n3)?"n1 and n2 are equal": (n2 == n3 && n1 != n2)?"n2 and n3 are equal":(n3 == n1 && n3 != n2)?"n1 and n3 are equal": "None of them are equal";
        System.out.println(isEqual);
        scan.close();
    }
}
/*6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are equal ==> none of them are equal*/
