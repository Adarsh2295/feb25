/*
public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 
*/

/*
as count is 5 which in not equal to 5 so while loop not get excuted 
we have to make condition while (count > 0)means while count is greater than zero
excute loop.

*/

public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count > 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
}

