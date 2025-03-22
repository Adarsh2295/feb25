


//Q6. Electricity Bill Calculation – Java Program

import java.util.Scanner;

class ElectricityBill {
    
    private String customerName;
    private double unitsConsumed;
    private double billAmount= 0.0;

    
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        
    }

   
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Units Consumed: ");
        double units = scanner.nextDouble();
        
     
        ElectricityBill b1 = new ElectricityBill(name, units);
        
     
        b1.calculateBillAmount();
        
   
        b1.displayBill();
        
        scanner.close();
    }
}



  

































