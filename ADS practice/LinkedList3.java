class LinkedList3{
	
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
	
	void insertAfter(Node pre,int n){
		Node new_node=new Node(n);
		new_node.next= pre.next;
		pre.next=new_node;
		
		
	}


	public static void main(String args[]){
		LinkedList3 l1 = new LinkedList3();
		
		
		l1.insert(10);
		l1.insert(30);
		l1.insert(40);
		l1.insert(60);
		l1.insert(100);
		l1.display();
		System.out.println("");
		l1.insertAfter(l1.start.next,160);
		l1.display();
		
		
		/*
		Output
		100---60---40---30---10---/n
        100---60---160---40---30---10---
		*/
		
	
	}
}

