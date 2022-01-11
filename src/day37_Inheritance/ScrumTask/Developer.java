package day37_Inheritance.ScrumTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void fixbugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }
}
