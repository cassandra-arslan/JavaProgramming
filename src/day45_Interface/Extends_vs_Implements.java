package day45_Interface;

class A{
    protected void methodA(){
        System.out.println("Method A");
    }
}
class B extends A{
    public void methodA(){
        System.out.println("Method C");
    }
    public void methodB(){
        System.out.println("Method B");
    }
}

public class Extends_vs_Implements {
    public static void main(String[] args) {
        A obj = new B();
        obj.methodA();
    }
}
