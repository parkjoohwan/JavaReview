import java.util.Scanner;


public class Ex06 {

	public static void whosWin(String c, String y) {
		if(c.equals(y))
			System.out.println("�����ϴ�!");
		
		if(c.equals("r")) {
			if(y.equals("s"))
				System.out.println("ö�� ��!");
			else if(y.equals("p"))
				System.out.println("���� ��!");
		}
		else if(c.equals("s")) {
			if(y.equals("p"))
				System.out.println("ö�� ��!");
			else if(y.equals("r"))
				System.out.println("���� ��!");
		}
		else if(c.equals("p")) {
			if(y.equals("r"))
				System.out.println("ö�� ��!");
			else if(y.equals("s"))
				System.out.println("���� ��!");
		}
	}
	
	public static String input(String msg) {
		Scanner in = new Scanner(System.in);
		System.out.print(msg + " : ");
		String s = in.nextLine(); 
		
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c,y;
		System.out.println("����(s) ����(r) ��(p) �� �ϳ��� �Է����ּ���!");
		c = input("ö��");
		y = input("����");
		whosWin(c, y);
		
	}

}
