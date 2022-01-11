package day31_CustomClasses_Constructor.ScrumTask;
import java.text.DecimalFormat;
public class Tester {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating a ticket");
    }
    public void dailyStandUp(){
        System.out.println(name+ " is attending daily stand-up meeting");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + df.format(salary) +
                '}';
    }
}
/*Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fields

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()*/