import java.nio.charset.CoderResult;
import java.util.*;

abstract class Student{
	int roll_no;
	int reg_no;
	abstract void course();
}
f
class Kittian extends Student{
	String course;
	Scanner sc =  new Scanner(System.in);

	void init(){
		System.out.print("Enter roll no: ");
		roll_no = sc.nextInt();
		
		System.out.print("Enter reg no: ");
		reg_no = sc.nextInt();
		
		System.out.print("Enter course: ");
		course = sc.next();
	}

	void course(){
		System.out.println("Roll no: "+roll_no);
		System.out.println("Reg no: "+reg_no);
		System.out.println("Course : "+course);
	}
}

public class Que1{
	public static void main(String args[]){
		Kittian b1 = new Kittian();

		b1.init();
		b1.course();
	}
}
