public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        a += b; // a = a + b
        System.out.println("After += : " + a);

        a -= b; // a = a - b
        System.out.println("After -= : " + a);

        a *= b; // a = a * b
        System.out.println("After *= : " + a);

        a /= b; // a = a / b
        System.out.println("After /= : " + a);

        a %= b; // a = a % b
        System.out.println("After %= : " + a);
    }
}