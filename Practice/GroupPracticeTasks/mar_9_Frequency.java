package GroupPracticeTasks;
import java.util.Scanner;
public class mar_9_Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(frequencyOfChars(str));

    }
    public static String frequencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }
        String finalResult = "";
        for (int j = 0; j < result.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == result.charAt(j)) {
                    count++;
                }
            }
            finalResult += result.charAt(j) + "" + count;
        }
        return finalResult;
    }
}
