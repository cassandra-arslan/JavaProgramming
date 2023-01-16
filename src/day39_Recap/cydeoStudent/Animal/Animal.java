package day39_Recap.cydeoStudent.Animal;

public class Animal {
    private String name, breed, size, color;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Invalid name "+name);
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()||breed.isBlank()){
            System.err.println("Invalid breed "+breed);
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.isEmpty()||size.isBlank()){
            System.err.println("Invalid size "+size);
            System.exit(1);
        }
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(size.isEmpty()||size.isBlank()){
            System.err.println("Invalid color "+color);
            System.exit(1);
        }
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender>='A'||gender<='z'){
            System.err.println("Invalid gender "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<1||age>125){
            System.err.println("Invalid age "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println("The animal is eating");
    }
    public void drink(){
        System.out.println("The animal is drinking");
    }
    public void sleep(){
        System.out.println("The animal is moving");
    }

}
