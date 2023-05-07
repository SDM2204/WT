// Write a program to perform following operations on user entered strings –
// i) Change the case of the string
// ii) Reverse the string
// iii) Compare two strings
// iv) Insert one string into another string

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que4 {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a string:");
            String str1 = br.readLine();

            // Change the case of the string
            String str2 = str1.toUpperCase();
            String str3 = str1.toLowerCase();

            System.out.println("Original string: " + str1);
            System.out.println("Uppercase string: " + str2);
            System.out.println("Lowercase string: " + str3);

            // Reverse the string
            StringBuilder sb = new StringBuilder(str1);
            sb.reverse();
            String str4 = sb.toString();
            System.out.println("Reversed string: " + str4);

            // Compare two strings
            System.out.print("Enter another string:");
            String str5 = br.readLine();
            if (str1.equals(str5)) {
                System.out.println("Strings are equal.");
            } else {
                System.out.println("Strings are not equal.");
            }

            // Insert one string into another string
            System.out.print("Enter a string to insert:");
            String str6 = br.readLine();
            System.out.print("Enter a position to insert:");
            int pos = Integer.parseInt(br.readLine());

            String str7 = str1.substring(0, pos) + str6 + str1.substring(pos);
            System.out.println("String after insertion: " + str7);

        } 
        catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

