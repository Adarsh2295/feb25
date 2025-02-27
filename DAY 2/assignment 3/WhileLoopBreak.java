
public class WhileLoopBreak { 
 public static void main(String[] args) { 
 	int count = 0; 
 	while (count < 5) { 
 		System.out.print(count + " "); 
 		count++; 
 		if (count == 3) break; 
 	} 
	System.out.println(count);
 } 
}  
 

/*

count 	
 0 1 2 3   break will break loop after condition is satisfied 
 
 




*/




