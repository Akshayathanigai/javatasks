package control;
import java.util.Scanner;
public class ex1control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your age:");
    int age = sc.nextInt();
    if(age>=18) {
    	System.out.println(" you can vote");}
    else {
    	System.out.println("you are not eligible to vote");
    }
    
    //if else ladder
    System.out.println("enter your mark:");
    int mark = sc.nextInt();
    if(mark>=85) {
    	System.out.println("grade A");
    }
    else if(mark>=70) {
    	System.out.println("grade B");
    }
    else if(mark>=50) {
    	System.out.println("grade C");
    }
    else {
    	System.out.println("fail");
    }
  
	}

}
