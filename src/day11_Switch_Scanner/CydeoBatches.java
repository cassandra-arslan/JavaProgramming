package day11_Switch_Scanner;
import java.util.Scanner;
public class CydeoBatches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your batch type");
        String batchType= scan.nextLine().toLowerCase();
        String result= "";
        boolean usAM= batchType.equals("us am")||batchType.equals("us morning")||batchType.equals("us a/m")||batchType.equals("am");
        boolean usPM= batchType.equals("us pm")||batchType.equals("us evening")||batchType.equals("us p/m")||batchType.equals("pm");
        boolean eu= batchType.equals("eu")||batchType.equals("europe");

        if (usAM||usPM||eu){
            if (usAM){
                batchType = "us morning";
            }else if(usPM){
                batchType= "us evening";
            }else {
                batchType= "eu";
            }
             switch (batchType){
                case "us morning":
                    result= "Class times are 10AM-5PM EST every M, T, Th, and F";break;
                case "us evening":
                    result= "Class times are 7PM-10PM EST every M, T, W, Th, Sa, and Su";break;
                default:
                    result= "Class times are 10AM-5PM EST every M, T, W, Th, and F";break;
            }
        }else {
            System.out.println("Not a valid course selection");
        }
        System.out.println(result);
        scan.close();
    }
}
/*4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/