package StudyHardGroupTasks;

import java.util.Scanner;

public class FreqOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any string of text");
        String str = scan.nextLine();
        System.out.println(freqOfChars(str));
    }
    public static String freqOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);
            for(int j = 0; j<str.length(); j++){
                char each = str.charAt(j);
                if(each == ch){
                count++;
                }
            }
            if(result.contains(ch+"")){
                continue;
            }
            result+= ch;
            result +=count;
        }
        return result;
    }
}
