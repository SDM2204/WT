class base{
    base(){
        System.out.println("This is base class");
    }
}
class derived extends base{
    derived(){
        super();
    }
}
class su{
    public static void main(String[] args){
        derived d1=new derived();
    }
}