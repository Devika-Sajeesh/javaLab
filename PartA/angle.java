import java.util.Scanner;

public class angle {
    public static double sine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    public static double cosine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();

        System.out.println("Sine: " + sine(degrees));
        System.out.println("Cosine: " + cosine(degrees));

        scanner.close(); 
    }
}