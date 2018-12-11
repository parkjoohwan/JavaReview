
public class ExImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 클래스 앞에 final이 붙으므로 다른 클래스의 조상이 될 수 없음
		 * 한번 생성된 String 인스턴스가 갖고 있는 문자열은 읽어올 수 만 있고 변경은 불가능
		 * '+' 연산자를 이용한 문자열 결합은 인스턴스 내의 문자열이 변경되는 것이 아닌 새로운 인스턴스를 생성하는것
		 */
		
		
		// 문자열 리터럴
		String str1 = "abc";
		String str2 = "abc";
		
		// 새로운 인스턴스
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}
