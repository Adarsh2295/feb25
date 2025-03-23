
import java.util.* ;
class Student
{
    String name  ; 
	int rollNo ; 
	double[] m = new double[5] ;
	double avg ; 
	char grade  ; 
	
	Student(String name ,int rollNo ,double m[])
	{
	  this.name = name  ; 
	  this.rollNo = rollNo ; 

     
	  for(double i : m )
	  {
	    if(i < 0 || i > 100)
		{
	    throw new IllegalArgumentException("Invalid Marks ");
	    }
	  }
	  
	  	  this.m = m ;
	  
	}
	
	 void calculateAverage()
     {
		 double total =0;
		 
	    for(int i =0 ; i< 5 ; i++)
		{
			total += m[i] ;
		}
		
		avg = total/ 5 ; 
		
		
	 }
	 
	  char calculateGrade()
	  {
	     if(avg>=90)
		 {
			 grade = 'A' ;
		 }
		 else if(avg>=80 && avg < 90)
		 {
			 grade='B' ;
		 }
		 else if(avg>=70 && avg < 80)
		 {
			 grade='C' ;
		 }
		 else if(avg>=60 && avg < 70)
		 {
			 grade='D' ;
		 }
		 else
		 {
			 grade = 'F'  ;
		 }
		 return grade ;
	  }
    
	
	void displayStudentInfo()
	{
		System.out.println("Student Information ");
		System.out.println("Name : "+ name);
		System.out.println("Roll Number : " + rollNo);
		System.out.println("marks : ");
		for(int i = 0 ; i< 5 ; i++)
		{
			System.out.println(m[i] +"  ");
		}
		System.out.println("Avarage marks  : " + avg);
		System.out.println("Grade : " + calculateGrade());
		
	}
	
	

}

class Solution2
{
  
  public static void main(String args[])
  {
	  Scanner sc   = new Scanner(System.in);
	  try
	  {
	  System.out.println("Enter the student's name : ");
	  
	  String name = sc.next() ;
	  
	  System.out.println("Enter the Student's Roll number: ");
	  
	  int roll = sc.nextInt() ;
	  
	  System.out.println("Enter the marks : ");
	  
	  double m[] = new double[5]  ;
	  
	  for(int i = 0; i< 5 ; i++)
	  {
		  System.out.println(" subject " + (i+1) +" : ");
		  m[i] = sc.nextInt() ;
	  }
	  
	  Student s1 = new Student(name , roll , m);
	  
	  s1.calculateAverage() ;
	  s1.displayStudentInfo() ;
	  
	  
	  }
	  catch(InputMismatchException e)
	  {
		  System.out.println(e);
		  
	  }
	  catch(IllegalArgumentException e)
	  {
		  System.out.println(e.getMessage());
		  
	  }
	  
	  
	  
	  
	  
  }

}