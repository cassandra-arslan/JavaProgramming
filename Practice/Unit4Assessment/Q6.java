package Unit4Assessment;

public class Q6 {
    String name;
    int numOfTests;

    public void setInfo(String name, int numOfTests){
        this.name = name;
        this.numOfTests = numOfTests;
    }

    public static void main(String[] args) {
        Q6 t = new Q6();
        t.setInfo("smoke test", 15);
    }
}
