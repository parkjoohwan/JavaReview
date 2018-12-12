class Triangle{
	double a;
	double b;
	
	Triangle(double a, double b){
		this.a=a;
		this.b=b;
	}
	public  double findArea() {
		return (a*b)/2;
	}
}

public class Ex09 {

	
	public static void main(String[] args) {
			Triangle t= new Triangle(10.0,5.0);
			System.out.println(t.findArea());

	

	}

}
