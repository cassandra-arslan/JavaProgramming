package Unit1Assessment;

public class Q19 {
    public static void main(String[] args) {
        int cookies = 10;
        String day = "tuesday";

        switch(day){
            case "sunday":
                cookies++;
            case "monday":
                cookies +=5;
                break;
            case "tuesday": //10 - no break statement
            case "wednesday":
                cookies += 10; //+10 - no break statement
            case "thursday":
                cookies +=5; //+5 = 25
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies = 0;
        }
    }
}
