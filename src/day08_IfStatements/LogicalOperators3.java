package day08_IfStatements;

public class LogicalOperators3 {
    public static void main(String[] args) {
        String name4 = "James";

        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        System.out.println("-----------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);
        boolean result3=!result2;
        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }


}
