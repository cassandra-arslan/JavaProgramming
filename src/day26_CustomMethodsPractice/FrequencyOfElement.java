package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {

    }
    public static int frequency(int[]arr, int element){
        int count= 0;
        for (int each : arr){
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequency(double[]arr, double element){
        int count= 0;
        for (double each : arr){
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequency(char[]arr, char element){
        int count= 0;
        for (char each : arr){
            if(each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequency (String[]arr, String element){
        int count= 0;
        for (String each : arr){
            if(each==element){
                count++;
            }
        }
        return count;
    }
}
/*1. Create a class named FrequencyOfElements:
            1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array*/
