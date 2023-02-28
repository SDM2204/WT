class faculty{
    int id;
    String name;
    String gender;
    private static String college="KIIT";
    void input(int i,String na,String ge){
        id=i;
        name=na;
        gender=ge;
        college="KIIT-SCE";
    }
    void output(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("College: "+college);
    }
    public static void main(String[] args){
        faculty f1=new faculty(1123,"Swapna","M");
        f1.output();
    }
}