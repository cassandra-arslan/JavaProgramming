package day31_CustomClasses_Constructor;
import java.text.DecimalFormat;
public class Offer {
    DecimalFormat df = new DecimalFormat("$###,###.00");
    public String location, companyName,jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH, isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "Location ='" + location + '\'' +
                ", Company ='" + companyName + '\'' +
                ", Position ='" + jobTitle + '\'' +
                ", Salary =" + df.format(salary) +
                ", Benefits? =" + hasBenefit +
                ", Paid Time Off? =" + hasPTO +
                ", Remote Option? =" + isWFH +
                ", Full time? =" + isFullTime +
                '}';
    }
}
/*Offer Task:
    1. Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

            Actions:
                setInfo(): sets all the instance variables
                toString(): returns the full info of the Offer Object
*/