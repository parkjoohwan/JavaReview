import java.awt.Point;
import java.util.*;

class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
		return (Circle)obj;
	}
		
	Circle DeepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {}
		
		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
	
	Point setPoint(int a, int b) {
		this.p = new Point(a,b);
		return p;
	}
}


public class EXClone implements Cloneable{

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1), 2.0);
		Circle c2 = c1;
		Circle c3 = c1.DeepCopy();
		Circle c4 = c1.shallowCopy();
		
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c1==c4);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));

	}

}
