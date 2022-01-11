package day05_Concatenation;
/*1. create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
                     */
public class PhoneNumber {

    public static void main(String[] args) {
        String company = "E3 Autos Inc";
        int countryCode = 1;
        int areaCode = 949;
        int localNum = 500;
        int localID = 6766;

        System.out.print(company+" +"+countryCode+"("+areaCode+")"+localNum+"-"+localID);

    }
}
