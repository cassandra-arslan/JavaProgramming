package day30_CustomClasses;

public class Dog {

    public String name;
    public String breed;
    public String color;
    public String size;
    public int age;
    public char gender;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name= dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
/*
Attritbutes:
name
age
gender
breed
size
color

Actions:
eat()
shed()
bark()
play()
potty()
sleep()
bite()

 */
