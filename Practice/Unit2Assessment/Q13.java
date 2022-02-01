package Unit2Assessment;

public class Q13 {
    public static void main(String[] args) {
        int number = 5;
        while (number<100){ //num:5 +5, num:10+10, num:20+20, num:40+40,num:80+80
            //                      10     +  20     +   40       + 80     +160
            number+=number;
        }
        System.out.println(number);
    }
}
