class Printer{
	int numOfPapers = 0;
	
	Printer(int a){
		this.numOfPapers = a;
	}
	
	void print(int amount) {
		this.numOfPapers-=amount;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer(100);
		p.print(70);
		System.out.println(p.numOfPapers);
	}

}
