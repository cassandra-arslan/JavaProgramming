package day18_NestedLoops.day29_ArrayList;
import java.util.ArrayList;
public class FirstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);

        for (Integer each : list){ // 1,1,2,3,3,4,5,5
            int frequency = 0;
            for(Integer element :list){ //1:1, 1:2, 1:3, 1:3, 1:4, 1:5, 1:5 ---- 1:
                if(element == each){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(each);
                break;
            }
        }

    }
}
