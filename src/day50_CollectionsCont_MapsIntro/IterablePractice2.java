package day50_CollectionsCont_MapsIntro;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //remove all names "ahmed" without using Lambda
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd","John", "Ercon", "Daniel", "Mustafa", "Muhammed", "Ahmed", "ahmed", "Yuliya", "Chris"));
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println(names);
        System.out.println("----------------------------------------------------");
        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd","John", "Ercon", "Daniel", "Mustafa", "Muhammed", "Ahmed","ahmed", "Yuliya", "Chris"));
        for(Iterator<String> i = names2.iterator(); i.hasNext();){
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names2);
        System.out.println("----------------------------------------------------");
        List<String> names3 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd","John", "Ercon", "Daniel", "Mustafa", "Muhammed", "Ahmed","ahmed", "Yuliya", "Chris"));
        names3.removeIf(each -> each.equalsIgnoreCase("ahmed"));
        System.out.println(names3);

        System.out.println("----------------------------------------------------");

        //Set<Integer> q =


    }
}
