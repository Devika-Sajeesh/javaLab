import java.util.Scanner;

public class largestof3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number 1");
		int a = input.nextInt();

		System.out.print("Enter number 2");
		int b = input.nextInt();

		System.out.print("Enter number 3");
		int c = input.nextInt();

		int largest = a;

		if(b>a & b>c ){
			largest = b;
		}
		else if(c>a & c>b ){
			largest = c;
		}

		System.out.print("Largest is " + largest);
	}
}