import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = input.nextFloat();

        System.out.print("Enter second number: ");
        float b = input.nextFloat();

        System.out.print("Enter third number: ");
        float c = input.nextFloat();

        float average = (a + b + c) / 3;

        System.out.println("Average = " + average);

        input.close();
    }
}
