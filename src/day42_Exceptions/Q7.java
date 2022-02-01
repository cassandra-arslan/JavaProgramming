package day42_Exceptions;

public class Q7 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }catch (NullPointerException e){
            System.out.println("NullPointerException is caught");
        }catch (RuntimeException e){
            System.out.println("RuntimeException is caught");
        //}catch(ArithmeticException e){
            System.out.println("ArithmeticException is caught");
        }
    }
}
