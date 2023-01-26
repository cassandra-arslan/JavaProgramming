package Warmup_1;

public class delDel {

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
        System.out.println(delDel("abcdel"));
        System.out.println(delDel("aadelbb"));
    }


    public static String delDel(String str){
        if(str.length()>1){
            if(str.substring(1).startsWith("del")){
                return str.charAt(0)+str.substring(4);
            }else{
                return str;
            }
        }else{
            return str;
        }
    }

}
