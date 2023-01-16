package Unit4Assessment;

public class Q23 {
    static int count;
    public Q23(){
        count++;
    }
    public Q23(int i){
        count+=i;
    }
    public Q23(String s){
        count += s.length();
    }
}
class Test{
    public static void main(String[] args) {
        new Q23();
        Q23 a = new Q23();
        Q23 a2 = new Q23("word");
        Q23 a3 = new Q23(5);
        System.out.print(Q23.count);



    }
}
