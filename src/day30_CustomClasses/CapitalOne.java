package day30_CustomClasses;

import day31_CustomClasses_Constructor.BankAccount;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Cassandra Arslan", 123456789);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        account1.deposit(900);
        account1.checkBalance();

        System.out.println("--------------------------------------");
        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun Abbasova Jarullah", 987654321);
        System.out.println(account2);

        account2.deposit(10_000);
        account2.checkBalance();

    }
}
