package day50_CollectionsCont_MapsIntro;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        Integer[] array = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(list);

        List<String> names1 = null;
        //System.out.println(names.size());

        System.out.println("------------------------------");

        //pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println("chars = " + chars); //[A,B,C,D]

        ((Stack)chars).pop();
        System.out.println("chars = " + chars); //[A,B,C]

        //poll() ==> FIFO

        List<String> names = new LinkedList<>();



    }
}
