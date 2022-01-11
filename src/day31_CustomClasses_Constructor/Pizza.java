package day31_CustomClasses_Constructor;

public class Pizza {
    public char size;
    public int numberofCheeseTopping, numberofPepperoniTopping;

    public Pizza(char size, int numberofCheeseTopping, int numberofPepperoniTopping){
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberofPepperoniTopping = numberofPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice = (size=='S')? 10 : (size =='M')? 12 : 14;

        double totalPrice = startingPrice+ (numberofPepperoniTopping+numberofCheeseTopping)*2;

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberofPepperoniTopping=" + numberofPepperoniTopping +
                ", total price= $"+calcCost() +
                '}';
    }
}
/*Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping*/