import java.io.*;
class PasswordIncorrect extends Exception{
    public PasswordIncorrect(String str){
        super(str);
    }
}
class q3{
    public static void main(String arg[]) throws IOException, PasswordIncorrect{
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        System.out.println("enter password");
        String pass = br.readLine();
        try{
            for(int j=0; j<pass.length(); j++){
                char ch= pass.charAt(j);
                if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                    System.out.println("password correct");
                }
                else{
                    throw new PasswordIncorrect("");
                }
            }
        }
        catch(PasswordIncorrect e){
            System.out.println("password incorrect");
            return;
        }
    }
}