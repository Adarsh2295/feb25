class fibonacci{
		static int fib(int n){
			if(n<=1){
				return n;
			}else{
				return fib(n-1)+ fib(n-2);
		
			}
		}
			public static void main(String args[]){
				int x=8;
				for(int i=0;i<=x;i++){
			
				System.out.print(fib(i)+" ");
				}
				
			}
		
		
}