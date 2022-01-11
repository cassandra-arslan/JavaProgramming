package day27_WrapperClass;
import java.util.Scanner;
public class Lunch_PasswordValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        boolean r1 = password.length()>=8&&!password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        char[] chars = password.toCharArray();
        for(char each: chars){
            if(Character.isUpperCase(each)) {
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3= true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{
                r4=true;
            }
            if(r2&&r3&&r4&&r5){
                break;
            }
        }
        boolean isStrongPassword = r1&&r2&&r3&&r4&&r5;
        System.out.println("isStrongPassword = " + isStrongPassword);
    }
}
/*PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

Ahmet's solution:
public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1. Password MUST be at least have 8 characters long, and should not contain space\n" +
                "                2. PassWord should at least contain one upper case letter\n" +
                "                3. PassWord should at least contain one lower case letter\n" +
                "                4. Password should at least contain one special characters\n" +
                "                5. Password should at least contain a digit");
        System.out.println("Create your password");
        String password = scan.next();

        int digit = 0, special = 0, upper = 0, lower = 0;
        while (true) {

            char[] passChar = password.toCharArray();
            for (char each : passChar) {
                if (Character.isLowerCase(each)) {
                    lower++;
                }
                if (Character.isUpperCase(each)) {
                    upper++;
                }
                if (Character.isDigit(each)) {
                    digit++;
                }
                if (!Character.isLetterOrDigit(each)) {
                    special++;
                }

            }
            if (!(lower >= 1 && upper >= 1 && digit >= 1 && special >= 1 && password.length() >=8 && !password.contains(" "))) {
                System.err.println("invalid Enter\n" + password);
                System.out.println("Please retry");
                password = scan.next();
                continue;
            }
            System.out.println("Your password created.\n***Thank you***");
            break;
        }
    }
}
*/