import java.util.Scanner;

public class stars {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

	\\input numbers
        System.out.print("Enter n number: ");
        int n = input.nextInt();

                for (int i = n; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                		System.out.print("*");
            }
            System.out.println();         
	    }
    }
}