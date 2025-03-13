class Q3 {
    public static void main(String[] args)
    {	
		int sum =0;
        int x = 123;
		System.out.println("x = "+x );
		while(x !=0){
			int last = x%10;
			sum+= last;
			x=x/10;
			
			
		}System.out.println(sum);
		
		
       
						   
    }
}