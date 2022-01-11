package util;
import java.util.Arrays;
public class ArrayUtility {


    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array){
            System.out.println(each);
        }
    }
    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array){
            System.out.println(each);
        }
    }
    //prints each String of a String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array){
            System.out.print(each+" ");
        }
        System.out.println();
    }
    //prints each String of a 3D String array in separate lines
    public static void printEachElement(String[][][] array){
        for (String[][] each2D : array){
            for(String[] each1D: each2D) {
                for (String each : each1D) {
                    System.out.print(each+" ");
                }
                System.out.println();
            }
        }

    }
    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array){
            System.out.println(each);
        }
    }
    //merges two integer arrays
    public static int[] mergeArray(int[] array1, int[] array2){
        int size = array1.length+ array2.length;
        int[] result= new int[size];
        int i= 0;
        for (int each : array1){
            result[i++] =each;
        }
        for (int each: array2){
            result[i++]= each;
        }
        return result;
    }
    //merges two double arrays
    public static double[] mergeArray(double[] array1, double[] array2){
        int size = array1.length+ array2.length;
        double[] result= new double[size];
        int i= 0;
        for (double each : array1){
            result[i++] =each;
        }
        for (double each: array2){
            result[i++]= each;
        }
        return result;
    }
    //merges two char arrays
    public static char[] mergeArray(char[] array1, char[] array2){
        int size = array1.length+ array2.length;
        char[] result= new char[size];
        int i= 0;
        for (char each : array1){
            result[i++] =each;
        }
        for (char each: array2){
            result[i++]= each;
        }
        return result;
    }
    //merges two String arrays
    public static String[] mergeArray(String[] array1, String[] array2){
        int size = array1.length+ array2.length;
        String[] result= new String[size];
        int i= 0;
        for (String each : array1){
            result[i++] =each;
        }
        for (String each: array2){
            result[i++]= each;
        }
        return result;
    }
    //Returns min element of integer array
    public static int returnMin(int[]array){
        int min=array[0];
        for(int each: array){
            if(each<min){
                min=each;
            }
        }
        return min;
    }
    //Returns min element of double array
    public static double returnMin(double[]array){
        Arrays.sort(array);
        return array[0];
    }
    //Returns min element of long array
    public static long returnMin(long[]array){
        Arrays.sort(array);
        return array[0];
    }
    //Returns min element of short array
    public static short returnMin(short[]array){
        Arrays.sort(array);
        return array[0];
    }
    //Returns min element of float array
    public static float returnMin(float[]array){
        Arrays.sort(array);
        return array[0];
    }
    //Returns min element of byte array
    public static byte returnMin(byte[]array){
        Arrays.sort(array);
        return array[0];
    }
    //return the maximum number for integer array
    public static int returnMax(int[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //Returns min element of double array
    public static double returnMax(double[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //Returns min element of long array
    public static long returnMax(long[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //Returns min element of short array
    public static short returnMax(short[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //Returns min element of float array
    public static float returnMax(float[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //Returns min element of byte array
    public static byte returnMax(byte[]array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    //checks if the given integer is contained in the given array, return boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array){
            if(each == element){
                result = true;

            }
        }
        return result;
    }
    //checks if the given double is contained in the given array, return boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array){
            if(each == element){
                result = true;

            }
        }
        return result;
    }
    //checks if the given char is contained in the given array, return boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array){
            if(each == element){
                result = true;

            }
        }
        return result;
    }
    //checks if the given String is contained in the given array, return boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for (String each : array){
            if(each.equalsIgnoreCase(element)){
                result = true;

            }
        }
        return result;
    }
    //reverse a 1D integer array
    public static int[] reverseArray(int[]array) {
        int[] reversed = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }
        return reversed;
    }
    //reverse a 1D double array
    public static double[] reverseArray(double[]array) {
        double[] reversed = new double[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }
        return reversed;
    }
    //reverse a 1D char array
    public static char[] reverseArray(char[]array) {
        char[] reversed = new char[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }
        return reversed;
    }
    //reverse a 1D String array
    public static String[] reverseArray(String[]array) {
        String[] reversed = new String[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }
        return reversed;
    }
    //reverse the order of the 1D arrays in a 2D array
    public static void reverse1DOrder(String arr2D[][]) {
        for (int i = arr2D.length- 1; i >= 0; i--) { //i = index of 1D arrays starting from last index until 0
            for (int i1 = 0; i1 < arr2D[i].length; i1++) { // j = index of elements starting from 0 to last index
                System.out.print(arr2D[i][i1] + " ");
            }
            System.out.println();
        }
    }
    //reverse each 1D array of 2D array
    public static void reverse1DElements(String arr2D[][]) {
        for (int i = 0; i < arr2D.length; i++) { //i = index of 1D arrays starting from first index until last
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) { // j = index of elements starting from last index to beginning
                System.out.print(arr2D[i][i1] + " ");
            }
            System.out.println();
        }
    }
    //reverse the elements and 1D arrays in a 2D array
    public static void reverse2DArray(String arr2D[][]) {
        for (int i = arr2D.length - 1; i >= 0; i--) { //i = index of 1D arrays starting from last index until 0
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) { // j = index of elements starting from last index to beginning
                System.out.print(arr2D[i][i1] + " ");
            }
            System.out.println();
        }
    }
    //add element to end of integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array){
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    //add element to end of double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];
        int i = 0;
        for (double each : array){
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    //add element to end of String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i = 0;
        for (String each : array){
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    //add element to end of char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array){
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    //find frequency of element of integer array
    public static int frequencyOfElement(int[] array, int element){
        int count= 0;
        for (int each : array){
            if(each==element){
                count++;
            }
        }
        return count;
    }
    //find frequency of element of double array
    public static int frequencyOfElement(double[] array, double element){
        int count= 0;
        for (double each : array){
            if(each==element){
                count++;
            }
        }
        return count;
    }
    //find frequency of element of char array
    public static int frequencyOfElement(char[] array, char element){
        int count= 0;
        for (char each : array){
            if(each==element){
                count++;
            }
        }
        return count;
    }
    //find frequency of element of String array
    public static int frequencyOfElement(String[] array, String element){
        int count= 0;
        for (String each : array){
            if(each.equalsIgnoreCase(element)){
                count++;
            }
        }
        return count;
    }
    //finds the unique elements of a given integer array
    public static int[] uniqueElements(int[]array){
        int[] result = {};
        for(int each: array){
            if(ArrayUtility.frequencyOfElement(array, each)==1){
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }
    //finds the unique elements of a given double array
    public static double[] uniqueElements(double[]array){
        double[] result = {};
        for(double each: array){
            if(ArrayUtility.frequencyOfElement(array, each)==1){
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }
    //finds the unique elements of a given char array
    public static char[] uniqueElements(char[]array){
        char[] result = {};
        for(char each: array){
            if(ArrayUtility.frequencyOfElement(array, each)==1){
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }
    //finds the unique elements of a given String array
    public static String[] uniqueElements(String[]array){
        String[] result = {};
        for(String each: array){
            if(ArrayUtility.frequencyOfElement(array, each)==1){
                result = ArrayUtility.addElement(result, each);
            }
        }
        return result;
    }
    //removes element at given index of integer array
    public static int[] removeElementAtIndex(int[]array, int index){
        if(index<0||index>array.length-1) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        int[] result = {};
        for(int i=0; i<array.length;i++){
            if(i!=index){
                ArrayUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
    //removes element at given index of double array
    public static double[] removeElementAtIndex(double[]array, int index){
        if(index<0||index>array.length-1) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        double[] result = {};
        for(int i=0; i<array.length;i++){
            if(i!=index){
                ArrayUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
    //removes element at given index of char array
    public static char[] removeElementAtIndex(char[]array, int index){
        if(index<0||index>array.length-1) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        char[] result = {};
        for(int i=0; i<array.length;i++){
            if(i!=index){
                ArrayUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
    //removes element at given index of integer array
    public static String[] removeElementAtIndex(String[]array, int index){
        if(index<0||index>array.length-1) {
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        String[] result = {};
        for(int i=0; i<array.length;i++){
            if(i!=index){
                ArrayUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
    //Replaces element at given index of integer array
    public static int[] replaceElement(int[] array, int index, int newElement){
        if(index<0||index> array.length){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //Replaces element at given index of double array
    public static double[] replaceElement(double[] array, int index, double newElement){
        if(index<0||index> array.length){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //Replaces element at given index of char array
    public static char[] replaceElement(char[] array, int index, char newElement){
        if(index<0||index> array.length){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //Replaces element at given index of String array
    public static String[] replaceElement(String[] array, int index, String newElement){
        if(index<0||index> array.length){
            System.err.println("Invalid index:"+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //Replaces all elements matching given element of integer array
    public static int[]replaceAll(int[]array, int oldValue, int newValue){
        for (int i=0; i< array.length; i++){
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
    //Replaces all elements matching given element of double array
    public static double[]replaceAll(double[]array, double oldValue, double newValue){
        for (int i=0; i< array.length; i++){
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
    //Replaces all elements matching given element of char array
    public static char[]replaceAll(char[]array, char oldValue, char newValue){
        for (int i=0; i< array.length; i++){
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }
    //Replaces all elements matching given element of String array
    public static String[]replaceAll(String[]array, String oldValue, String newValue){
        for (int i=0; i< array.length; i++){
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }
    //Remove duplicated elements from integer array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
    //Remove duplicated elements from String array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
    //Remove duplicated elements from double array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
    //Remove duplicated elements from char array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each: array){
            if (!ArrayUtility.contains(result, each)){
                result = ArrayUtility.addElement(result, each);

            }
        }
        return result;
    }
}
