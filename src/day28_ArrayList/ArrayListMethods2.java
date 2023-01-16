package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(500);


        System.out.println(list.get(list.size()-1));
        System.out.println(list);
        //int num = 1;
        //list.remove(num);
        //System.out.println(list);

        Integer num = 200;

        boolean r= list.remove(num);
        System.out.println(list);
        System.out.println(r);
        System.out.println("---------------------------");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("---------------------------");
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('B');

        ArrayList<Character> unique = new ArrayList<>();
        boolean isUnique = false;
        for(char each: chars) {
            if(chars.indexOf(each)==chars.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);
        
        boolean r2 = chars.contains('A');
        boolean r3 = chars.contains('Z');
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
}
