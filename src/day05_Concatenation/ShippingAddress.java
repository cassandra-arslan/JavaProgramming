package day05_Concatenation;
/* Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

 */
public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Enes Arslan";
        int buildingNum = 2050;
        String streetName = "W Chapman Ave";
        int suite = 223;
        String city = "Orange";
        String state = "CA";
        int zip = 92868;
        String address = name + "\n" + buildingNum + " " + streetName + "\nSuite " + suite + "\n" + city + " , " + state + " " + zip;

        System.out.println(name + "\n" + buildingNum + " " + streetName + "\nSuite " + suite + "\n" + city + " , " + state + " " + zip);
        System.out.print("\n" + address);

    }

}
