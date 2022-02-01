package Unit4Assessment;

import java.util.ArrayList;

public class Q22 {
    String size;
    ArrayList<Pillow> pillows = new ArrayList<>();

    public Q22 (String size, int numOfPillows){
        this.size = size;
        for(int i=0; i<numOfPillows; i++){
            this.pillows.add(new Pillow());
        }
    }
}
class Pillow{
    String material;

    public static void main(String[] args) {
        Q22 bed = new Q22("king",4);
        System.out.print(bed.pillows.size());
    }
}
