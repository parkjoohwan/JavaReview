import java.util.Date;
import java.util.Calendar;

public class EXDate {
	public static void main(String[] args) {
		
		/*
		 *   ��¥�� �ð��� �����ϱ� ���� ��ǥ���� api
		 *   ������ ����� �����ϱ⶧����( ������ ������Ʈ���� �⵵�� ���߿� �ϳ��� �������� -1 �� ���� ����ϱ⵵�� ) 
		 *   Joda-Time ���¼ҽ� ���̺귯���� ��ü��
		 *   �ᱹ, jdk8������ joda-time ���̺귯���� ������
		 */
		Date a = new Date();
		
		System.out.println(a);
		
		Calendar c = Calendar.getInstance();
		
		c.set(2016, 2 ,7 );
		
		System.out.println(c.getTime());
		System.out.println(c.getFirstDayOfWeek());
	}
}
