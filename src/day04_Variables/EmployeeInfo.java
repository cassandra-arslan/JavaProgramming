package day04_Variables;

/*6. Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
*/

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = ("Hamza Arslan");
        int age = 5;
        char gender = 77;
        String company = ("zpizza");
        String jobTitle = "Pizza Box Maker";
        double yearsOfExperience = 2;
        int salary = 14560;
        boolean isFullTime = false;
        boolean isMarried = false;
        String employeeID = ("4616");
        String SSN = ("123-45-6789");

        System.out.println("Company: " + company);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("Full time?: " + isFullTime);
        System.out.println("Married?: " + isMarried);
        System.out.println("Social Security #: " + SSN);

    }

}
