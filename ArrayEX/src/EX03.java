import java.util.Scanner;

public class EX03 {

	static void chkcom(String s) {
		String tmp="";
		for(int i = s.length()-3 ; i < s.length() ; i ++) {
			tmp+=s.charAt(i);
		}
		if( tmp.equals("com") );{
			System.out.println(s + "는 com으로 끝납니다.");
		}
			
		
	}
	
	static void chkjava(String s) {
		if(s.contains("java"))
			System.out.println(s + "는 java를 포함합니다.");
		else
			System.out.println(s + "는 java를 포함하지 않습니다.");
	}
	
	public static void main(String[] args) {
		
		System.out.print("URL을 입력하세요 : ");
		String s = new Scanner(System.in).nextLine();
		chkcom(s);
		chkjava(s);
		

	}

}
