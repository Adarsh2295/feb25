/*

public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i++) { 
 System.out.println(i); 
 } 
 } 
}


*/

/*

10++ will always be grater than 0 so we have to use decrement
operator to print from 10 to 0 if from 10 to use "i>0"


*/

public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i--) { 
 System.out.println(i); 
 } 
 } 
} 




