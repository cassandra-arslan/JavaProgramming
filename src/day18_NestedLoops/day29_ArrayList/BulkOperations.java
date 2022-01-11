package day18_NestedLoops.day29_ArrayList;
import java.util.*;
import java.util.ArrayList;
public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,6,7,8,8,8,9,10)); // add collection of values (use Arrays.asList)
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));//removes all matching elements (use Arrays.asList)
        System.out.println(list);

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("------------------------------------------------------------");
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);
        System.out.println("------------------------------------------------------------");


    }
}
