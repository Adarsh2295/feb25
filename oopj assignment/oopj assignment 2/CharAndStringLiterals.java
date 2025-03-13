public class CharAndStringLiterals {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "Hello, Java!";
        
        System.out.println("Character: " + ch + " ASCII: " + (int) ch);
        for (char c : str.toCharArray()) {
            System.out.println("Char: " + c + " ASCII: " + (int) c);
        }
    }
}