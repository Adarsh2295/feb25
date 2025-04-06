
import java.util.*;
class table{
		static void fun(int n, int i){
			if(i==10){
				 System.out.println(n+"*"+i+" = " +(n*i));
			}else{
				System.out.println(n+"*"+i+" = " + (n*i));
					fun(n,i+1);
			}
		}
			public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number for which you want table");
				int a = sc.nextInt();
			
				fun(a,1);
				
				
			}
		
		
}