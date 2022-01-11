package day18_NestedLoops.day29_ArrayList;
import java.util.*;
public class ArraysListPractice1 {
    public static void main(String[] args) {
        String[] countries = {"Japan","Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //converting array to ArrayList:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length()>=10);

        //converting ArrayList to array
        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

    }
}
