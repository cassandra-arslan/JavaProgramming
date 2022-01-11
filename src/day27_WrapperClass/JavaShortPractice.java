package day27_WrapperClass;

public class JavaShortPractice {
    public static void main(String[] args) {
        byte a= 10;
        short b = 20;
        int c = 30;

        Byte x = a;
        Short y = b;
        Integer z = c;

        byte q = x;

        //parse methods: converting strings to primitives, returns primitive
        String str = "123";
        int num1 = Integer.parseInt(str);
        System.out.println(num1);

        //valueOf methods: converting strings to wrapper class objects, returns wrapper class object
        String str2 = "1.5";

        Double e = Double.valueOf(str2);
        System.out.println(e);

    }
}
