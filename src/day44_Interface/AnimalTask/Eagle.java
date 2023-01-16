package day44_Interface.AnimalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a snake");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void soar(){
        System.out.println(getName()+" is soaring high in the sky");
    }
    public void call(){
        System.out.println(getName()+" is calling out to it's young");
    }

    @Override
    public void hunt(){
        System.out.println(getName()+" is hunting for rabbits");
    }

    @Override
    public void fly(){
        System.out.println(getName()+" is flying");
    }
}
