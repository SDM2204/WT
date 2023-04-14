interface Motor{
    int capacity = 8;
    void run();
    void consume();
}

class WashingMachine implements Motor{
    public void run(){
        System.out.println("Washing Machine is running....");
    }

    public void consume(){
        System.out.println("Washing machine is consuming electricty...");
    }
}

public class Que3 {
    public static void main(String arg[]){
        WashingMachine a = new WashingMachine();
        System.out.println("Value of Inerface Variable = "+a.capacity);

        a.run();
        a.consume();
    }
}
