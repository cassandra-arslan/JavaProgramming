package day47_Polymorphism;

public class InheritanceReview {
    int a;
    public InheritanceReview(int a){
        System.out.println("Parent class' constructor");
    }
}

class A extends InheritanceReview{
    public A(int a) {
        super(a);
    }
}
class B extends A{
    public B(int a) {
        super(a);
    }
}
class C extends B{
    public C(int a) {
        super(a);
    }
}
class D{

}