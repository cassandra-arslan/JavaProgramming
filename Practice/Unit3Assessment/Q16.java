package Unit3Assessment;

public class Q16 {
    public static void main(String[] args) {
        double number = add(3.4); //2.5
        number += add("dual"); //10
        number += add(Integer.parseInt("100")); //5
        number += add(11341L); //2.5
        number += add(Float.parseFloat("50.8")); //2.5

        System.out.println(number);
    }
    public static int add(int n){
        return 5;
    }
    public static double add(double d){
        return 2.5;
    }
    public static long add(String s){
        return 10;
    }
}
