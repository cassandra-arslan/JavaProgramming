package Warmup_1;

public class front3 {

    public static void main(String[] args) {
        System.out.println(front3("Java"));
    }

    public static String front3(String str){
        if(str.length()>=3){
            String str1 = str.substring(0,3);
            return str1+str1+str1;
        }else{
            return str+str+str;
        }
    }
}
