import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}

class Stack {
    private int[] data;
    private int top;
    private int size;

    public Stack(int size) {
        data = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int element) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException("Stack is full");
        }
        top++;
        data[top] = element;
        System.out.println("Element " + element + " pushed to the stack");
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        int element = data[top];
        top--;
        System.out.println("Element " + element + " popped from the stack");
        return element;
    }
}

public class hw_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of stack: ");
        int size = Integer.parseInt(reader.readLine());
        Stack stack = new Stack(size);

            try {
                stack.push(1);
                stack.push(2);
                stack.push(3);
            } 
            catch (StackFullException e) {
                System.out.println(e.getMessage());
            }

        
            try {
                stack.pop();
                stack.pop();
                stack.pop();
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
        
    }
}
