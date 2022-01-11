package Arrays;
import java.util.*;
public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        double total= 0.0;
        double average = 0.0;
        int size = temps.length;
        for (double each :temps){
            total+=each;
        }
        average=total/size;
        System.out.println(average);
    }
}

