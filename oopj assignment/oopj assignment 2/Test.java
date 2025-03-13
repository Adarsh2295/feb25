interface A {
	default void msg1(){
	System.out.println("A");
	}
}	

interface B{
		default void msg2(){
		System.out.println("B");
		}
}

class C implements A, B{
	
		void msg(){
		System.out.println("c");
		}
	
}

class Test {
	public static void main(String args[]){
	
	C c1 = new C();
	c1.msg();
	c1.msg1();
	c1.msg2();
	
	
	}
}