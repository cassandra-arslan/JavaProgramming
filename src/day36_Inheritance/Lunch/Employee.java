package day36_Inheritance.Lunch;
import java.text.DecimalFormat;
public class Employee {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    public String name, jobTitle, companyName;
    public char gender;
    public int age, id;
    public double salary;

    public void setInfo(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Lunch{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + df.format(salary) +
                '}';
    }
    public class Tester extends Employee {
        public void test() {
            System.out.println(name + " is testing");
        }

        public void creatingTicket() {
            System.out.println(name + " is creating a ticket");
        }
    }
    public class Developer extends Employee{
        public void code(){
            System.out.println(name+" is coding");
        }

    }
}


/*Employee:
        name, gender, age, jobTitle, id, salary, companyName
        setInfo(), work(), toString()


    Tester

    Developer

    Driver

    Teacher
*/
