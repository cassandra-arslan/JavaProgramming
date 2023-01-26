package Warmup_1;

public class intMax {

    public static void main(String[] args) {
        System.out.println(intMax(1,2,3));
        System.out.println(intMax(1,3,2));
        System.out.println(intMax(3,2,1));
        System.out.println(intMax(4,9,1));
    }

    public static int intMax(int a, int b, int c){
        if(a>b&&a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else {
            return c;
        }
    }
}
