package day09_IfElseStatements;
import java.util.Scanner;
public class SchoolByGradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte grade = scan.nextByte();

        boolean elementarySchool = (grade >0&& grade<=6);
        boolean intermediateSchool = (grade >=7&& grade<=8);
        boolean highSchool = (grade >=9&& grade<=12);
        boolean college = (grade >=13&& grade<=16);
        boolean gradSchool = (grade >=17&& grade<=23);
        boolean notinSchool = (grade >23);
        if (elementarySchool){
            System.out.println("Student is in Elementary school");
        }else if (intermediateSchool){
            System.out.println("Student is in Intermediate school");
        }else if (highSchool){
            System.out.println("Student is in High school");
        }else if (college){
            System.out.println("Student is in College");
        }else if (gradSchool){
            System.out.println("Student is in Graduate school");
        }else{
            System.out.println("Individual is not a student");
            }
        scan.close();
    }
}
/*2.  Given a number(byte) grade level determine and print which school
    type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
            Assume that the given number is 1 ~ 18*/