

//Q4. Complex Number Operations




import java.util.* ;

class Complex {
    private double real, imag;

    // Constructor with default values
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imag * c.imag, this.real * c.imag + this.imag * c.real);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(real + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i");
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);
        
        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);
        
        System.out.print("Sum: ");
        sum.display();
        
        System.out.print("Product: ");
        product.display();
    }
}
