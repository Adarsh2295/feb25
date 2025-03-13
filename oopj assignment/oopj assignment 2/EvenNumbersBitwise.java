public class EvenNumbersBitwise {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 0) { // Check if even using bitwise AND
                System.out.println(i);
            }
        }
    }
}
