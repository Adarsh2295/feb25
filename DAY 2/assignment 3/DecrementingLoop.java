
public class DecrementingLoop { 
 public static void main(String[] args) { 
 int total = 0; 
 	for (int i = 5; i > 0; i--) { 
 	 total += i; 
 		if (i == 3) continue; 
 		total -= 1; 
 } 
 System.out.println(total); 
 } 
} 
 

/*

i	total	
5	5	
4	9	
3	12 then i == 3 
2	11
1	12
total-1 = 11




*/




