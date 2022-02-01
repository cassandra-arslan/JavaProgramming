package Unit2Assessment;

public class Q25 {
    public static void main(String[] args) {
        String[] strs = {"display", "population","meeting","copy","franchise"};

        int a = strs.length;
        int b = strs[5].length(); //only index of up to 4 so out of bound

        System.out.println(a+ " " +b);
    }
}
