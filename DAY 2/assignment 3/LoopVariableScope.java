/*

public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
 
 */
 



/*
variable "x" is defined inside loop so we can not access it outside loop

*/


public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2;

  System.out.println(x); 
 } 
  // Error: 'x' is not accessible here 
 } 
} 




