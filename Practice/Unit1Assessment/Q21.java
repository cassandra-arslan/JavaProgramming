package Unit1Assessment;

public class Q21 {
    public static void main(String[] args) {
        double pi = 3.14;
        boolean b = 119%5 ==0; //false
        int num = 0;

        if(pi> 3.14 && !b){
            num +=50;
        }else{
            num -= 50; //-50
        }
        if(b){
            num += 50;
        }
        System.out.println(num);
    }
}
