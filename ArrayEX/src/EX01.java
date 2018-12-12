


public class EX01 {

	static int countChar(String s, char c) {
		int cnt = 0;
		for(int i = 0 ; i < s.length() ; i++)
			if(s.charAt(i) == c)
				cnt++;
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "abcdabcd";
		char c = 'c';
		
		System.out.println(countChar(msg,c));
		
		
	}

}
