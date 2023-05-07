import java.util.Scanner;

public class hw_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Divide 100 by the number
            int result = 100 / num;

            // Display the result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            // Close the scanner
            scanner.close();
            System.out.println("Scanner closed");
        }
    }
}
