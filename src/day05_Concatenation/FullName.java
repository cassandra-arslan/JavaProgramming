package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Cassandra";
        String lastName = "Arslan";
        int age = 34;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100_000.58;
        String fullName = firstName + " " + lastName;

        System.out.println("Name: " + fullName + "\nAge: " + age);
        System.out.println("Full name of the person is " + fullName + " , she is " + age + " years old.");
        System.out.println(fullName + " is " + age + " and working as a " +jobTitle + " with a yearly salary of $" + salary);

    }

}
