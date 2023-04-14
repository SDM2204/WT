import java.util.*;
class twod{
    int area;
    void showarea(int a){
        area=a*a;
    }
    void totalcost(){
        System.out.println("Total cost of making the 2D box: "+area*40);
    }
}
class threed extends twod{
    void showarea(int a){
        area=6*a*a;
    }
    void totalcost(){
        System.out.println("Total cost of making the 3D box: "+area*60);
    }
}
class cost{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edge: ");
        int e = sc.nextInt();
        twod t1=new twod();
        threed th1=new threed();
        t1.showarea(e);
        t1.totalcost();
        th1.showarea(e);
        th1.totalcost();
    }
}