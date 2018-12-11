
public class EXWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문자열 -> 기본형 or 문자열 -> 래퍼클래스 변환 방법
		 */
		// 문자열 -> 기본형 parse 이용
		byte b = Byte.parseByte("100");
		short s = Short.parseShort("100");
		int i = Integer.parseInt("100");
		double d = Double.parseDouble("3.14");
		// 문자열 -> 래퍼클래스 valueOf 이용
		
		byte b2 = Byte.valueOf("100");
		short s2 = Short.valueOf("!00");
		int i2 = Integer.valueOf("100");
		double d2 = Double.valueOf("3.14");
		
		// jdk 1.5 부터 도입된 오토박싱 때문에 반환값이 기본형일때와 래퍼클래스일때 차이가 없어졌음 구분 없이 사용해도 됨
		
	}

}
