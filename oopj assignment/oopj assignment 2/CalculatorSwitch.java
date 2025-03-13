import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
        
        switch (op) {
            case '+': System.out.println("Result: " + (num1 - (-num2))); break;
            case '-': System.out.println("Result: " + (num1 + (~num2 + 1))); break;
            case '*': System.out.println("Result: " + (num1 * num2)); break;
            case '/': 
                if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                else System.out.println("Cannot divide by zero!");
                break;
            default: System.out.println("Invalid operator!");
        }
    }
}
