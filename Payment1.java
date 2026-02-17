import java.util.Scanner;

class Payment {
    protected double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        System.out.println("Processing Payment...");
    }
}

class OnlinePayment extends Payment {

    @Override
    public void makePayment() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to pay: ");
        double amt = sc.nextDouble();
        setAmount(amt);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.println("4. Net Banking");
        System.out.println("5. Cash");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Payment of ₹" + amount + " done using Credit Card.");
                break;
            case 2:
                System.out.println("Payment of ₹" + amount + " done using Debit Card.");
                break;
            case 3:
                System.out.println("Payment of ₹" + amount + " done using UPI.");
                break;
            case 4:
                System.out.println("Payment of ₹" + amount + " done using Net Banking.");
                break;
            case 5:
                System.out.println("Payment of ₹" + amount + " done using cash.");
                break;

            default:
                System.out.println("Invalid Payment Option.");
        }
        sc.close();
    }
}


public class Payment1 {
    public static void main(String[] args) {
        OnlinePayment obj = new OnlinePayment();
        obj.makePayment();

    }
}
