
class Girl3 {
	protected String name;
	public Girl3(String name) {
		this.name = name;
	}
	void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}
}

class GoodGirl3 extends Girl3{
	
	public GoodGirl3(String name) {
		super(name);
	}
	void show() {
		System.out.println(name + "는 자바를 잘 안다");
	}
}

class BestGirl3 extends GoodGirl3{
	public BestGirl3(String name) {
		super(name);
	}
	void show() {
		System.out.println(name + "는 자바를 무식하게 잘 안다.");
	}
}


public class EX03 {

	public static void main(String[] args) {
		Girl3[] girls = {new Girl3("갑순이"), new GoodGirl3("황진이"), new BestGirl3("콩쥐")};
		
		for(Girl3 g : girls )
			g.show();
	}

}
