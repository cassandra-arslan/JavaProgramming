package WarmUp2;

public class CountXX {
    public static void main(String[] args) {
        String str = "abcxx";
        String str2 = "xxx";
        String str3 = "xxxx";
        String str4 = "Hello there";
        String str5 = "Hexxo thxxe";
        String str6 = "";
        String str7 = "Kittens";
        String str8 = "Kittensxxx";
        String str9 = "abc";

        last2(str);

    }


    public static int last2(String str) {
        if(str.length()<2){
            return 0;
        }
        int count = 0;
        String last2 = str.substring(str.length()-2);
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+2).equals(last2)){
                count++;
            }
        }
        return count;
    }
}


