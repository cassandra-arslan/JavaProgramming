package day33_MultipleClassesInOneFile;
import java.text.DecimalFormat;
public class EmployeeObjects {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$###,###.00");
        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110_000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 115_000;

        Employee employee3 = new Employee();
        employee3.name= "Fady";
        employee3.salary = 120_000;

        System.out.println(employee1.name+" : "+df.format(employee1.salary));
        System.out.println(employee2.name+" : "+df.format(employee2.salary));
        System.out.println(employee3.name+" : "+df.format(employee3.salary));
    }

}
