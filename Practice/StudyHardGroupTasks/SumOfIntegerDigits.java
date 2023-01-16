package StudyHardGroupTasks;
public class SumOfIntegerDigits {
    public static void main(String[] args) {
        int num= 1234;
        int d = num%10;
        int c = (num/10)%10;
        int b = ((num/100)%10);
        int a = num/1000;
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        System.out.println(a+b+c+d);

    }
}
