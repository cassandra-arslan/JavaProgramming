package day30_CustomClasses;
import java.util.*;
public class CustomClasses {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers, 0,  numbers.size()-1);
        System.out.println(numbers);
        //int[]arr= {1,2,3,4,5,6,7,8};
        //System.out.println( Arrays.toString(arr));

        System.out.println("--------------------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);
        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize = list.size();

        int totalNumberOf0 = size-newSize;
        System.out.println("Total number of zeroes: "+totalNumberOf0);

        for (int i = 0; i < totalNumberOf0; i++) {
            list.add(0);
        }
        System.out.println(list);
        System.out.println("--------------------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer each :list2){
            if(each!=0){
                result.add(each);
            }
        }
        for(Integer each :list2){
            if(each==0){
                result.add(each);
            }
        }
        System.out.println(result);
        System.out.println("--------------------------------------------");

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> charList = new ArrayList<>();
        for(int i= 0; i<str.length();i++){
            charList.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(charList);
        letters.removeIf(p-> !Character.isLetter(p)); //remove chars that are not letters
        System.out.println("Letters: "+letters);

        ArrayList<Character> digits = new ArrayList<>(charList);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("Digits: " + digits);

        ArrayList<Character> special = new ArrayList<>(charList);
        special.removeAll(digits);
        special.removeAll(letters);
        System.out.println("Special chars: " + special);

    }
}
/*1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}*/