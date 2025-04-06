 class StringReversal {
     static char reverseString(String s,int n) {
        
        if (n == 0) {
            return s.charAt(0);
        }
        System.out.print(s.charAt(n-1));
        return reverseString(s,--n);
    }

    public static void main(String[] args) {
        String s = "hello";
		int n=s.length();
        
        reverseString(s,n);
    }
}