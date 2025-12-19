import java.util.Scanner;

public class find{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n number");
		int n = input.nextInt();

		int sum = 0;

		int[] arr = new int[n];

		for (int i=0;i<n;i++){
			arr[i] = input.nextInt();
		}

		System.out.print("Enter key");
		int key = input.nextInt();

		for (int i=0;i<n;i++){
			if(key==arr[i]){
				System.out.print("Found "+key+" at "+i);
			}
		}

	}
}