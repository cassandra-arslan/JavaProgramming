package zPractice;
import java.util.Scanner;
public class HulyaTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String str1 = scan.nextLine().toUpperCase();
        int count = 0;
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            String ch = "" + str1.charAt(i);
                if (result.contains(ch)) {
                    count++;
                    continue;
                }
                result = ch + count;
                System.out.print(result);
        }
        scan.close();
    }
        //System.out.println("\nEnter the character you want to count:");
        //String str2 = scan.nextLine();
    }


/*1)Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
2)check if a string is built out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
3)remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC

Sinem:
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scan.next();

        String noDup = "";

        for (int i = 0; i < s.length(); i++) {
            if (!noDup.contains("" + s.charAt(i))) {

                noDup += "" + s.charAt(i);
            }
        }
        String Result = "";
        int count = 0;
        for (int j = 0; j < noDup.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == noDup.charAt(j)) {


                    count++;
                }
            }
            Result += noDup.charAt(j) + "" + count;
        }
        System.out.println(Result);
    }
}
Hulya:
String str1 = "cab";
        String str2 = "abc";
        String newStr1="";
        if(str1.length()==str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                if (str1.contains(str2.charAt(i) + "")) {
                    newStr1 += str2.charAt(i) + "";
                }
            }
        }
            if(newStr1.equals(str2)){
                  System.out.println("true");
              }else {
                System.out.println("false");
                }
                Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String nonDup = "";

        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }

        String expectedResult = "";

        for( int j=0; j < nonDup.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }



 Zaier:
 public static String charsWithTheirFreq(String s) {
        StringBuilder charsWithTheirFreq = new StringBuilder();
        for (char c : noDuplicates(s).toCharArray())
            charsWithTheirFreq.append(c).append(occurrenceCount(s, c));
        return charsWithTheirFreq.toString();
    }

    public static int occurrenceCount(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray())
            if (ch == c)
                count ++;
        return count;
    }

    public static String noDuplicates(String s) {
        StringBuilder noDuplicates = new StringBuilder();
        for (char c : s.toCharArray())
            if (noDuplicates.indexOf(String.valueOf(c)) < 0)
                noDuplicates.append(c);
        return noDuplicates.toString();
    }



 */