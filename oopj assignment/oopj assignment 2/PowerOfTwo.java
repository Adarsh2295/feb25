import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(num + (isPowerOfTwo ? " is a power of 2." : " is not a power of 2."));
    }
}
