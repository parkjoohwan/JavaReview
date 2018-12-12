import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EXMap {

	public static void main(String[] args) {
		/*
		 *  HashMap / Hashtable / LinkedHashMap / Properties / TreeMap ���� ����
		 *  Ű�� ������ �̷����
		 *  Ű�� �ߺ��� ������� ������ ���� �ߺ��� ����ϰ�, Ű�� �̿��� ���� ���� ����
		 *  ������ �ִ� Ű�� ���ο� ���� �����Ұ�� ���ο������ ��ü��
		 *  
		 *  HashMap�� table�� ���̴� 
		 *  talbe�� ����ȭ�� �޼ҵ�� �����Ǿ��ֱ� ������ ��Ƽ�����尡 ���ÿ� �� �޼ҵ带 ������ ���� ����
		 *  properties�� hashtable�� ���� Ŭ����
		 *  properties�� key���� string���� ����
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
