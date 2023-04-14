class Shape{
    double area;
    void showArea(){
        System.out.println("Area is : ");
    }
}
class Circle extends Shape{
    void showArea(int r){
        area=3.14*r*r;
        System.out.println("Area of the circle is: "+area);
    }
}
class Rectangle extends Shape{
    void showArea(int l, int b){
        area=l*b;
        System.out.println("Area of rectangle: "+area);
    }
}
class sh{
    public static void main(String[] args){
        Circle c1=new Circle();
        Rectangle r1=new Rectangle();
        c1.showArea(5);
        r1.showArea(3,4);
    }
}