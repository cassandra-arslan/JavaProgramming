package day11_Switch_Scanner;
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num = scan.nextByte();
        String grade = "";

        if (num>0&&num<=18){
            if (num >=1&&num<=5){
                grade = "Elementary School";
            }else if (num>=6&&num<=8){
                grade = "Middle School";
            }else if (num>=9&&num<=12){
                grade = "High School";
            }else if (num>=13&&num<=16){
                grade = "College";
            }else{
                grade = "Grad School";
            }
            System.out.println(num+"(th) grade is known as "+grade);
        }else {
            System.out.println("Invalid grade level given");
        }
    }
}
/*1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/