import java.util.Scanner;

class Swap{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a ");
	int a = sc.nextInt();
	System.out.println("Enter b ");
	int b = sc.nextInt();
	System.out.println("before swap"+" a is "+a+"  b is "+b);
	
		int temp = a;
		a=b;
		b=temp;
		System.out.println("after swap"+" a is "+a+"  b is "+b);
		
	
	
	
	
	}


}