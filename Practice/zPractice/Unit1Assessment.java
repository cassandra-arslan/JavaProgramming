package zPractice;

import java.util.Scanner;

public class Unit1Assessment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta+tb;
        ta.replace('C', 'D');
        ta = ta+tb;
        System.out.println(ta);
    }
}
