package day44_Interface.AnimalTask;

public final class Parrot extends Animal implements Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void squawk(){
        System.out.println(getName()+" is squawking");
    }
    public void talk(){
        System.out.println(getName()+" is saying \"Polly want a cracker\"");
    }
    public void fly(){
        System.out.println(getName()+" is flying");
    }
    public void play(){
        System.out.println(getName()+" is playing with a bell");
    }
}
