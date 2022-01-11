package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber, groupNumber;
    public static String schoolName = "Cydeo School", programmingLanguage = "Java", secretCode = "Wooden Spoon";
    public String fieldOfStudy;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    public static void printSchool(){
        System.out.println("School name is: "+schoolName);
    }
    public static void printSecretCode() {
        System.out.println("code is " + secretCode);
    }
    public void attendClass() {
        System.out.println(name + " is attending class");
    }
    public void study() {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", school name='" + schoolName + '\'' +
                ", programming language=" + programmingLanguage +
                ", secret code=" + secretCode +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}


/*2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()*/