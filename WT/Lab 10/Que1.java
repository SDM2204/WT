// Write a Java class which has a method called ProcessInput(). This method checks the number 
// entered by the user. If the entered number is negative then throw an user defined exception called 
// NegativeNumberException, otherwise it displays the double value of the entered number.

import java.io.*;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


public class Que1 {

    public void processInput() throws NegativeNumberException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        String input = br.readLine();
        int number = Integer.parseInt(input);

        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative.");
        } else {
            double doubleValue = (double) number;
            System.out.println("Double value of the entered number is: " + doubleValue);
        }
    }

    public static void main(String[] args) {
        
        Que1 obj = new Que1();

        try {
            obj.processInput();
            obj.processInput();
        } catch (NegativeNumberException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
