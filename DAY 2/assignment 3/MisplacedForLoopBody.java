/*

public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} 

*/

/*

as it missed curly  brackects for "for loop" it takes only 
1st statement for loop ....just have to place bracket enclosing all the statement 
so it will print when the loop runs


*/

public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) {
 System.out.println(i); 
 System.out.println("Done"); 
 }
 } 
} 



