package Warmup_1;

public class posNeg {

    public static void main(String[] args) {
        System.out.println(posNeg(-4,5,true));
    }
    public static boolean posNeg(int a, int b, boolean negative){
            if (negative){
                if(a < 0 && b < 0) {
                    return true;
                }else{
                    return false;
                }
            }else if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                return true;
            } else {
                return false;
            }
        }
    }

