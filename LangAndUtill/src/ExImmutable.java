
public class ExImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ŭ���� �տ� final�� �����Ƿ� �ٸ� Ŭ������ ������ �� �� ����
		 * �ѹ� ������ String �ν��Ͻ��� ���� �ִ� ���ڿ��� �о�� �� �� �ְ� ������ �Ұ���
		 * '+' �����ڸ� �̿��� ���ڿ� ������ �ν��Ͻ� ���� ���ڿ��� ����Ǵ� ���� �ƴ� ���ο� �ν��Ͻ��� �����ϴ°�
		 */
		
		
		// ���ڿ� ���ͷ�
		String str1 = "abc";
		String str2 = "abc";
		
		// ���ο� �ν��Ͻ�
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}
