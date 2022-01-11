package day20_Arrays;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that's capable enough to contain 5 names
        String[]myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Mikael";
        myGroup[4] = "Hulya";

        // System.out.println(myGroup); *Prints as hashcode. Must use toString to print array as a string
        System.out.println(Arrays.toString(myGroup));
    }
}
