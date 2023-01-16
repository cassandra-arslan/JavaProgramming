package zPractice;

public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public void setTomorrow(int tomorrow){
        this.tomorrow = tomorrow;
    }
    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        System.out.print(today+tolls.tomorrow +tolls.yesterday);
    }

    //just making a change for commit purposes
}
