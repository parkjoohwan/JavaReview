
public class EXWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���ڿ� -> �⺻�� or ���ڿ� -> ����Ŭ���� ��ȯ ���
		 */
		// ���ڿ� -> �⺻�� parse �̿�
		byte b = Byte.parseByte("100");
		short s = Short.parseShort("100");
		int i = Integer.parseInt("100");
		double d = Double.parseDouble("3.14");
		// ���ڿ� -> ����Ŭ���� valueOf �̿�
		
		byte b2 = Byte.valueOf("100");
		short s2 = Short.valueOf("!00");
		int i2 = Integer.valueOf("100");
		double d2 = Double.valueOf("3.14");
		
		// jdk 1.5 ���� ���Ե� ����ڽ� ������ ��ȯ���� �⺻���϶��� ����Ŭ�����϶� ���̰� �������� ���� ���� ����ص� ��
		
	}

}
