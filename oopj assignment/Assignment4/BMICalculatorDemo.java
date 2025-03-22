

//Q5. BMI Calculator






import java.util.* ; 


class BMICalculator
{
  private double height , weight  ; 
   
   BMICalculator(double height , double weight)
   {
	   this.height = height ; 
	   this.weight= weight  ;
	   
   }
   
   
   double calculateBMI()
   {
	  return  ( weight / (height * height ) )*10000   ;
   }


}

class BMICalculatorDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ; 
		
      
	  System.out.println("Enter the height (Meters only): ");
	  double h = sc.nextDouble();
	  System.out.println("Enter the Weight (KiloGrams only): ");
	  double w = sc.nextDouble();
	  
	  BMICalculator b1 = new BMICalculator(h , w) ;
	  
	  
	   System.out.println("BMI Index : "+b1.calculateBMI());

	}
}