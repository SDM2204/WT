class x{
    x(){
        System.out.println("This is Base Class");
    }
}
class y extends x{
    y(){
        System.out.println("This is Derived Class");
    }
}
class z extends y{
    z(){
        System.out.println("This is dervied from the derived class of base Class");
    }
}
class multiinh{
    public static void main(String[] args){
        System.out.println("This is an example of multilevel inheritance : ");
        System.out.println();
        z z1=new z();
    }
}