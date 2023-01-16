package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();
        for (String each : arr) {
            int count = Collections.frequency(Arrays.asList(arr), each);
            if(count ==1){
                result.put(each, 1);
            }
        }
        System.out.println(result);
    }
}
