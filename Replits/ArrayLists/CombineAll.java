package ArrayLists;
import java.util.Scanner;
import java.util.ArrayList;
public class CombineAll {
    //create your method below
    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(numbersOne);

        list2.addAll(numbersTwo);
        return list2;
    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAll(list, list2));

    }
}
