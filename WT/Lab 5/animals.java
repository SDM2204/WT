class type{
    String name;
    String type;
    void in(String n,String ty){
        name=n;
        type=ty;
    }
    void out(){
        System.out.println("Name: "+name+" "+"Type: "+type);
    }
}
class animals{
    public static void main(String args[]){
        type t1=new type();
        type t2=new type();
        type t3=new type();
        t1.in("Lion", "Carnivore");
        t2.in("Dog", "Carnivore");
        t3.in("Cow", "Herbivore");
        t1.out();
        t2.out();
        t3.out();
    }
}