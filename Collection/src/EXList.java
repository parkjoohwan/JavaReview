import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class EXList {

	public static void main(String[] args) {
		/*
		 * ArrayList / Vector 같은 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는데는 효율이 좋지만
		 * 용량을 변경하거나 새로운배열을 생성후 기존의 배열로부터 생성된 배열로 데이터를 복사하는데는 효율이 떨어짐
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
		
		System.out.println("remove 이후");
		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		
		list.add(2, 3333);
		System.out.println("추가후");
		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		list.set(1, 12312321);
		System.out.println("변경후");
		for(int i = 0 ; i < list.size() ; i ++ ) {
			System.out.println(i+1 + " : " + list.get(i) );
		}
		
		list.clear();
		/*
		 * 해당 리스트 안에 특정 값을 포함하고 있는지 판단해주는 contains() 메소드 
		 * 해당 리스트에서 특정 값의 인덱스를 반환해주는 indexOf() 메소드
		 * 리스트 전체를 비워주는 clear() 메소드 등이 있음
		 * LinkedList 클래스도 위와 같은 사용방법이지만, 객체 내부에서 일어나는 일이 다름
		 * LinkedList는 처음부터 해당 위치까지 읽어나가는 방식이기 떄문에 iterator를 이용하여 위치를 기억하는것이 효율적
		 */
		System.out.println("LInkedList");
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		Iterator<Integer> it = ll.iterator();
		
		System.out.println("일반 for문을 이용한 출력");
		for(int i : ll)
			System.out.println(i);
		System.out.println("iterator를 이용한 출력");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/* 
		 * 	Vector는 List들과 사용방법 비슷
		 */
		Vector<String> v = new Vector<String>();
		
		/*
		 * Queue 사용법
		 * offer을 이용해 push하고
		 * pull을 이용해 pop함
		 * peek를 통해 top확인 가능
		 */
		Queue<String> q = new LinkedList<String>();
		
		q.offer("abc");
		q.offer("test");
		q.offer("eeee");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		/*
		 * Stack 사용법
		 * push, pop으로 넣고 뺼수있음
		 * peek를 통해 top확인
		 * size 확인가능
		 * elementAt으로 특정 위치 참조 가능
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
