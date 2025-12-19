import java.util.Scanner;

public class rightTriangle {
    public static void main(String[] args) {
        int height = 3;

        for (int i = 1; i <= height; i++) {          
            for (int j = 0; j < ((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();         }
    }
}