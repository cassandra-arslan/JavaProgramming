package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("----------------- Push-ups started ---------------------");

        for(int i=0;i<=30;i++){
            System.out.print("\rPush up "+i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("----------------- Push-ups completed ---------------------");
        System.out.println("----------------- Pull-ups started ---------------------");

        for(int i=0;i<=30;i++){
            System.out.print("\rPush up "+i);
            try{
                Thread.sleep(2500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("----------------- Pull-ups completed ---------------------");
        System.out.println("----------------- Sit-ups started ---------------------");

        for(int i=0;i<=30;i++){
            System.out.print("\rPush up "+i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("----------------- Sit-ups completed ---------------------");
    }

    public static void sleep(double seconds) throws InterruptedException {
            Thread.sleep( (long) (seconds * 1000));

    }
}
