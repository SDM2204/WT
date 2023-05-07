import java.util.Scanner;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankCustomer {
    private int accountno;
    private String name;
    private double balance;
    private int branchcode;

    public BankCustomer(int accountno, String name, double balance, int branchcode) {
        this.accountno = accountno;
        this.name = name;
        this.balance = balance;
        this.branchcode = branchcode;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }

    public void withdraw(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Invalid amount. Please try again.");
        }
        if (balance < amount) {
            System.out.println("Insufficient balance. Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Current balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter branch code: ");
        int branchcode = scanner.nextInt();

        BankCustomer customer = new BankCustomer(accountno, name, balance, branchcode);

        int choice = 0;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        customer.withdraw(withdrawAmount);
                    } catch (NegativeAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    customer.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}