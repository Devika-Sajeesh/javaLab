import java.util.Scanner;

public class freq {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line");
        String str = input.nextLine();

        System.out.print("Enter c to find its frequency");
        char ch = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);

    
    }
}