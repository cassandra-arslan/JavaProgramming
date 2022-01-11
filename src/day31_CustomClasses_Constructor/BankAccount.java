package day31_CustomClasses_Constructor;
import java.text.DecimalFormat;
public class BankAccount {
    DecimalFormat df = new DecimalFormat("$###,##0.00");
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo (String accountHolder, long AccountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + df.format(balance) +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+df.format(balance));
    }

    public void deposit(double amount){
        if (amount<0){
            System.err.println("Invalid deposit amount");
            return;
        }
        balance+= amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.err.println("Insufficient funds");
            return;
        }
        if(amount<0){
            System.err.println("Invalid withdrawal amount");
            return;
        }
        balance -= amount;
    }
}
/*BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount*/