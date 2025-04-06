class Node{
	char data;
	Node next;
	
		Node(char d){
			data =d;
			next=null;
		}
}

class Parenthesis1{
	Node top;
		Parenthesis1(){
			this.top=null;
		}
		
	boolean isEmpty(){
		if(top==null)
		return true;
		return false;
	}
	
	void push(char s){
		Node n = new Node(s);
		n.next=top;
		top=n;
	
	}
	char peek(){
		if(top==null){
			System.out.println("stack is empty");
			return '0';
		}
		return top.data;
	}
	
	void pop(){
		
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			top=top.next;
			
		}
	}
		

}



class Parenthesis{
		public static void main(String args[]){
			Parenthesis1 a = new Parenthesis1();
		String s = "()";
			
			char c [] = s.toCharArray();
			int l = c.length;
				if(c[0]=='}'|| c[0]==')' || c[0]==']'){
				System.out.print("not valid");
				return;
				}
				else{
			for(int i=0;i<l;i++){
				if(a.isEmpty()){
					System.out.print("not valid");
					return;
				}
				if(c[i]=='{'||c[i]=='('||c[i]=='['){
					a.push(c[i]);
				} 
				else if(c[i]=='}'&& a.peek()!='{'){
					//a.pop();
					System.out.print("not valid");
					return;
				}
			    else if(c[i]==']'&& a.peek()!='['){
					//a.pop();
					System.out.print("not valid");
					return;
				}
				else if (c[i]==')'&& a.peek()!='('){
					//a.pop();
					System.out.print("abeeeee not valid");
					return;
				}
				 else if(c[i]=='}'&& a.peek()=='{'){
					a.pop();
					
				}
			    else if(c[i]==']'&& a.peek()=='['){
					a.pop();
					
					
				}
				else if(c[i]==')'&& a.peek()=='('){
					System.out.println("hi");
					a.pop();
					System.out.println(a.peek());
					
					
				}
				
				if((c[i]==')' || c[i]==']'|| c[i]=='}')&& a.isEmpty()){
					a.push(c[i]);
					System.out.print("hii 222    not valid");
                    return ;
                }else a.push(c[i]);
					
			}	
			/*boolean temp= a.isEmpty();
			if(temp)
			{
				System.out.print("valid");
		
			}else{
				
				System.out.print("not valid");
			}*/
			
		System.out.print(a.isEmpty() ? "valid":"Not valid");
			}
		
		}

}