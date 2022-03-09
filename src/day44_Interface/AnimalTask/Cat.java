package day44_Interface.AnimalTask;

public final class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating Biryani");
    }
    public void meow(){
        System.out.println(getName()+" is meowing");
    }
    public void scrath(){
        System.out.println(getName()+" is scratching the furniture");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void play(){
        System.out.println(getName()+" is playing with a dead mouse");
    }
}
