package day24_CustomMethods_Return;
import java.util.Scanner;
public class Breakfast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(displayInitials("mahmut", "enes", "arslan"));
        System.out.println("---------------------------------------------------");
        System.out.println(emailDomain("cassandra@zpizza.com"));
        System.out.println("---------------------------------------------------");
        String[] emails = {"josh@gmail.com", "henry@yahoo.com", "elminur@cydeo.com", "gulsen@hotmail.com", "casssandra@zpizza.com", "bob@icloud.com"};
        for (String each : emails){
            System.out.println(emailDomain(each));
        }
        System.out.println("---------------------------------------------------");
        System.out.println(displayNameOfMonth(9));
        System.out.println("---------------------------------------------------");
        System.out.println(displayNameOfDay(5));
        System.out.println("---------------------------------------------------");
        System.out.println(daysInMonth("August", 2021));
    }
    //1. Create a method that can display the initials of the person
    public static String displayInitials(String firstName, String middleName, String lastName){
        String initials = (""+firstName.charAt(0)+"."+middleName.charAt(0)+"."+lastName.charAt(0)).toUpperCase();
        return initials;
    }
    //2. Create a method that can display the domain of the email
    public static String emailDomain(String email){
        String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf("."));
        return domain;
    }
    //3. Create a method that can display the name of the month based on the given number to the method
    public static String displayNameOfMonth(int month){
        String name= "";
        if (month>0&&month<=12) {
            name = month == 1 ? "January" : month == 2 ? "February" : month == 3 ? "March" : month == 4 ? "April" : month == 5 ? "May" : month == 6 ? "June" : month == 7 ? "July"
                    : month == 8 ? "August" : month == 9 ? "September" : month == 10 ? "October" : month == 11 ? "November" : "December";
        }else{
            name = "Invalid";
        }
        return name;
    }
    //4. Create a method that can print the name of the day based on the given number to the method
    public static String displayNameOfDay(int number){
        String day = "";
        if (!(number>0&&number<=7)){
            System.exit(0);
        }
        day = number==1?"Monday":number==2?"Tuesday":number==3?"Wednesday":number==4?"Thursday":number==5?"Friday":number==6?"Saturday":"Sunday";
        return day;
    }
    //5. Create a method that can print how many days a month has
    public static int daysInMonth(String month, int year){
        int days = 0;
        if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("1")){
            days= 31;
        }else if(month.equalsIgnoreCase("February")||month.equalsIgnoreCase("2")){
            if(year%4==0) {
                days = 29;
            }else{
                days = 28;
            }
        }else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("3")){
            days = 31;
        }else if (month.equalsIgnoreCase("April")||month.equalsIgnoreCase("4")){
            days = 30;
        }else if(month.equalsIgnoreCase("May")||month.equalsIgnoreCase("5")){
            days= 31;
        }else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("6")){
            days = 30;
        }else if(month.equalsIgnoreCase("July")||month.equalsIgnoreCase("7")){
            days = 31;
        }else if(month.equalsIgnoreCase("August")||month.equalsIgnoreCase("8")){
            days = 31;
        }else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("9")){
            days = 30;
        }else if(month.equalsIgnoreCase("October")||month.equalsIgnoreCase("10")){
            days = 31;
        }else if(month.equalsIgnoreCase("November")||month.equalsIgnoreCase("11")){
            days = 30;
        }else if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("12")){
            days= 31;
        }else{
            System.exit(0);
        }
        return days;
    }
}
