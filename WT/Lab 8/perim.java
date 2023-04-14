class perim{
    perim(int r){
        System.out.println("Area of circle: "+3.14*4*r);
    }
    perim(int l,int b){
        System.out.println("Area of rectangle: "+2*(l+b));
    }
    public static void main(String[] args){
        perim p1=new perim(5);
        perim p2=new perim(4,7);
    }
}
