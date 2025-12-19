import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        
        System.out.println("Reversed array:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
