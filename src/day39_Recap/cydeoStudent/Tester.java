package day39_Recap.cydeoStudent;

public class Tester extends Employee{

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating a ticket");
    }
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is running regression testing");
    }

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }
}
