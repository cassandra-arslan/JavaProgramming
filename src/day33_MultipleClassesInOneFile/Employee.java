package day33_MultipleClassesInOneFile;

public class Employee {
    public String name;
    public double salary;
    public static boolean isEmployed = true;
    public static boolean isHuman = true;


    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
