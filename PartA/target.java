import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter key: ");
        int key = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == key) {
                    System.out.println("Pair found at indices: " + i + " and " + j);
                }
            }
        }
    }
}
