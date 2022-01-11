package day35_Encapsulation;

public class Person {

    public String name, language;
    public int age;
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 1;
        numberOfWings = 0;
    }
    public static void printPlanetName(){
        System.out.println("Planet name is: "+planet);
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking"+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet name=" + planet +
                ", gender=" + gender +
                ", human?=" + isHuman +
                ", has nose=" + hasNose +
                ", number of heads=" + numberOfHeads +
                ", number of wings=" + numberOfWings +
                '}';
    }
}

/*2. Create a class named Person:
        Variables:
        name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

        Add a constructor to initialize all the fields

        Add a static block to initialize all the statics

        Methods:
        printPlanetName()
        eat(String food)
        drink(String drink)
        toString()*/