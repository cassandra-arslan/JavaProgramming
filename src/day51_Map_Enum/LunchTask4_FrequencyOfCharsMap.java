package day51_Map_Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LunchTask4_FrequencyOfCharsMap {
//    2. Write a program that can return the freuqency of characters
//        Not: MUST use map
//
//        Ex: str = "bbcccaaaaa"
//
//        output:
//            {b=2, c=3, a=5}
public static void main(String[] args) {
    String str = "bbcccaaaaa";
    //            bca
    //            235
    //Collections.frequency()

    String[] arr = str.split("");
    Map<String, Integer> result = new LinkedHashMap<>();  //{b=2, c=3, a=5}

    for(String each : arr){
        result.put(each, Collections.frequency(Arrays.asList(arr), each));
    }

}
}
