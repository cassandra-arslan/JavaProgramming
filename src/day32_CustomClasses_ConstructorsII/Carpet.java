package day32_CustomClasses_ConstructorsII;
import java.text.DecimalFormat;
public class Carpet {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + df.format(unitPrice) +
                ", isPersian=" + isPersian +
                ", total price= "+df.format(calcCost()) +
                '}';
    }
}
