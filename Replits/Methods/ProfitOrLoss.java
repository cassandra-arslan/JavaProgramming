package Methods;
import java.util.*;
public class ProfitOrLoss {
    public static String profits(int buyPrice,int sellPrice){
        //your code here
        String result = "";
    if(buyPrice>sellPrice){
        result = "loss";
    }else if(buyPrice<sellPrice){
        result = "profit";
    }else{
        result= "no loss";
    }
    return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
}
