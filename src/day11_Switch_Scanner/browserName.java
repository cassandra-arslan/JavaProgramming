package day11_Switch_Scanner;
import java.util.Scanner;
public class browserName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of your browser");
        String browserName = scan.next().toLowerCase();
        String result;

        switch (browserName){
            case "chrome":
                result = "Your selected browser is Chrome";break;
            case "firefox":
                result = "Your selected browser is Firefox";break;
            case "opera":
                result = "Your selected browser is Opera";break;
            case "safari":
                result = "Your selected browser is Safari";break;
            case "edge":
                result = "Your selected browser is Edge";break;
            default:
                result = "Selected browser is not compatible";
        }
        System.out.println(result);
    }
    }
/*3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary*/