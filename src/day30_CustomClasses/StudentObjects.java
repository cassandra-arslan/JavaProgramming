package day30_CustomClasses;
import java.util.Arrays;
import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'F');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 1232, 'A');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 26, 2265, 'B');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 28, 2511, 'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 31, 2252, 'C');

        Student[] students= {student1, student2, student3, student4, student5};
        for (Student each : students){
            System.out.println(each);
        }

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student:students){
             if(student.grade == 'A'){
                 earlyBirds.add(student);
             }else{
                 angryBirds.add(student);
             }
        }
        System.out.print("Early bird students are: ");
        for(Student student: earlyBirds){
            System.out.print(student.name+", ");
        }
        System.out.println();
        System.out.print("Angry bird students are: ");
        for(Student student: angryBirds){
            System.out.print(student.name+", ");
        }

    }
}
