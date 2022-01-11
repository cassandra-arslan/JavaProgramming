package OfficeHours.OH_01_05_2022;

public class Deeper {
    public static void main(String[] args) {
        System.out.println("Shallow");
        deep();
        System.out.println("Shallow");
    }
    public static void deep(){
        System.out.println("\tDeep");//2
        deeper();
        System.out.println("\tDeep");//4
    }
    public static void deeper(){
        System.out.println("\t\tDeeper");
    }
}
