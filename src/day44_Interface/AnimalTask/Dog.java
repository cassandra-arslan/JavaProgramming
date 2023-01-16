package day44_Interface.AnimalTask;

public final class Dog extends Animal implements Playable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is eating Pizza");
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void play(){
        System.out.println(getName()+" is playing with a ball");
    }
}
