package day12_Scanner;
import java.util.Scanner;
public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a speed limit: 35, 55, 75 - ");
        int speedLimit =scan.nextInt();
        System.out.println("Speed limit is "+speedLimit);
        System.out.println("Please enter your current speed: ");
        int currentSpeed = scan.nextInt();
        int mphUnder = (speedLimit-currentSpeed);
        int mphOver = (currentSpeed-speedLimit);
        String result = "";

        if (speedLimit==35||speedLimit==55||speedLimit==75) {
            if (currentSpeed > 0) {
                if (currentSpeed > speedLimit) {
                    result = "You're driving " + mphOver + " over the limit. Slow down!";
                    if (mphOver > 25) {
                        result = "You're driving " + mphOver + " over the limit. Slow down! That's reckless endangerment!";
                    }
                } else if (speedLimit > currentSpeed) {
                    result = "You're driving " + mphUnder + " under the limit.";
                    if (mphUnder >= 10) {
                        result = "You're driving " + mphUnder + " under the limit. Go faster! The rest of us don't have all day";
                    }
                } else {
                    result = "You're driving at the speed limit";
                }
            } else {
                System.out.println("Vehicle is not in motion");
            }
        }else {
            result = "Not a valid speed limit";
        }
        System.out.println(result);
        scan.close();
    }
}
/*2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!*/