package day30_CustomClasses;
import java.util.Arrays;
import java.util.ArrayList;
public class DogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Large";
        dog1.color = "Mixed. Gray, black, and white";
        System.out.println(dog1);
        dog1.bark();

        System.out.println("---------------------------------");
        Dog dog2 = new Dog();
        dog2.name= "Hunter";
        dog2.breed= "Bloodhound mix";
        dog2.age = 6;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "Brown, black, tan";
        System.out.println(dog2);
        dog2.sleep();

        System.out.println("---------------------------------");
        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");
        System.out.println(dog3);
        dog3.eat();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully","Pit-Bull", 6, 'M',"Large", "Brown");
        System.out.println("---------------------------------");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender=='M');
        maleDogs.removeIf(p-> p.gender=='F');
        System.out.println(femaleDogs);
        System.out.println(maleDogs);
    }
}
