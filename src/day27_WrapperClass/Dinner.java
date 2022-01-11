package day27_WrapperClass;
import java.util.*;
public class Dinner {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        array = insert(array, 3, 4);
        System.out.println(Arrays.toString(array));
    }
    /*1. Insert Task:
	1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
	the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};
					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
		1.2 Create the same function for double array, char array and string array*/
    public static int[] insert(int[] array, int index, int element) {
        if (index<0 ||index>=array.length){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length + 1];
        result[index]= element;

        for (int i=0, j=0; i<array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j]= array[i];
        }
        return result;
    }
    public static double[] insert(double[] array, int index, double element) {
        if (index<0 ||index>=array.length){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length + 1];
        result[index]= element;

        for (int i=0, j=0; i<array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j]= array[i];
        }
        return result;
    }
    public static char[] insert(char[] array, int index, char element) {
        if (index<0 ||index>=array.length){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length + 1];
        result[index]= element;

        for (int i=0, j=0; i<array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j]= array[i];
        }
        return result;
    }
    public static String[] insert(String[] array, int index, String element) {
        if (index<0 ||index>=array.length){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length + 1];
        result[index]= element;

        for (int i=0, j=0; i<array.length; i++, j++) {
            if (i == index) {
                j++;
            }
            result[j]= array[i];
        }
        return result;
    }
    /*2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array*/
    public static int[] swap(int[]array, int i, int j){
        int temp = array[i];
        array[i] =array[j];
        array[j] = temp;
        return array;
    }
    public static double[] swap(double[]array, int i, int j){
        double temp = array[i];
        array[i] =array[j];
        array[j] = temp;
        return array;
    }
    public static char[] swap(char[]array, int i, int j){
        char temp = array[i];
        array[i] =array[j];
        array[j] = temp;
        return array;
    }
    public static String[] swap(String[]array, int i, int j){
        String temp = array[i];
        array[i] =array[j];
        array[j] = temp;
        return array;
    }
    /*3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";*/
    public static void retrieve(String str){
        String letters = "";
        String digits = "";
        String special = "";

        for(int i=0; i<str.length();i++){
            char each = str.charAt(i);
            if(Character.isLetter(each)) {
                letters += each;
            }else if(Character.isDigit(each)){
                digits+= each;
            }else{
                special+= each;
            }
        }
        System.out.println("Letters ==> " + letters);
        System.out.println("Digits ==> " + digits);
        System.out.println("Special ==> " + special);
    }
     /*4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true*/
    public static boolean upperLowerEqual(String str){
        int countUpper= 0;
        int countLower= 0;

        for(int i= 0; i<str.length(); i++){
            char each = str.charAt(i);

            if(Character.isUpperCase(each)){
                countUpper++;
            }else if(Character.isLowerCase(each)){
                countLower++;
            }
        }
        boolean result = countLower==countUpper;
        return result;
    }
}
