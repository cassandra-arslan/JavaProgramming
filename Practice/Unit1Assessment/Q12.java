package Unit1Assessment;

public class Q12 {
    public static void main(String[] args) {
        int a = 10;
        a = --a + a++ + a-- + a++; //9+9+10+9=37
        System.out.println(a);

    }
}
