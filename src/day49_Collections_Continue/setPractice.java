package day49_Collections_Continue;

import java.util.*;

public class setPractice {
    public static void main(String[] args) {
        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
        "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper Towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

//        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
//        arr = set1.toArray(new String[0]);
//        System.out.println(set1);
//        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200,300,400,500,500,600,10,10,20,30,40,30,20,10));
        //list = new ArrayList<>()


    }
}
