import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int mask = num >> 31; // All 1s if negative, all 0s if positive
        int absValue = (num + mask) ^ mask;
        System.out.println("Absolute value: " + absValue);
    }
}
