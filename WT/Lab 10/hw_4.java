import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance = 500;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (amount > balance - 500) {
            throw new LessBalanceException("Withdraw amount is not valid.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        }
    }
}

public class hw_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Account account = new Account();

        System.out.print("Enter the deposit amount: ");
        int depositAmount = Integer.parseInt(reader.readLine());
        account.deposit(depositAmount);

        System.out.print("Enter the withdraw amount: ");
        int withdrawAmount = Integer.parseInt(reader.readLine());
        try {
            account.withdraw(withdrawAmount);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
