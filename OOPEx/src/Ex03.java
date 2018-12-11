class Printer3{
	private int numOfPapers;
	private boolean duplex;
	
	Printer3(int num, boolean du) {
		this.numOfPapers= num;
		this.duplex = du;
	}
	
	boolean getDuplex(){
		return duplex;
	}
	
	void setDuplex(boolean du) {
		this.duplex = du;
	}
	
	void print(int amount) {
		int total=amount;
		if(duplex && amount%2 == 0)
			total = amount/2;
		else if(duplex && amount%2 == 1)
			total = amount/2 + 1;
			
		
		if(numOfPapers == 0)
			System.out.println("용지가 없습니다.");
		else if(total<=numOfPapers) {
			numOfPapers-=total;
			if(duplex)
				System.out.print("양면으로 ");
			else
				System.out.print("단면으로 ");
			
			System.out.println(total + "장을 출력했습니다. 현재 " + numOfPapers + "장 남아있습니다.");
		}
		else {
			if(duplex)
				System.out.print("양면으로 ");
			else
				System.out.print("단면으로 ");
			
			System.out.println("모두 출력하려면 용지가 " + (total-numOfPapers) + "매 부족합니다." + numOfPapers + "장만 출력합니다.");
			numOfPapers=0;
		}
		
	}
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer3 p = new Printer3(20, true);
		
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
