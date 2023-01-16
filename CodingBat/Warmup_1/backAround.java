package Warmup_1;

public class backAround {

    public static void main(String[] args) {

    }


    public static String backAround(String str){
        if(str.length()>1){
            char ch = str.charAt(str.length()-1);
            return ch+str+ch;
        }else{
            return str+str+str;
        }
    }



}
