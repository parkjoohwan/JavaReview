
public class EXstrbuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		StringBuffer sb2 = sb.append("ZZ");
		System.out.println(sb);
		System.out.println(sb2);
		
		StringBuffer t1 = new StringBuffer("aaa");
		StringBuffer t2 = new StringBuffer("aaa");
		
		//equals �������̵��� �Ǿ����� ����
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		//tostring�� �Ǿ�����
		String s1 = t1.toString();
		String s2 = t2.toString();
		System.out.println(s1.equals(s2));
				
	}

}
