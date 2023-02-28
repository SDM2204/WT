class thobjstatic{
    private static int count=0;
    thobjstatic(){
        count++;
        System.out.println("This is "+count+"th object created");
    }
    public static void main(String[] args){
        thobjstatic obj1=new thobjstatic();
        thobjstatic obj2=new thobjstatic();
        thobjstatic obj3=new thobjstatic();    
        thobjstatic obj4=new thobjstatic();   
    }
}