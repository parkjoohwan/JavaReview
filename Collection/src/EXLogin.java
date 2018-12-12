import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class EXLogin {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("aaa", "123");
		map.put("bbb", "234");
		map.put("ccc", "666");
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String id = in.nextLine();
			String pw = in.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공!");
					break;
				}
				else {
					System.out.println("비밀번호 오류!");
				}
			} else {
				System.out.println("아이디가 존재하지 않음");
			}
		}
		

	}

}
