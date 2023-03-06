class base{  
    base(){
        System.out.println("This is Base Class");
    }
} 
    class derive extends base{  
    derive(){
        System.out.println("This is Derived class");
    }
}  
    class singleinh{  
    public static void main(String[] args){  
        derive d=new derive(); 
    }
} 