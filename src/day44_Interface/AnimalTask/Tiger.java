package day44_Interface.AnimalTask;

public final class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a deer");
    }
    public void roar(){
        System.out.println(getName()+" is roaring");
    }
    public void kingOfTheJungle(){
        System.out.println(getName()+" is the king of the jungle");
    }
    public void hunt(){
        System.out.println(getName()+" is on the prowl for a deer");
    }
}
