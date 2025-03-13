import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three boolean values (true/false): ");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        scanner.close();

        boolean result = (a && b) || (b && c) || (a && c);
        System.out.println("At least two are true: " + result);
    }
}
