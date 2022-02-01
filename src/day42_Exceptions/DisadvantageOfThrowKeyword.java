package day42_Exceptions;

public class DisadvantageOfThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Hello");
        sleep(2.5);
        System.out.println("Hello World");
        System.out.println("-----------------------------");
        System.out.println("Hello");
        //MorningWorkout.sleep(2.5);
        System.out.println("Cydeo");

    }


    public static void sleep(double seconds) {
        try {
            Thread.sleep( (long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
