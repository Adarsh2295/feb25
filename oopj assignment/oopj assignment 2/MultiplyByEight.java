import java.util.Scanner;

public class MultiplyByEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int result = num << 3; // Left shift by 3 is equivalent to multiplying by 8
        System.out.println("Result after multiplying by 8: " + result);
    }
}
