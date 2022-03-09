package day47_Polymorphism;

import day44_Interface.AnimalTask.Animal;
import day44_Interface.AnimalTask.Dog;
import day45_Interface.ShapeTask.Circle;
import day45_Interface.ShapeTask.Shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        //Shape shape = (Shape) new Circle(5.5);  - Upcasting
        Shape shape2 = new Circle(5);  //upcasting is implicit
        //Webdriver driver = (Webdriver) new ChromeDriver(); - manual cast not needed
        Animal animal = new Dog("Max", "Husky", 'M',3,"Small", "White");
        Dog dog = (Dog)animal;
        Dog dog2 = new Dog("Lucy", "Husky", 'F', 5, "Small", "Mixed");

        //animal.bark();  - cannot use a method from Dog for animal unless it is casted and reassigned
        dog.bark();
        dog2.bark();
        ((Dog) animal).bark(); // downcasting with less code
    }
}
