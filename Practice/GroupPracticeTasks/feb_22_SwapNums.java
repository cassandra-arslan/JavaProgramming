package GroupPracticeTasks;

public class feb_22_SwapNums {
    //Swap two variable' values without using a third variable
    public static void main(String[] args) {
        swapNums(5,10);
    }
    public static void swapNums(int a, int b){
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
