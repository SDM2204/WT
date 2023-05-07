import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours: " + hours);
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes: " + minutes);
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds: " + seconds);
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}

public class Que2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter hours: ");
            String hrs = br.readLine();
            int hours = Integer.parseInt(hrs);

            System.out.print("Enter minutes: ");
            String mins = br.readLine();
            int minutes = Integer.parseInt(mins);

            System.out.print("Enter seconds: ");
            String sec = br.readLine();
            int seconds = Integer.parseInt(sec);

            Time time = new Time(hours, minutes, seconds);
            System.out.println("Time is: " + time.hours + " hours, " + time.minutes + " minutes, " + time.seconds + " seconds.");
        } 
        catch (HrsException | MinException | SecException | NumberFormatException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

