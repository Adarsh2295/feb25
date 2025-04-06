class Merge {
		
		 void divide(int arr[],int l,int r){
			
			if(l<r){
				
				int m = (l+(r-l)/2);
				divide(arr, l, m );
				divide(arr, m+1,r);
				mergeM(arr, l, m, r);
	
			}
		 }
			
		static void mergeM(int arr[], int l, int m, int r){
			
			int n1 = m-l+1;
			int n2 = r-m;
			
			int L[] = new int[n1];
			int R[] = new int[n2];
			
			for(int i=0;i<n1;i++){
				L[i]=arr[l+i];
			}
			for(int j=0;j<n2;j++){
				R[j]=arr[m+j+1];
			}
			
			int i=0,j=0;
			int k=l;
			
			while(i<n1 && j<n2){
				
				if(L[i]<=R[j]){
					arr[k]=L[i];
					i++;
				}
				else{
				arr[k]=R[j];
				j++;
				}
				k++;
			
			}
			while(i<n1){
				arr[k]=L[i];
				i++;
				k++;
			}
			while(j<n2){
				arr[k]=R[j];
				j++;
				k++;
			}		
		}
		
	
		
		void display(int arr[]){
			
			for(int x : arr){
				
				System.out.print(x+" ");
			}
		}
		
		


}


class MergeS{
	
	public static void main(String args[]){
	
		int arr[] = {12,10,8,6,7,4,5,15};
		Merge m = new Merge();
		int l = arr.length;
		m.display(arr);
		System.out.println();
		System.out.println("---------------------");
		m.divide(arr,0,l-1);
		m.display(arr);
		
		
	
	}

}