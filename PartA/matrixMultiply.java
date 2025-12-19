import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows of matrix 1: ");
        int r1 = input.nextInt();
        System.out.print("Enter columns of matrix 1: ");
        int c1 = input.nextInt();

        System.out.print("Enter rows of matrix 2: ");
        int r2 = input.nextInt();
        System.out.print("Enter columns of matrix 2: ");
        int c2 = input.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

       
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2]; 
                                                                                                                                                                                                                                                                                                                                                                                                                                                
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
