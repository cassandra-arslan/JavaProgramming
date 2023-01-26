package Warmup_1;

public class max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11,19));
        System.out.println(max1020(19,11));
        System.out.println(max1020(11,9));
        System.out.println(max1020(9,21));
        System.out.println(max1020(10,121));
        System.out.println(max1020(21,10));
        System.out.println(max1020(9,11));
        System.out.println(max1020(23,10));
        System.out.println(max1020(7,20));
        System.out.println(max1020(17,16));

    }
    /*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11
     */
    public static int max1020(int a, int b) {
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);
        if (aInRange) {
            if (!bInRange) {
                return a;
            } else if (a > b) {
                return a;
            }
        }
        if (bInRange) {
            if(!aInRange){
                return b;
            }else if (b > a) {
                return b;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
