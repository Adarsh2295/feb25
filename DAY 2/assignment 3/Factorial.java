
import java.util.Scanner;
class Factorial{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 	int fact = 1;
			System.out.println("Enter number to get Factorial");
				int a = sc.nextInt();
				for(int i=a; i>=1; i--){
				fact=fact*i;
			
	}	System.out.println(fact);	


}



}