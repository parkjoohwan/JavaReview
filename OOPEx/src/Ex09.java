class Complex{
	double real;
	double coml = 0.0;
	
	public Complex(double a, double b) {
		// TODO Auto-generated constructor stub
		this.real = a;
		this.coml = b;
	}
	
	public Complex(double a) {
		this.real = a;
	}
	
	void print() {
		System.out.println(real + " + " + coml + "i");
	}
}
public class Ex09 {
	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}
}
