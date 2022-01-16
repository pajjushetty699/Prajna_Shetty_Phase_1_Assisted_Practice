package assisted.practice;
import java.util.Scanner;

public class ArithmeticCaluculator {

	public static void main(String[] args) {
		int a; int b; 
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the Second number");
		Scanner s=new Scanner(System.in);
		b=sc.nextInt();
		System.out.println("Addition of the two number "+(a+b));
		System.out.println("Subtraction of the two number "+(a-b));
		System.out.println("Division of the two number "+(a/b));
		System.out.println("Multiplication of the two number "+(a*b));
		System.out.println("Modulo of the two number "+(a%b));


		

	}

}
