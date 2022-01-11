package day37_Inheritance;

class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("B");
    }
}