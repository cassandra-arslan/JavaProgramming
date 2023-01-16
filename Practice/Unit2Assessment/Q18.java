package Unit2Assessment;

public class Q18 {
    public static void main(String[] args) {
        String input = "today it will be 100 degrees !";
        int n= 0;
        while(n++ <input.length()){
            if(n==8){
                continue;
            }else if(n==9){
                break;
            }
            System.out.println(input.charAt(++n)); //d+y+i - continue and then break at index 9
        }
    }
}
