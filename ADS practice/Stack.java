class Node{
	
	int max =7;
	int top;
	int a[]=new int[max];
	Node(){
	
		top=-1;
	}
	
	boolean isEmpty(){
		return top<0;
	}
	
	boolean isFull(){
		return top>= max-1;
	}
	
	boolean push(int d){
		if(isFull()){
			System.out.println("Stack is already full");
			return false;
		}
		else{
			a[++top]=d;
			System.out.println(d+" is pushed");
			return true;
		}
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
	}
	
	int peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return a[top];
		}
	
	}
}

class Stack{
		public static void main(String args[]){
			
			Node n = new Node();
			
			n.push(11);
			n.push(12);
			n.push(13);
			n.push(14);
			n.push(14);
			n.push(14);
			n.push(14);
			n.push(14);
			System.out.println(n.peek());
			n.pop();
			System.out.println(n.peek());
			
		}
}