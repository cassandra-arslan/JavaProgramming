package Methods;
import java.util.*;
public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }
    public static void person(String info) {
        //your code here
        String[] result = info.split(",");
        String name = result[0];
        String lastName= result[1];
        String age = result[2];
        System.out.println("person name: "+name+"\nlast name: "+lastName+"\nage: "+age);
    }
}
