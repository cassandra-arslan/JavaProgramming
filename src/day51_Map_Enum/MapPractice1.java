package day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args){
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Diane", "F");
        employeeMap.put("Fred", "M");
        employeeMap.put("Jeremy", "M");
        employeeMap.put("Gladys", "F");
        employeeMap.put("Desiree", "F");
        employeeMap.put("Kallie", "F");
        employeeMap.put("Bertrand", "M");
        employeeMap.put("Aleyna", "F");
        employeeMap.put("Brigette", "F");
        employeeMap.put("Dirk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Celine", "F");
        employeeMap.put("Marissa", "F");

        //Update the "M" to Male and "F" to Female
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m") ){
                employeeMap.replace(key, "Male");
            }
        }

        System.out.println(employeeMap);
        //Display the names of all the female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();

            if(eachValue.equals("Female"))
                System.out.println(eachKey);
        }
        



    }
}
