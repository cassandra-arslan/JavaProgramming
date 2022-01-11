package day12_Scanner;
import java.util.Scanner;
import java.text.DecimalFormat;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        double sum = 0;
        int totalShares = 0;
        while (true) {
            System.out.println("Please enter company name:");
            String companyName = scan.nextLine();
            System.out.println("Please enter number of current stock market shares for above listed company:");
            int shares = scan.nextInt();
            while (shares < 0) {
                System.err.println("Invalid entry, try again");
                System.err.println("Please enter number of current stock market shares for above listed company:");
                shares = scan.nextInt();
            }
            if (shares == 0) {
                System.out.println("No current stock market holdings");
                break;
            }
            System.out.println("Please enter current value per share:");
            double pricePerShare = scan.nextDouble();
            double totalPrice = shares * pricePerShare;
            System.out.println("Total value of " + companyName + " shares: $" + df.format(totalPrice));
            sum += totalPrice;
            totalShares += shares;
            System.out.println("Do you currently hold stock in any other companies?: (Y or N)");
            char answer = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
            while (!(answer == 'y' || answer == 'n')) {
                System.err.println("Invalid entry, try again!");
                System.err.println("Do you currently hold stock in any other companies?: (Y or N)");
                answer = scan.next().toLowerCase().charAt(0);
            }
                if (answer == 'n') {
                    System.out.print("Total stock market holding is $" + df.format(sum) + " which is comprised of a combined " + (totalShares) + " shares.");
                    break;
                }else {}
        }
        scan.close();
    }
    }

