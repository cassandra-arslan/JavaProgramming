package ArrayLists;
import java.util.*;
public class RemoveEveryOther {
    //create your method below
    public static ArrayList<String> removeEveryOther(ArrayList<String> words){
        for(int i=0; i<words.size(); i++){
            words.remove(i);
        }
        return words;
    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }
}
