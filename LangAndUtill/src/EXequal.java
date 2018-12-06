
class Test{
	int t;
	
	public Test(int a) {
		this.t= a;
	}
}

public class EXequal {
	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(10);
		
		
		if( t1.equals(t2))
			System.out.println("equals == true");
		else
			System.out.println("equals == false");
		
		t1 = t2;
		
		if( t1.equals(t2))
			System.out.println("equals == true");
		else
			System.out.println("equals == false");
		
		
	}
}
