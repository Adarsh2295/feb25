
import java.util.*;
class sumseries{
		static double sum(int n){
			double sum=0;
			if(n==1){
				return 1.0;
			}
			if(n%2==0){		
				return sum(n-1)-(1.0/n);
			}
			return sum(n-1)+(1.0/n);
				
		}
			public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.println("length of the series will be..?");
				int a = sc.nextInt();
				System.out.println(sum(a));
				
				
				
			}
		
		
}