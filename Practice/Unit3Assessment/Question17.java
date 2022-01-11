package Unit3Assessment;

import java.util.Scanner;

public class Question17 {
    public static int action(){
        return 0;
    }
    public static int action(int i){
        return i *2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        total += action(scan.nextBoolean());
        total += action(scan.nextInt());
        total += action();
        total += action(scan.next());
        total += action(scan.next());
        System.out.println(total);

    }
    public static int action (String s){
        return s.length();
    }
    public static int action(boolean b){
        if(!b){
            return 5;
        }else{
            return 10;
        }
    }
}
