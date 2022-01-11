package day08_IfStatements;

public class Swap2Var {
    public static void main(String[] args) {
        int a = 50;
        int b = 10;

        b = (a+b);
            a=b-a;
            b=b-a;

         System.out.println("a = "+a);
         System.out.println("b = "+b);
         }

}
