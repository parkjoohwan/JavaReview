
class Girl3 {
	protected String name;
	public Girl3(String name) {
		this.name = name;
	}
	void show() {
		System.out.println(name + "�� �ڹ� �ʺ����̴�.");
	}
}

class GoodGirl3 extends Girl3{
	
	public GoodGirl3(String name) {
		super(name);
	}
	void show() {
		System.out.println(name + "�� �ڹٸ� �� �ȴ�");
	}
}

class BestGirl3 extends GoodGirl3{
	public BestGirl3(String name) {
		super(name);
	}
	void show() {
		System.out.println(name + "�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}


public class EX03 {

	public static void main(String[] args) {
		Girl3[] girls = {new Girl3("������"), new GoodGirl3("Ȳ����"), new BestGirl3("����")};
		
		for(Girl3 g : girls )
			g.show();
	}

}
