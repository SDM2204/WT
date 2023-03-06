import java.util.*;
class sw{
    void swap (int i, int j){
        System.out.println("Before swapping: "+i+" "+j);
        int temp;
        temp=i;
        i=j;
        j=temp;
        System.out.println("After Swapping: "+i+" "+j);
    }
    void swap (String i, String j){
        System.out.println("Before swapping: "+i+" "+j);
        String temp;
        temp=i;
        i=j;
        j=temp;
        System.out.println("After Swapping: "+i+" "+j);
    }
    void swap(Float i, Float j){
        System.out.println("Before swapping: "+i+" "+j);
        Float temp;
        temp=i;
        i=j;
        j=temp;
        System.out.println("After Swapping: "+i+" "+j);
    }
    void swap(Double i, Double j){
        System.out.println("Before swapping: "+i+" "+j);
        Double temp;
        temp=i;
        i=j;
        j=temp; 
        System.out.println("After Swapping: "+i+" "+j);
    }
}
class swap{
    public static void main(String[] args){
        sw s1=new sw();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for integer swap, 2 for float swap, 3 for character swap, 4 for double swap ");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Enter the numbers you want to swap");
            int a=
        }
    }
}