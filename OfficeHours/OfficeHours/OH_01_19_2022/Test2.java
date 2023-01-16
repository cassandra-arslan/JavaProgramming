package OfficeHours.OH_01_19_2022;

class Test {
    public Test(){
        System.out.println(1);
    }
    public Test(int num){
        this(5, "123");
        System.out.println(3);
    }

    public Test(int num, String str){
        System.out.println(5);
    }
    public Test(String str, int num, char ch){
        this(5);
        System.out.println(7);
    }

    @Override
    public String toString() {
        return "Test{}";
    }
}
public class Test2{
    public static void main(String[] args) {
        new Test();
        new Test("Cassandra", 34, 'F');
    }

}