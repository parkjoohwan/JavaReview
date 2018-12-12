
class Girl2 {
	private String name;
	
	public Girl2() {
		// TODO Auto-generated constructor stub
	}
	public Girl2(String name) {
		this.name = name;
	}
	void show() {
		System.out.println("그녀는 자바 초보자이다.");
	}
}

class GoodGirl2 extends Girl2{
	
	void show() {
		System.out.println("그녀는 자바를 잘 안다");
	}
}

class BestGirl2 extends GoodGirl2{
	void show() {
		System.out.println("그녀는 자바를 무식하게 잘 안다.");
	}
}


public class EX02 {

	public static void main(String[] args) {
		Girl2 g1 = new Girl2();
		Girl2 g2 = new GoodGirl2();
		GoodGirl2 gg = new BestGirl2();
		
		g1.show();
		g2.show();
		gg.show();
	}

}
