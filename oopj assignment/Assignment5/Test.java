import java.io.*;
import java.util.*;

class ElectricityBill{
			String customerName ;
 			double unitsConsumed ;
			double billAmount=0.0;
			
				public ElectricityBill(String customerName, double unitsConsumed){
					if(unitsConsumed<0){
							throw new IllegalArgumentException("Unit consumed can not be negative");
						}
					  this.customerName = customerName ;
 			          this.unitsConsumed =unitsConsumed ;
			          
				}
				
				public void calculateBillAmount(){
							if(unitsConsumed<=100){
							billAmount=unitsConsumed*5;
						}
						else if(unitsConsumed<=300){
							billAmount=(100*5)+(unitsConsumed-100)*7;
						}
						else{
							 billAmount=100*5+200*2+200*7+(unitsConsumed-300)*10;
						}
				
				}
				
					void display(){
					
					System.out.println(customerName+" Your Bill amount is " +billAmount); 
				}


}

class Test{
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				try{
				System.out.println("Enter customer name");
				
				String n = sc.nextLine();
				
				System.out.println("Enter unit consumed");
				double u = sc.nextDouble();
				
				ElectricityBill s = new ElectricityBill(n,u);
				
				//System.out.println(s.calculateBillAmount());
				s.calculateBillAmount();
				s.display();
				}catch(InputMismatchException e){
				System.out.println("user enters non-numeric data for units.");
				
				}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
				}
				
		}


}