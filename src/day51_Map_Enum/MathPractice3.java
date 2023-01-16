package day51_Map_Enum;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MathPractice3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //Display the names of all employees with maximum salary
        int maxSalary = Integer.MIN_VALUE;

        for ( Integer eachValue : map.values() ) {
            if(eachValue > maxSalary){
                maxSalary = eachValue;
            }
        }


        int maxSalary2 = Collections.max( map.values() );

        System.out.println("maxSalary = " + maxSalary2);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSalary2) {
                System.out.println(pair.getKey());
            }
        }
    }
}
