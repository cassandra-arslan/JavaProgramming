package day23_CustomMethods_Void;
public class MethodPractice2 {
    public static void main(String[] args) {
        helloCydeoX5();
        System.out.println("---------------");
        helloWorldX5();
        System.out.println("---------------");
        evenNums1_10();
    }

    public static void helloWorldX5() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void helloCydeoX5() {
        String str = "Hello Cydeo \n";
        System.out.println(str.repeat(5));
    }
    public static void evenNums1_10() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}