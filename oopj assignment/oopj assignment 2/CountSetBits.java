import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int count = 0;
        while (num > 0) {
            num &= (num - 1); // Remove the rightmost set bit
            count++;
        }

        System.out.println("Number of 1s in binary representation: " + count);
    }
}
