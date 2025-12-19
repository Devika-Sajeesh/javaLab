import java.util.Scanner;

public class hcf {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();

	System.out.print("Enter number 2: ");
        int n2 = input.nextInt();

	int hcf = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1%i==0 && n2%i==0) {
                hcf=i;
            }
                     }
	System.out.print("HCF is" + hcf);
    }
}