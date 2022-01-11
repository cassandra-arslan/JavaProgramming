package day18_NestedLoops.day29_ArrayList;
import java.util.*;
public class ReverseArrayList {
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1, j=0; i >= 0&& j<list.size(); i--, j++){
            list.set(j, list.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        System.out.println("-------------------");
        reverse(list);
        System.out.println(list);
    }
}
