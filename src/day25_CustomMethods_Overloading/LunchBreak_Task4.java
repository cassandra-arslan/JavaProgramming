package day25_CustomMethods_Overloading;
public class LunchBreak_Task4 {
    public static void main(String[] args) {
        int[]array1 = {23,45,67,1,98,34};
        System.out.println(returnMax(array1));
        System.out.println("----------------------------------");
        double[]array2 = {23.5,85.7,76.3,1.1,13.2,34.5};
        System.out.println(returnMax(array2));
        System.out.println("----------------------------------");
        long[]array3 = {23000,785168468,67651468,1,168787,3484384};
        System.out.println(returnMax(array3));
        System.out.println("----------------------------------");
        short[]array4 = {23000,7868,668,1,1607,3484};
        System.out.println(returnMax(array4));
        System.out.println("----------------------------------");
        float[]array5 = {1.32f,785168.45f,676514.61f,1.648f,168787.94f,34843.53f};
        System.out.println(returnMax(array5));
        System.out.println("----------------------------------");
        byte[]array6 = {127,111,-126,11,-59,34};
        System.out.println(returnMax(array6));
        System.out.println("----------------------------------");
    }
    //1. create a method that can return the max number from an integer array
    public static int returnMax(int[]array){
            int max=0;
            for(int each: array){
                if(each>max){
                    max=each;
                }
            }
            return max;
    }
    //2. create a method that can return the max number from double array
    public static double returnMax(double[]array){
        double max=0;
        for(double each: array){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    //3. create a method that can return the max number from long array
    public static long returnMax(long[]array){
        long max=0;
        for(long each: array){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    //4. create a method that can return the max number from short array
    public static short returnMax(short[]array){
        short max=0;
        for(short each: array){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    //5. create a method that can return the max number from float array
    public static float returnMax(float[]array){
        float max=0;
        for(float each: array){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    //6. create a method that can return the max number from byte array
    public static byte returnMax(byte[]array){
        byte max=0;
        for(byte each: array){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
}
