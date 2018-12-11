class Printer2{
	private int numOfPapers = 0;
	
	Printer2(int a){
		this.numOfPapers = a;
	}
	
	void print(int amount) {
		if(numOfPapers == 0)
			System.out.println("용지가 없습니다.");
		else if(amount<=numOfPapers) {
			numOfPapers-=amount;
			System.out.println(amount + "장을 출력했습니다. 현재 " + numOfPapers + "장 남아있습니다.");
		}
		else { 
			System.out.println("모두 출력하려면 용지가 " + (amount-numOfPapers) + "매 부족합니다." + numOfPapers + "장만 출력합니다.");
			numOfPapers=0;
		}
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}

}
