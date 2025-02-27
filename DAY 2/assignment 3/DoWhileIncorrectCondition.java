/*
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 


*/

/*
there is increment operator so num will always be greater than 0 that is conditon
so it will be infinte loop
make the condition correct num< "any value" loop while run by that perticular
number


*/

public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num < 5); 
 } 
} 


