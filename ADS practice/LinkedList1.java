class LinkedList1{
	
	 Node start;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
		
			data =d;
			next=null;
		}
		
	}
	void display(){
			
			Node n = start;
			while(n!=null){
				
				System.out.print(n.data+"---");
				n=n.next;
			}
	}
	void insert(int n){
		
		Node new_node = new Node(n);
		new_node.next=start;
		start = new_node;
	}
	


	public static void main(String args[]){
		LinkedList1 l1 = new LinkedList1();
		
		
		l1.insert(10);
		l1.insert(30);
		l1.insert(40);
		l1.insert(60);
		l1.insert(100);
		l1.display();
	
	}

}