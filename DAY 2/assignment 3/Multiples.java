
import java.util.Scanner;
class Multiples{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter number");
		 int a = sc.nextInt();
			for(int i=1;i<=a*100; i++){
				int b = a*i;
			if (b>a && b<100){
				
			System.out.println(b);
			}
			
	}		


}



}