class emp{
    int empid;
    String name;
    int salary;
    void inp(int id,String na,int sal){
        empid=id;
        name=na;
        salary=sal;
    }
    void disp(){
        System.out.println("Empid: "+empid+"  Name: "+name+"  Salary: "+salary);
    }
}
class employee{
    public static void main(String args[]){
        emp e1=new emp();
        emp e2=new emp();
        emp e3=new emp();
        e1.inp(2186,"Satyaki",90000);
        e2.inp(1979,"Arnab",100000);
        e3.inp(2204,"Swapna",70000);
        e1.disp();
        e2.disp();
        e3.disp();
    }
}
