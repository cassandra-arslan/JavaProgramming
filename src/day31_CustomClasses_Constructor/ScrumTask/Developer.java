package day31_CustomClasses_Constructor.ScrumTask;
import java.text.DecimalFormat;
public class Developer {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= " + df.format(salary) +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+ "is unit testing");
    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }
}
/*create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fields

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()*/