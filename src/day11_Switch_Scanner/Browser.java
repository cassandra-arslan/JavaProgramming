package day11_Switch_Scanner;
import java.util.Scanner;
public class Browser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your browser name: ");
        String browserName=scan.next().toLowerCase();
        String result;
        boolean validBrowser= browserName.equals("chrome")||browserName.equals("firefox")||browserName.equals("opera")||browserName.equals("safari")||
                browserName.equals("edge");

        if (validBrowser){
            if (browserName.equals("chrome")) {
                result = "Chrome";
            } else if (browserName.equals("firefox")){
                result = "Firefox";
            }else if (browserName.equals("opera")){
                result = "Opera";
            }else if (browserName.equals("safari")){
                result = "Safari";
            }else{
                result = "Edge";
            }
            System.out.println(result+" is the selected browser.");
        }else{
            System.out.println("Selected browser is not compatible with system.");
        }
    }
}
/*1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if*/

