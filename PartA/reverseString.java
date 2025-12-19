import java.util.Scanner;

public class reverseString {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();

        int reversed = 0;
        while (n > 0) {
            int rem = n % 10;      
            reversed = reversed * 10 + rem; 
            n = n / 10;             
        }

        System.out.println("Reversed number: " + reversed);
    }
}