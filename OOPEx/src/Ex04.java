class Triangle{
	double w;
	double h;
	
	Triangle(double a, double b){
		this.w = a;
		this.h= b;
	}
	
	double findArea() {
	return w*h/2;
	}
}
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
