import java.util.*;
public class Que4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        try{
            int arr[] = new int[3];
            System.out.println("Initialise the array: ");

            for(int i=0; i<10; i++){
                System.out.println("Index is: "+i);
                System.out.print("Enter data: ");
                arr[i] = sc.nextInt();
            }
        }

        catch(ArrayIndexOutOfBoundsException d){
            System.out.println("Array index out of bound Exception.");
        }

        try{
            System.out.println("Enter two integer to calculate division: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a/b;
        }

        catch(ArithmeticException d){
            System.out.println("Division by Zero(0) exception.");
        }
    }
    
}
