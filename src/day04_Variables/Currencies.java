package day04_Variables;


        public class Currencies {
            public static void main(String[] args) {
                int dollar = 1500;
                double liraCurrency = dollar * 9.53;
                double euroCurrency = dollar * 0.863;
                double cadCurrency = dollar * 1.236;
                double poundCurrency = dollar * 0.73;
                double jpyCurrency = dollar * 114.14;
                System.out.println("dollar = $" + dollar);
                System.out.println("\nliraCurrency = ₺" + liraCurrency);
                System.out.println("\neuroCurrency = €" + euroCurrency);
                System.out.println("\ncadCurrency = $" + cadCurrency);
                System.out.println("\njpyCurrency = ¥" + jpyCurrency);
                System.out.println("\npoundCurrency = £" + poundCurrency);
    }

}
