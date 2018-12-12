import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EXMap {

	public static void main(String[] args) {
		/*
		 *  HashMap / Hashtable / LinkedHashMap / Properties / TreeMap 들이 있음
		 *  키와 값으로 이루어짐
		 *  키의 중복은 허용하지 않지만 값의 중복을 허용하고, 키를 이용해 값에 접근 가능
		 *  기존에 있는 키와 새로운 값을 삽입할경우 새로운것으로 대체됨
		 *  
		 *  HashMap과 table의 차이는 
		 *  talbe은 동기화된 메소드로 구성되어있기 때문에 멀티스레드가 동시에 이 메소드를 실행할 수는 없음
		 *  properties는 hashtable의 하위 클래스
		 *  properties는 key값을 string으로 제한
		 */
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("test", 1);
		map.put("test", 2);
		map.put("test", 3);
		map.put("tes", 4);
		map.put("te", 44);
		map.put("t", 4);
		
		System.out.println(map.size());
		System.out.println(map.get("test"));
		
		Set<String> set = map.keySet();
		System.out.println(set);
		
		for(String s : set)
			System.out.println(map.get(s));
			
		map.remove("test");
		

		System.out.println(set);
		
		for(String s : set)
			System.out.println(map.get(s));
		
		
	}

}
