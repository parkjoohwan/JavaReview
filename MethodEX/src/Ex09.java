
public class Ex09 {

	public static void foo(String a) {
		System.out.println(a);
	}
	
	public static void foo(String a, int b) {
		System.out.println(a + " " + b);
	}
	
	public static void foo(String a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���",1,2);
		foo("���־�");

	}

}
