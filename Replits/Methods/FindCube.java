package Methods;
import java.util.Scanner;
public class FindCube {
    //your code here
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int result = num*num*num;
        System.out.println(result);
    }
    //end cube
    public static void main(String[] args) {
        cube();
    }
}
