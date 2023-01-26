package Warmup_1;

public class mixStart {


    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("ix snacks"));
        System.out.println(mixStart("pixie"));
        System.out.println(mixStart("nix"));
        System.out.println(mixStart("MIX snacks"));
    }

    public static boolean mixStart(String str) {
        if (str.length() > 2) {
            if (str.toLowerCase().substring(1).startsWith("ix")) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
}
