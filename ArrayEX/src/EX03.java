import java.util.Scanner;

public class EX03 {

	static void chkcom(String s) {
		String tmp="";
		for(int i = s.length()-3 ; i < s.length() ; i ++) {
			tmp+=s.charAt(i);
		}
		if( tmp.equals("com") );{
			System.out.println(s + "�� com���� �����ϴ�.");
		}
			
		
	}
	
	static void chkjava(String s) {
		if(s.contains("java"))
			System.out.println(s + "�� java�� �����մϴ�.");
		else
			System.out.println(s + "�� java�� �������� �ʽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		System.out.print("URL�� �Է��ϼ��� : ");
		String s = new Scanner(System.in).nextLine();
		chkcom(s);
		chkjava(s);
		

	}

}
