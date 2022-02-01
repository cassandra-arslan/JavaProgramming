package day42_Exceptions;

public class Q8 {
    public static void main(String[] args) {
        pause1();
        //pause2();
    }
    public static void pause1(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void pause2() throws InterruptedException{
        Thread.sleep(3000);
    }
}
