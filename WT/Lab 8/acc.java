import java.util.*;
class Account{
    int acc_no,balance;
    void disp(){
        System.out.println("Account Number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}
class Person extends Account{
    String name;
    int aadhar_no;
    void disp(){
        System.out.println("Name: "+name);
        System.out.println("Aadhar Number: "+aadhar_no);
    }
}
class acc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n;
        System.out.println("Enter name: ");
        n=sc.nextLine();
        int ad,bal,accn;
        System.out.println("Enter account no: ");
        ad
    }
}