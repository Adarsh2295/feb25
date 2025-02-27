public class ConditionalLoopOutput { 
   public static void main(String[] args) { 
    int num = 1; 
      for (int i = 1; i <= 4; i++) { 
       if (i % 2 == 0) { 
          num += i; 
 	} else { 
 		num -= i; 
 } 
 } System.out.println(num);
  
 } 
}

 

/*

 num
 0 
 2
 -1
 3
output = 3 
 
 




*/




