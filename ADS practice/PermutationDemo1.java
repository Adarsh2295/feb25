
import java.util.*;
class PermutationDemo1{
	static count=0;
	static void display(char tstr[],int l,int c){
		if(l==c){
			count++;
			System.out.println(new String(tstr));
			return;
		}
		//char[] tstr= str.toCharArray();
		
		boolean a[] = new boolean[256];
		for(int i=l;i<c;i++){
			if(a[tstr[i]])
				continue;
			
			char temp=tstr[l];
			tstr[l]=tstr[i];
			tstr[i]=temp;
			a[tstr[i]]=true;
			display(tstr,l+1,c);
			char temp1=tstr[l];
			tstr[l]=tstr[i];
			tstr[i]=temp1;
			
		}
	
     }
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String s= sc.nextLine();
			char[] tstr= s.toCharArray();
			
			
			display(tstr,0,tstr.length);
			System.out.println(count);
		}	
}