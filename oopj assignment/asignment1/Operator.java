import java.util.Scanner;


class Operator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("value of a " + a);
	System.out.println("vaule of b " + b);
	int add = a+b;
	int sub = a-b;
	int div = a/b;
	int mul = a*b;
	int mod = a%b;
	
	System.out.println("a+b = " + (a+b));
	System.out.println("a-b = " + sub);
	System.out.println("a*b =" + mul);
	System.out.println("a/b =" + div);
	System.out.println("a%b =" + mod);
	
	
	
	}


}