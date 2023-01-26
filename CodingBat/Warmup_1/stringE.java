package Warmup_1;

public class stringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
        System.out.println(stringE("Hll"));
        System.out.println(stringE(""));
    }
    /*Return true if the given string contains between 1 and 3 'e' chars.
        stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false*/

    public static boolean stringE(String str){
        char[] eachCh = str.toCharArray();
        int count = 0;
        for( char each: eachCh){
            if(each=='e'){
                count++;
            }
        }
        if(count>=1&&count<=3){
            return true;
        }else{
            return false;
        }

    }

}
