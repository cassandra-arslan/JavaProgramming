package Unit4Assessment;

public class Q24 {
    static int number; //0
    public Q24(String str){
        this(str.length()); //this(6);
    }
    public Q24(int num){
        this();
        number+=num;
    }
    public Q24(){
        number +=1;
    }
}
class CallPhones{
    public static void main(String[] args) {
        new Q24("iphone");
        new Q24();
        new Q24(4);
        System.out.println(Q24.number); //number+1, number+6, number+1, number+1, number+4
                                        // 0+1       1+6         7+1       8+1     9+4  =13
    }
}
