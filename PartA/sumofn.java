import java.util.Scanner;

public class sumofn{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n number");
		int n = input.nextInt();

		int sum = 0;

		for (int i=0;i<n+1;i++){
			sum=sum+i;
		}

		System.out.print("Sum is " + sum);
	}
}