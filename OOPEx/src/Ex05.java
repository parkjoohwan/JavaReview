class Triangle2{
	double w;
	double h;
	
	Triangle2(double a, double b){
		this.w = a;
		this.h= b;
	}
	
	double findArea() {
		return w*h/2;
	}
	
	boolean isSameArea(Triangle2 t) {
		if(this.w*this.h== t.h*t.w)
			return true;
		else
			return false;
		
	}
}
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle2 t1 = new Triangle2(10.0, 5.0);
		Triangle2 t2 = new Triangle2(5.0, 10.0);
		Triangle2 t3 = new Triangle2(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
