package day27_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1= 200;

        Integer n1=num1; //autoboxing
        int num2 = n1; //unboxing (implicitly done)

        System.out.println("---------------------------------");

        Integer integerValue = 100;
        long longValue = integerValue;
        Byte b1 = 25;
        byte a1=b1;
        int a3 = b1;
        long a4= b1;

        System.out.println("-----------------------------------");

        int num3= 200;
        //Long l2 = num3; - doesn't work because wrong class
        Integer num4 = num3;
        //Double d1; num3;

        System.out.println("-----------------------------------");
        Integer z = 900;
        Integer y= z;

        System.out.println("----------------------------------");
        int[] numbers1= {1,2,3,4,5};
        Integer[] numbers2= {1,2,3,4,5};

    }
}
