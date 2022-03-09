package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        ArrayList<String> result = new ArrayList<>(list);
        result.set(pos1, list.get(pos2));
        result.set(pos2, list.get(pos1));
        return result;

    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }
}
