package hit.day5;

import java.util.Scanner;

public class ArithmeticDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter i value..:");
		int i=scan.nextInt();
		
		System.out.println("Please enter j value...:");
		int j=scan.nextInt();
		
		int add=i+j;
		System.out.println("Addtion ....:"+add);
		
		int sub=i-j;
		System.out.println("Subtraction..:"+sub);
		
		int mul=i*j;
		System.out.println("Multiplication...:"+mul);
		
		int div=i/j;
		System.out.println("division...:"+div);//quotient
		
		int rem=i%j;
		System.out.println("Reminder...:"+rem);//reminder
	}
}
