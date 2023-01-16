package Warmup_1;

public class icyHot {

    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(2,120));
    }


    public static boolean icyHot(int temp1, int temp2) {
        if((temp1>0&&temp2<100)||(temp1<0&&temp2>100)){
            return true;
        }else{
            return false;
        }
    }
}
