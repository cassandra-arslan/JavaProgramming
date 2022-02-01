package Unit4Assessment;

public class Q9 {
    double width;
    double length;

    public String print(){
        return "Width: "+width+", Length: "+length;
    }
    public void setInfo(double width, double length){
        this.width = width;
        this.length = length;
    }
}
class UseBoxes{
    public static void main(String[] args) {
        Q9 box = new Q9();
        box.setInfo(5,11);
        System.out.print(box);
    }
}
