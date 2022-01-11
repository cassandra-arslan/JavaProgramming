package day32_CustomClasses_ConstructorsII;
import java.text.DecimalFormat;
public class Employee {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, char gender){
        this(name);
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + df.format(salary) +
                '}';
    }
}
