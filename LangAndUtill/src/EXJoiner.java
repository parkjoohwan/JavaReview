import java.util.StringJoiner;

public class EXJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * jdk 1.8 ���� �߰���
		 * ���� ���ڿ� ���̿� �����ڸ� �־ ���� join() �޼ҵ�
		 * �����ڷ� ���ڿ��� �ڸ��� split() �޼ҵ�
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
