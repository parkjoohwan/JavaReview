
class Girl2 {
	private String name;
	
	public Girl2() {
		// TODO Auto-generated constructor stub
	}
	public Girl2(String name) {
		this.name = name;
	}
	void show() {
		System.out.println("�׳�� �ڹ� �ʺ����̴�.");
	}
}

class GoodGirl2 extends Girl2{
	
	void show() {
		System.out.println("�׳�� �ڹٸ� �� �ȴ�");
	}
}

class BestGirl2 extends GoodGirl2{
	void show() {
		System.out.println("�׳�� �ڹٸ� �����ϰ� �� �ȴ�.");
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
