interface box{
    void vol();
    void surf_area();
}
class rectbox implements box{
    int l=5;
    int b=6;
    int h=10;
    public void vol(){
        System.out.println("volume of rect box: "+l*b*h);
    }
    public void surf_area(){
        System.out.println("surface area of rect box: "+2*(l*b+b*h+h*l));
    }
}
class sqbox implements box{
    int s=5;
    public void vol(){
        System.out.println("volume of square box: "+s*s*s);
    }
    public void surf_area(){
        System.out.println("surface area of square box: "+6*s*s);
    }
}
class q1{
    public static void main(String arg[]){
        box b1 = new rectbox();
        box b2 = new sqbox();
        b1.vol();
        b1.surf_area();
        b2.vol();
        b2.surf_area();
    }
}