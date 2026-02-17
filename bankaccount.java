package account;

public class bankaccount 
 {
    private String ownername;
    private String accountnumber;
    private double balance;

    public  bankaccount(String ownername, String accountnumber, double balance) 
    {
        this.ownername = ownername;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("amount deposited sucessfully!");
        } else {
            System.out.println("amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw sucessful!");
        } else if (amount > balance) {
            System.out.println("insufficent funds.");
        } else {
            System.out.println("amount must be positive. ");
        }
    }

    public double getbalance() {
        return balance;
    }

    public void display() {
        System.out.println("account holder: " + ownername);
        System.out.println("account number: " + accountnumber);
        System.out.println("balance: " + balance);
    }
public static void main(String[] args)
{
	bankaccount acc = new bankaccount("john","12345" , 12000);
	acc .deposit(500);
	acc .withdraw(2000);
	acc .display();
}
 }
