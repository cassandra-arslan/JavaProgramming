package AvengersHour;

public class Toghrul {
    public static int[] mergR(int[] a,int[] b) {

        int[] newArray= new int[a.length+ b.length];
        int index=0;

        for (int each:a){
            newArray[index++]=each;

        }
        for (int each:b){
            newArray[index++]=each;

        }
        return newArray;
    }
}
