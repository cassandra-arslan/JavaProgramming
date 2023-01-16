package Unit3Assessment;

public class Q14 {
    public static void main(String[] args) {
        int size = 5;
        int[] a = new int[size];
        int i=0;

        a[0]=7; //not divisible by 4
        a[1]=3; //not divisible by 4
        a[2]=8; //skip, divisible by 4
        a[3]=20; //skip, divisible by 4
        a[4]=14; //not divisible by 4
        method8(a);
    }
    public static void method8(int[] arr){
        for(int n: arr){
            if(n%4==0){
                continue;
            }
            System.out.print(n); //7 3 14
        }
    }
}
