import java.util.*;
interface Methods{
    double earnings(double b);
    double deductions(double b);
    double bonus(double b);
}

abstract class Manager implements Methods{
    double basic_salary;
    String name;
    int id;

    //earnings basic + DA (80% of basic) + HRA (15% of basic)
    public double earnings(double b){
        double earning = b + b*0.8 + b*0.15;
        return earning;
    }

    //deduction PF 12% of basic
    public double deductions(double b){
        double deduct = b*0.12;
        return deduct;
    }
}

class Substaff extends Manager{

    //bonus 50% of basic
    public double bonus(double b){
        double tmp = b*0.5;
        return tmp;
    }

    Scanner sc = new Scanner(System.in);

    void setData(){
        System.out.print("Enter staff name: ");
        name = sc.nextLine();
        System.out.print("Enter Staff id: ");
        id = sc.nextInt();
        System.out.print("Enter the salary: ");
        basic_salary = sc.nextInt();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Staff id: "+id);
        System.out.println("Basic Salary: "+basic_salary);
        System.out.println("Earings: "+earnings(basic_salary));
        System.out.println("Deductions: "+deductions(basic_salary));
        System.out.println("Bounus: "+bonus(basic_salary));
    }
}


public class Que2 {
    public static void main(String args[]){
        Substaff s = new Substaff();

        s.setData();
        System.out.println();
        s.display();
    }
}
