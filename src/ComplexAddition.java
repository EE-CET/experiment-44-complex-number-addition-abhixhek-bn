import java.util.Scanner;

class Complex {
    int r;
    int i;
    Complex(int real,int imag){
	r=real;
	i=imag;
    }
    Complex add (Complex n){
	int real=this.r+n.r;
	int imag=this.i+n.i;
	return new Complex(real,imag);
    }
	
	
	
    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2);
}

public class ComplexAddition {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int real1=sc.nextInt();
		int imag1=sc.nextInt();
		int real2=sc.nextInt();
		int imag2=sc.nextInt();
    		Complex c1=new Complex(real1,imag1);
		Complex c2=new Complex(real2,imag2);
		Complex c3=c1.add(c2);
		System.out.println(c3.r + "+" + c3.i + "i");

	}
        // TODO: Read real1, imag1
        // TODO: Read real2, imag2
        
        // TODO: Create two Complex objects
        
        // TODO: Add them
        
        // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")
    
}
