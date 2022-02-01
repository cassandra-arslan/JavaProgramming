package Unit2Assessment;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 2;
        int num2 = 6;
        int iterate = 5;

        int total = 0;
        for(int j=0; j<iterate; j++){
            if(j%3==0) continue;
            total+= num1+num2;
        }
        System.out.println(total); //skip iteration 1 and 3. result = j1=8,j2=16,j4=24
    }
}
