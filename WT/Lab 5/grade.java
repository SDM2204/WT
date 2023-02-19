class grade{
    public static void main(String args[]){
        int gr=50;
        if(gr>90){
            System.out.println("O");
        }
        else if((gr>=81)&&(gr<=90)){
            System.out.println("E");
        }
        else if((gr>=71)&&(gr<=80)){
            System.out.println("A");
        }
        else if((gr>=61)&&(gr<=70)){
            System.out.println("B");
        }
        else if((gr>=51)&&(gr<=60)){
            System.out.println("C");
        }
        else if((gr>=40)&&(gr<=50)){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}