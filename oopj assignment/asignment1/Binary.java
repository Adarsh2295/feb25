class Binary {
    public static void main(String[] args)
    {
        int x = 3, y = 5;
		System.out.println("x = "+x );
		System.out.println("y = "+y);
        
 
        
        System.out.println("x become here = " + (x = x ^ y));
       
        System.out.println("y become here = " + (y = x ^ y));
        
	
        System.out.println("x become here again = "+ (x = x ^ y));
        System.out.println("The value of x is " + x
                           + " and the value of y is " + y);
						   
    }
}