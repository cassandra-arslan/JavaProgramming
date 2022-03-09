package day33_Statics_MultipleClassesInOneFile;

public class IphoneObjects {
    public static void main(String[] args) {

        System.out.println(Iphone.hasBattery);
        Iphone iphone = new Iphone();
        System.out.println(iphone.hasBattery);
    }
}
