package day36_Inheritance.Lunch;

public class Tester extends Employee {

    public void test(){
        System.out.println(name+" is testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating a ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + df.format(salary) +
                '}';
    }
}
