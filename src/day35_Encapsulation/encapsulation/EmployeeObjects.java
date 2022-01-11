package day35_Encapsulation.encapsulation;

import org.w3c.dom.ls.LSOutput;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tatiana", 'M', 30, 120_000);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 38, 115_000);

        employee2.setSalary(employee2.getSalary()+15_000);

        System.out.println(employee2);
    }
}
