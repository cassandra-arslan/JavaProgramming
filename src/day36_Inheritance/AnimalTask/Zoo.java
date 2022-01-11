package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Large", "Mixed");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "Brown" );

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange/White/Black");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.roar();
        tiger.hunt();

    }
}
