// WAP to count the number of vowels, numbers, special characters and words in a input string and
//  check whether it is a palindrome or not.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que5 {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a string:");
            String input = br.readLine();

            // Count the number of vowels, numbers, and special characters
            int vowels = 0, numbers = 0, specialChars = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else if (Character.isDigit(ch)) {
                    numbers++;
                } else if (!Character.isLetterOrDigit(ch)) {
                    specialChars++;
                }
            }

            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of numbers: " + numbers);
            System.out.println("Number of special characters: " + specialChars);

            // Count the number of words
            String[] words = input.trim().split("\\s+");
            System.out.println("Number of words: " + words.length);

            // Check if the string is a palindrome
            String reversed = new StringBuilder(input).reverse().toString();
            if (input.equalsIgnoreCase(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
