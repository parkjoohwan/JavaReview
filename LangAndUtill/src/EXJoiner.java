import java.util.StringJoiner;

public class EXJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * jdk 1.8 부터 추가됨
		 * 여러 문자열 사이에 구분자를 넣어서 결합 join() 메소드
		 * 구분자로 문자열을 자른다 split() 메소드
		 */
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		String str = String.join("-", arr);
		System.out.println(str);
		
		StringJoiner sj = new StringJoiner(",", "[", "]");
		String[] strarr = {"aaa", "bbb", "ccc"};
		
		for( String s : strarr )
			sj.add(s.toUpperCase());
		
		System.out.println(sj.toString());
		
	}

}
