import java.util.Scanner;

public class sumofarray{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n number");
		int n = input.nextInt();

		int sum = 0;

		int[] arr = new int[n];


		for (int i=0;i<n;i++){
			arr[i] = input.nextInt();
		}

		for (int i=0;i<n;i++){
			sum=sum+arr[i];
		}

		System.out.print("Sum is " + sum);
	}
}