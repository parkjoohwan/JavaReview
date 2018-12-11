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
			System.out.println("������ �����ϴ�.");
		else if(total<=numOfPapers) {
			numOfPapers-=total;
			if(duplex)
				System.out.print("������� ");
			else
				System.out.print("�ܸ����� ");
			
			System.out.println(total + "���� ����߽��ϴ�. ���� " + numOfPapers + "�� �����ֽ��ϴ�.");
		}
		else {
			if(duplex)
				System.out.print("������� ");
			else
				System.out.print("�ܸ����� ");
			
			System.out.println("��� ����Ϸ��� ������ " + (total-numOfPapers) + "�� �����մϴ�." + numOfPapers + "�常 ����մϴ�.");
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
