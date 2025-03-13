import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }

    static boolean isDivisibleBy3(int num) {
        // Convert negative numbers to positive
        num = Math.abs(num);

        while (num > 0) {
            int sum = 0;
            while (num > 0) {
                sum += (num & 1);  // Get the last bit
                num -= 2;          // Subtract 2 (avoiding / or %)
            }
            num = sum;  // Reduce the number
        }

        return (num == 0 || num == 3);
    }
}


