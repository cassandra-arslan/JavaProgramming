package day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        // student name and score:
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);
        System.out.println(students);
        System.out.println(students.size());

        //display the score of alex
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));

        //replace Ali score to 90
        students.replace("Ali", 90);
        System.out.println(students);

        //remove a pair
        students.remove("Ozan");

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsValue("Alex");

        boolean r3 = students.containsValue(95);
        System.out.println(r3);

        System.out.println("-------------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1==map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();



    }
}
