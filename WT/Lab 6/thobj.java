class thobj{
    //public static int count=0;
    thobj(int i){
        System.out.println("This is "+i+"th object created");
    }
    public static void main(String[] args){
        int i=0;
        thobj obj1=new thobj(++i);
        thobj obj2=new thobj(++i);
        thobj obj3=new thobj(++i);    
        thobj obj4=new thobj(++i);   
    }
}