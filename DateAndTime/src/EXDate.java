import java.util.Date;
import java.util.Calendar;

public class EXDate {
	public static void main(String[] args) {
		
		/*
		 *   날짜와 시간을 형식하기 위한 대표적인 api
		 *   하지만 사용이 불편하기때문에( 이전에 프로젝트때도 년도나 월중에 하나가 실제보다 -1 된 값을 출력하기도함 ) 
		 *   Joda-Time 오픈소스 라이브러리로 대체됨
		 *   결국, jdk8에서는 joda-time 라이브러리를 수용함
		 */
		Date a = new Date();
		
		System.out.println(a);
		
		Calendar c = Calendar.getInstance();
		
		c.set(2016, 2 ,7 );
		
		System.out.println(c.getTime());
		System.out.println(c.getFirstDayOfWeek());
	}
}
