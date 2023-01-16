package day39_Recap.cydeoStudent;

public class Cydeo {
    public static void main(String[] args) {


        Tester tester = new Tester("Ahmet", 34, 'M', 15746, "SDET", 110_000);

        Developer developer = new Developer("Jonathon", 25, 'M', 13764, "Software Engineer", 159_000);

        Teacher teacher = new Teacher("Muhtar", 29, 'M', 11456, "Java Instructor", 90_000);

        Student student = new Student("Julia", 32, 'F', 35476, "SDET");


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println("-----------------------------");
        tester.work();
        developer.work();
        teacher.work();
        System.out.println("-----------------------------");
        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();
        System.out.println("-----------------------------");
        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();
        System.out.println("-----------------------------");
        teacher.eat();
        teacher.drink();
        teacher.sleep();
        System.out.println("-----------------------------");

    }
}
