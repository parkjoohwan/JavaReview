import java.util.regex.*;


public class EXRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  ����ǥ����
		 *  �������� ���� ����⵵ �ϰ� ���� �������� ���� ���ȴٰ� ��
		 *  ��й�ȣ ��ȿ�� üũ / �̸��� ��ȿ�� üũ / ��ȭ��ȣ ���� / html���� �ؽ�Ʈ ���̴� � ����
		 *  [a-z], [0-9]��� ���� �ҹ��� ���ĺ�, ���� ���� �ƴ��� üũ �� ���� �ְ�
		 *  �ش� ���ڿ��� a,b,c ���� ���� ���ڷ� �����ϴ��� �ƴ��� ���� �Ǵܵ� ������
		 *  *�� �ڿ� ���� ���ڴ��� ��� ���ٴ°��� ��Ÿ������ �ְ�, ^���� �����ڷ� �ش� ���ڰ� �, ���� �Ǵܵ� ������
		 *  ��ǻ� ���ڿ��� ���� ��� ��Ī ���ΰ� �Ǵ� ������
		 */
		
		String[] data = {"bat", "baby", "bonus", "cA"};
		Pattern p = Pattern.compile("[a-z]*");
		for(int i = 0 ; i < data.length ; i ++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i] + ",");
		}
	}

}
