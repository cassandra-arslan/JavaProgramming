package practice;
import java.util.Scanner;
public class HulyaTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }
}
/*4)verify if a password is valid or not.

requirements:

 1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit
Sinem:
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Password");
        String password = scan.next();
        int countLower = 0;
        int countDigit = 0;
        int countUpper = 0;
        int countSpecial = 0;


        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                countLower++;
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                countUpper++;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {

                countDigit++;
            } else {
                countSpecial++;
            }
        }
        if (password.length() >= 6 && !password.contains(" ") && countDigit >= 1 && countLower >= 1 && countUpper >= 1 && countSpecial >= 1) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is not valid");
        }

    }
}


Hulya:
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

zaier:
public static boolean passwordReq(String password) {
        int lower = 0, upper = 0, digit = 0, special = 0;
        for (char c : password.toCharArray()) {
            if ('a' <= c && c <= 'z')
                lower++;
            else if ('A' <= c && c <= 'Z')
                upper++;
            else if ('0' <= c && c <= '9')
                digit++;
            else
                special++;
        }
        return (password.length() >= 6 &&
                lower >= 1 &&
                upper >= 1 &&
                digit >= 1 &&
                special >= 1);
}

*/