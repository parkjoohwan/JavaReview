class Line{
	int l;
	
	Line(int a){
		this.l = a;
	}
	
	boolean isSameLine(Line t) {
		if(this.l == t.l)
			return true;
		else
			return false;
	}
}
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}

}
