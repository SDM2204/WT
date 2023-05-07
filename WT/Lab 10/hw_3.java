// Create an user defined exception named Check Argument to check the number of arguments 
// passed through command line. If the number of arguments is less than four, throw the 
// Check Argument exception, else print the addition of squares of all the four elements.

class CheckArgumentException extends Exception {

    public CheckArgumentException(String message) {
        super(message);
    }
}

public class hw_3 {

    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("Less than four arguments passed.");
            }

            int sum = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sum += (num * num);
            }

            System.out.println("Addition of squares of all the four elements: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Invalid argument passed.");
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
