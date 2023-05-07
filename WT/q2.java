abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class q2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); // Circle object assigned to Shape reference variable
        Shape shape2 = new Square(); // Square object assigned to Shape reference variable
        shape1.draw(); // Output: Drawing a circle
        shape2.draw(); // Output: Drawing a square
    }
}