
public class EXhashcode {

	public static void main(String[] args) {
		String str1 = new String("123");
		String str2 = new String("123");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
