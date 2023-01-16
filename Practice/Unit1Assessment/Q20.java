package Unit1Assessment;

public class Q20 {
    public static void main(String[] args) {
        String str = "";
        int num = 20;

        switch(num){
            case 0:
                str = "C#";
                break;
            case 10:
                str += "is ";
            case 15:
                str += "fun ";
            case 20:
                str += "java "; //java - no break statement
            case 25:
                str += "is "; // is - result = "java is"
                break;
            case 30:
                str += "fun";
            case 35:
                str = "python";
            case 40:
                str += "90";
        }
        System.out.println(str);
    }
}
