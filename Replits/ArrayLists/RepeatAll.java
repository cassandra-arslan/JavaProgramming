package ArrayLists;
import java.util.*;
public class RepeatAll {
    //create your method below
   // public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> isRepeated){

    //}



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        //System.out.println(repeatAll(list));
    }
}
