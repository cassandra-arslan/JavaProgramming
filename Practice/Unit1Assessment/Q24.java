package Unit1Assessment;

public class Q24 {
    public static void main(String[] args) {
        int check = 132;
        String str = "";

        if (check % 2 == 0) { //true
            str += check;
            if (check % 5 == 0) { //false
                str += "132";
            } else {
                str = "500"; //result = 500
            }
        } else {
            str += "123";
        }
        System.out.println(str);
    }
}
