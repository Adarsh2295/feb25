import java.util.*;
class Array{
	static int[] ad = new int[5];
	static int n=0;
	static int key;
	
	static void display(){
		for(int i=0;i<ad.length;i++){
			System.out.print(ad[i]+" ");
		}
	}
	
	static void insert(int value){
		if(n<ad.length){
			ad[n]=value;
			n++;
		}else {
			System.out.print("Array me space nhi hai!! ");
		}
	}
	
	static int find(int key){
		for(int i=0;i<n;i++){
			if(ad[i]==key){
				return i;
			}
		}
		return -1;
		
			
		
	}
	static void remove(int key){
		int i;
		for(i=0;i<n;i++){
			if(ad[i]==key){
			break;
			}
			
		}
		if(i==n){System.out.println("Element doesnot exist!");
		
		return;}
		
		for(int k=i;k<n;k++){
			ad[k]=ad[k+1];
		}
		n--;
		
	}
	
		public static void main(String args[]){
			display();
			insert(10);
			insert(20);
			insert(30);
			insert(40);
			insert(50);
			display();
			int n=40;
			System.out.println("------------");
			System.out.println((find(n)== -1)?"number not found":("number is at position "+(find(n)+1)));
			
			display();
			System.out.println("------------");
			remove(70);
			display();
		
		
		}

}