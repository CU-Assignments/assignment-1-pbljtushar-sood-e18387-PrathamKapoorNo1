import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful! Current Balance :- " + balance);
        } else {
            System.out.println("Error :- Deposit Amount Must be Positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error :- Insufficient Funds. Current Balance :- " + balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal Successful! Current Balance :- " + balance);
        } else {
            System.out.println("Error :- Withdrawal Amount Must be Positive.");
        }
    }
}

public class E1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Name :- ");
        String name = scanner.nextLine();

        System.out.print("Enter the Account Number :- ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the Initial Balance :- ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, balance);

        while (true) {
            System.out.println("\nChoose Operation :- 1-Deposit, 2-Withdraw, 3-Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the Deposit Amount :- ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter the Withdrawal Amount :- ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice. Try Again.");
            }
        }

        scanner.close();
    }
}