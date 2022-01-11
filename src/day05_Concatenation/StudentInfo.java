package day05_Concatenation;

/* 2. Create a class called StudentInfo, and declare variables for the followings:
                1. student name
                2. age
                3. gender
                4. school name
                5. phone number
                6. full time

 */
public class StudentInfo {
    public static void main(String[] args) {
        String studentName = ("Yusuf Arslan");
        int age = 8;
        char gender = 77;
        String schoolName = "Del Cerro Elementary";
        String phoneNumber = "949-510-4918";
        boolean isFullTime = true;

        System.out.println("Student Name = " + studentName);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("School Name = " + schoolName);
        System.out.println("Phone Number = " + phoneNumber);
        System.out.println("FullTime? = " + isFullTime);
    }

}
