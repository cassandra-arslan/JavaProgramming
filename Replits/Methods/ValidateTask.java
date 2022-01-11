package Methods;
import java.util.*;
public class ValidateTask {
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {
        // your code here
        if (notEmpty) {
            if (taskId == currentId + 1) {
                return true;
            } else {
                return false;
            }
        }
        return notEmpty;
    }
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
        }
    }
