import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		double num1=sc.nextDouble();
		System.out.println("ENTER ANOTHER NUMBER");
		double num2=sc.nextDouble();
		double sum=num1+num2;
		System.out.println("THE SUM OF " +num1+ " AND " +num2+ " is: "+sum);

	}

}
