package Methods;
import java.util.*;
public class Signum {
    public static void sign(int n){
        //your code here:
    if(n>0){
        System.out.println("positive");
    }else if(n==0){
        System.out.println("zero");
    }else{
        System.out.println("negative");
    }
    }
    // DO not change:
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        sign(n);
    }
}
