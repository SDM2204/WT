// Write one program which will illustrate all the following concepts:-
// i) using multiple catch blocks
// ii) parent class exception can handle child class exception
// iii) A subclass exception must appear before super-class exception

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que3 {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a number:");
            String input = br.readLine();

            // Using multiple catch blocks
            int num1 = Integer.parseInt(input);
            int result = 100 / num1;

            // Parent class exception can handle child class exception
            String s = null;
            System.out.println(s.length());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // A subclass exception must appear before super-class exception
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred: " + e.getMessage());
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception occurred: " + e.getMessage());
        }
    }
}
