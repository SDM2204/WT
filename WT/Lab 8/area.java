class ar{
    void area(int l,int b){
        System.out.println("Area of rectangle: "+l*b);
    }
    void area(int r){
        System.out.println("Area of circle: "+3.14*r*r);
    }
}
class area{
    public static void main(String[] args){
        ar a=new ar();
        a.area(5,6);
        a.area(4);
    }
}