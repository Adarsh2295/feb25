class DoubLinkedList1{
	
	Node start;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
		
			data =d;
			next=null;
		}
	}
	public static void main(String args[]){
		DoubLinkedList1 l1 = new DoubLinkedList1();
		
		l1.start= new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four = new Node(40);
		
		l1.start.next=second;
		second.next=third;
		third.next=four;
	
	}

}