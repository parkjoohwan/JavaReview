import java.util.HashSet;
import java.util.TreeSet;

public class EXSet {

	public static void main(String[] args) {

		/*
		 * HashSet / LinkedHashSet / TreeSet�� ����
		 * Set�� �������� �ߺ��� ������� ������
		 * HashSet�� �����Ϳ� ������ ����.
		 * LinkedHashSet ���� ������ ���� �ݺ�
		 * TreeSet�� ���� ������ ���� �ݺ�
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(10);
		hs.add(3);
		hs.add(1); // �ߺ��� �����ʹ� �߰��� ���Ե��� ����
		
		System.out.println("hashset");
		System.out.println(hs);
		
		/*
		 * contains�� �˻��� ����
		 * iterator ��밡��
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
