import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}