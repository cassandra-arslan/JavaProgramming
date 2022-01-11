package day28_ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(2,25);
        numbers.add(5, 45);
        System.out.println(numbers);
        numbers.remove(3);
        int lastIndex = numbers.size()-1;

        System.out.println(numbers);
        System.out.println("-----------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        //add() adds elements to the array
        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        System.out.println(groceryList);
        System.out.println("-----------------------------");
        //size() gives total number of elements of ArrayList, returns int
        int a = groceryList.size();
        System.out.println(a);
        System.out.println("-------------------------------");
        // get(index): returns the element at the given index from the ArrayList (similar to charAt but returns element)
        System.out.println(groceryList.get(1));
        System.out.println("-----------------------------------");
        int num = numbers.get(1);
        System.out.println("num = " + num);
        System.out.println("-----------------------------------");
        ArrayList<Integer> nums2 = new ArrayList<>();
        int j = 0;
        for(int i= 0; i< numbers.size(); i++){
            j= numbers.get(i);
            nums2.add(j);
        }
        System.out.print(nums2);
        //set(index, newElement): replaces the element of the ArrayList at given index with the new element
        groceryList.set(2, "Eggs");
        System.out.println();
        System.out.println(groceryList);

        System.out.println("--------------------------------------------");

        //remove(int index): removes the element at the given index from the ArrayList
        groceryList.remove(3);
        System.out.println(groceryList);
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");
        System.out.println(list);
        System.out.println("------------------------------");

        //remove(Object): removes the given object from the ArrayList (first matching), and returns boolean
        groceryList.remove("Apple");
        System.out.println(groceryList);

        System.out.println("-----------------------------");


    }
}
