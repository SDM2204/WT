// A subclass exception must appear before super-class exception. 
// Justify this with suitable Java programs.

public class hw_1 {

    public static void main(String[] args) {

        try {
            // Some code that may throw an exception
            throw new NullPointerException();

        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}

// public class hw_1 {

//     public static void main(String[] args) {

//         try {
//             // Some code that may throw an exception
//             throw new NullPointerException();

//         } catch (NullPointerException e) {
//             System.out.println("Caught NullPointerException: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }

