package day34_GarbageCollection_AccessModifiers;

public class Test {
    public Test(){
        System.out.println("Developer");
    }
    public void Test(){
        System.out.println("SDET");
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}
