public class DoubleToInt {
    public static void main(String[] args) {
        double dnum = 99.99;
        int inum = (int) dnum; // Typecasting (Data Loss)

        System.out.println("Double Value: " + dnum);
        System.out.println("Converted Integer Value: " + inum);
    }
}
