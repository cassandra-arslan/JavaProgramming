package day07_Operators;

public class KgtoLb {
            public static void main(String[] args) {
            double kG = 1;
            double pound = kG*2.2;
            int pound2=20;
            double kG2= pound2*(9.09/20);

            System.out.println("Kilogram Pound     ||    Pound   Kilogram");
            for(int i=1; i<=100; i++){

                System.out.println(Math.round(kG*100)/100+"         "+Math.round(pound*100.0)/100.0+"      ||      "+pound2+"       "+Math.round(kG2*100.00)/100.00);

                kG +=2;
                pound =2.2*kG;
                pound2 +=5;
                kG2 = pound2*(9.09/20);



            }
        }
    }

