class Printer2{
	private int numOfPapers = 0;
	
	Printer2(int a){
		this.numOfPapers = a;
	}
	
	void print(int amount) {
		if(numOfPapers == 0)
			System.out.println("������ �����ϴ�.");
		else if(amount<=numOfPapers) {
			numOfPapers-=amount;
			System.out.println(amount + "���� ����߽��ϴ�. ���� " + numOfPapers + "�� �����ֽ��ϴ�.");
		}
		else { 
			System.out.println("��� ����Ϸ��� ������ " + (amount-numOfPapers) + "�� �����մϴ�." + numOfPapers + "�常 ����մϴ�.");
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
