public class OddEvenBitwise {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(num + " is " + ((num & 1) == 0 ? "Even" : "Odd"));
    }
}
