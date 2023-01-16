package ArrayLists;
import java.util.*;
public class RepeatAll {
    //create your method below
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> isRepeated){
        ArrayList<Boolean> result = new ArrayList<>(isRepeated);
        for(int i= 0, j= 0; i<isRepeated.size(); i++, j++){
            result.add(isRepeated.get(i));
        }
        return result;
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));
    }
}
