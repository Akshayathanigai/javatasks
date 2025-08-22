package hometask;
import java.util.Scanner;
public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System .out.println("enter a year:");
int year=sc.nextInt();
   if (year%4==0) 
   {
	   System.out.println("it is leap year");
   }
   else
  {
	System.out.println("it is not leap year");
}
	}

}
