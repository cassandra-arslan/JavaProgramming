package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class AppendPosSum {
    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();
        Integer sum = 0;
        for (Integer each : list) {
            if (each > 0) {
                list2.add(each);
                sum += each;
            }
        }
        list2.add(sum);
        return list2;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
