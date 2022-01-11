package day35_Encapsulation.encapsulation;
import java.text.DecimalFormat;
public class Employee {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<=16||age>150){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("Invalid salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + df.format(salary) +
                '}';
    }
}
/*
1. create an employee class:
private variables: name, gender, age, salary
encapsulate all the private fields
1. Name can not be empty
2. Gender can't be anything other than female or male
3. age can not be zero, negative, or greater than 150
4. salary can't be zero or negative
 */