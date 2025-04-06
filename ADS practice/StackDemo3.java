
class Node{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class StackDemo3{
	Node head;
	
	StackDemo3()
	{
		this.head = null;
	}
	
	boolean IsEmpty(){
		return head == null;
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
	void pop(){
		
		if(IsEmpty()){
			System.out.println("Stack Underflow!!!");
			return;
		}
		System.out.print((char)head.data);
		Node temp = head;
		head = head.next;
		temp.next = null;
		temp = null;
		
		
		
	}
	
	int peek(){
		if(!IsEmpty())
			return head.data;
		else{
			System.out.println("Stack Underflow!!!");
			return -1;
		}
	}
	   public static void reverse(StringBuffer str) {
        int n = str.length();
        StackDemo3 s1 = new StackDemo3(); // Create stack with string length
        
        // Push all characters to stack
        for (int i = 0; i < n; i++) {
            s1.push(str.charAt(i));
        }

        // Pop characters back into string buffer
        for (int i = 0; i < n; i++) {
          int ch = s1.peek();
          
			s1.pop();
			//System.out.println(ch);
            //str.setCharAt(i, (char)ch);
        }
    }
	public static void main(String[] args) {
		
	StackDemo3 s2 = new StackDemo3();
	
	
	
	 StringBuffer s = new StringBuffer("CDAC MUMBAI");
        s2.reverse(s);
        //System.out.println("Reversed string is: " + s);
		
	}		
}