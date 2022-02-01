package Unit4Assessment;

public class Q15 {
    int pages;
    static String author;
    static{
        author = "Stephen King";
    }
    public void set(int pages){
        this.pages = pages;
    }

    public static void main(String[] args) {
        Q15 b1 = new Q15();
        b1.set(500);
        b1.author = "Christopher Paolini";
        Q15 b2 = new Q15();

        System.out.print(b1.author.equals(b2.author)+ " ");
        System.out.print(b1.pages == b2.pages);
    }
}
