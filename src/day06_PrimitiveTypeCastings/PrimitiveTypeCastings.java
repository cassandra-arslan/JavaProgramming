package day06_PrimitiveTypeCastings;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {
        byte a = 100;
        int b = a+500;
        double c = b+5.5;

        int d = 1505;
        double e = (int)d+.27;

        int num1 = 200;
        byte num2 = (byte)num1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(num2);
        }
}
