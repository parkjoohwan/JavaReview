import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class EXList {

	public static void main(String[] args) {
		/*
		 * ArrayList / Vector ���� �迭�� �̿��� �ڷᱸ���� �����͸� �о���� �����ϴµ��� ȿ���� ������
		 * �뷮�� �����ϰų� ���ο�迭�� ������ ������ �迭�κ��� ������ �迭�� �����͸� �����ϴµ��� ȿ���� ������
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		
		list.remove(2);
		
		System.out.println("remove ����");
		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		
		list.add(2, 3333);
		System.out.println("�߰���");
		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		list.set(1, 12312321);
		System.out.println("������");
		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		
		list.clear();
		/*
		 * �ش� ����Ʈ �ȿ� Ư�� ���� �����ϰ� �ִ��� �Ǵ����ִ� contains() �޼ҵ� 
		 * �ش� ����Ʈ���� Ư�� ���� �ε����� ��ȯ���ִ� indexOf() �޼ҵ�
		 * ����Ʈ ��ü�� ����ִ� clear() �޼ҵ� ���� ����
		 * LinkedList Ŭ������ ���� ���� �����������, ��ü ���ο��� �Ͼ�� ���� �ٸ�
		 * LinkedList�� ó������ �ش� ��ġ���� �о���� ����̱� ������ iterator�� �̿��Ͽ� ��ġ�� ����ϴ°��� ȿ����
		 */
		System.out.println("LInkedList");
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		Iterator<Integer> it = ll.iterator();
		
		System.out.println("�Ϲ� for���� �̿��� ���");
		for(int i : ll)
			System.out.println(i);
		System.out.println("iterator�� �̿��� ���");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/* 
		 * 	Vector�� List��� ����� ���
		 */
		Vector<String> v = new Vector<String>();
		
		/*
		 * Queue ����
		 * offer�� �̿��� push�ϰ�
		 * pull�� �̿��� pop��
		 * peek�� ���� topȮ�� ����
		 */
		Queue<String> q = new LinkedList<String>();
		
		q.offer("abc");
		q.offer("test");
		q.offer("eeee");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		/*
		 * Stack ����
		 * push, pop���� �ְ� �E������
		 * peek�� ���� topȮ��
		 * size Ȯ�ΰ���
		 * elementAt���� Ư�� ��ġ ���� ����
		 */
		Stack<String> s = new Stack<String>();
		s.push("tt");
		s.push("kk");
		s.push("zz");
		System.out.println(s.elementAt(1));
		
		while(!s.empty()) {
			System.out.println(s.pop());
		}
		
	}

}
