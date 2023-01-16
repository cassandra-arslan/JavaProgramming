package StudyHardGroupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringSentence {
    public static void main(String[] args) {
        String str = "I love Java";
        System.out.print("\""+str+"\""+" reversed is: "+reverseSentenceUsingArrayList(str));
        System.out.println();

        String str2 = "Java is fun";
        System.out.println("\""+str2+"\""+" reversed is: "+reverseSentenceUsingArray(str2));
    }
    public static String reverseSentenceUsingArrayList(String str){
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        String result = "";
            for(int i=list.size()-1; i>=0; i--){
                result += list.get(i)+" ";
        }
        return result;
    }
    public static String reverseSentenceUsingArray(String sentence){
        String[] words = sentence.split(" ");
        String eachWord = "";
        for (int i = words.length - 1; i >= 0; i--) {
            eachWord += words[i]+" ";
        }
        return eachWord;
    }
}
