abstract class vehicle{
    abstract void engine();
}
class bus extends vehicle{
    void engine(){
        System.out.println("ENGINE METHOD IN BUS CLASS");
    }
}
class car extends vehicle{
    void engine(){
        System.out.println("ENGINE METHOD IN CAR CLASS");
    }
}
class bike extends vehicle{
    void engine(){
        System.out.println("ENGINE METHOD IN BIKE CLASS");
    }
}
class eng{
    public static void main(String[] args){
        bus b1=new bus();
        b1.engine();
        car c1=new car();
        c1.engine();
        bike bi1=new bike();
        bi1.engine();
    }
}