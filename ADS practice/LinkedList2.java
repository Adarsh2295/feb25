class LinkedList2{
	
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
	
	
	


	public static void main(String args[]){
		LinkedList2 l1 = new LinkedList2();
		
		l1.start= new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		
		l1.start.next=second;
		second.next=third;
		third.next=four;
		
		l1.display();
	
	}

}	
	
	
	
	
	