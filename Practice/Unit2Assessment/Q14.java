package Unit2Assessment;

public class Q14 {
    public static void main(String[] args) {
        int a = 0;
        do{
            a = a++ + --a - (a%3);
        }while(++a<4); //0,1,2,3 - a=6 then add 1 for ++a
        System.out.println(a); //a=7
    }
}
