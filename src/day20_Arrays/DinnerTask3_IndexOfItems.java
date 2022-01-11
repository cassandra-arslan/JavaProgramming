package day20_Arrays;
import java.text.DecimalFormat;
public class DinnerTask3_IndexOfItems {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$###,###.00");
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        int index = 0;
        String result = "";
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                if (items[j].equals("Gloves")) {
                    index = j;
                }
            }
            for (int j = 0; j < items.length; j++) {
                if (items[j].contains("iPad")) {
                    result = "yes";
                }
            }
            System.out.println(items[i] + " " + df.format(prices[i]) + " " + itemIDs[i]);
        }
        System.out.println("Index of Gloves: " + index);
        System.out.println("Has iPad: " + result);
    }
}



/*3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

*/