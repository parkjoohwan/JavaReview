
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
		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰",1,2);
		foo("¿ﬂ¿÷æÓ");

	}

}
