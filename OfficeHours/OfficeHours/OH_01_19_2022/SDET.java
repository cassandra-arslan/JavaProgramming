package OfficeHours.OH_01_19_2022;

public class SDET {
    public SDET(){
        System.out.print(1);
    }
    public SDET(int number){
        this();
        System.out.print(3);
    }
    public SDET(String name){
        this(name.length());
        System.out.print(7);
    }
}

class Team{
    public static void main(String[] args) {
        new SDET("Aygun"); //137
        new SDET(); // 1
        new SDET(4); //13

        //17113
    }
}
