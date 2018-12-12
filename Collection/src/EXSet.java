import java.util.HashSet;
import java.util.TreeSet;

public class EXSet {

	public static void main(String[] args) {

		/*
		 * HashSet / LinkedHashSet / TreeSet이 있음
		 * Set은 데이터의 중복을 허용하지 않으며
		 * HashSet은 데이터에 순서가 없다.
		 * LinkedHashSet 삽입 순서에 의해 반복
		 * TreeSet은 정렬 순서에 의해 반복
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(10);
		hs.add(3);
		hs.add(1); // 중복된 데이터는 추가로 삽입되지 않음
		
		System.out.println("hashset");
		System.out.println(hs);
		
		/*
		 * contains로 검색도 가능
		 * iterator 사용가능
		 */
	
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(4);
		ts.add(2);
		
		System.out.println("treeset");
		System.out.println(ts);
	}

}
