import java.util.Scanner;

public class AbsoluteValueTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int absValue = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + absValue);
    }
}
