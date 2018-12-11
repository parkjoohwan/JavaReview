import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EXFormat {

	public static void main(String[] args) {
		
		// �Ҽ��� ����ȭ
		DecimalFormat df = new DecimalFormat("#,###.##");
		System.out.println(df.format(123456.78));
		
		//��¥ ����ȭ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String result = sdf.format(new Date());
		
		System.out.println(result);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� mm�� dd��");
		String result2 = sdf2.format(new Date());
		
		System.out.println(result2);
		
		// Ư�� ������ �� ����ȭ
		String pattern = "60#D|70#C|80<B|90#A";
		int[] scores = {91,90,80,88,78,52,60};
		ChoiceFormat cf = new ChoiceFormat(pattern);
		
		for(int score : scores)
			System.out.print(cf.format(score) + " // ");
		System.out.println();
		
		// �����͸� ������ ��Ŀ� �°� ����ȭ
		String format = "Name : {0}, Tel : {1}, Loc : {2}";
		String[] params = {"Client.park", "010.1234.5678", "Pangyo"};
		
		MessageFormat msgf = new MessageFormat(format);
		String r = msgf.format(params);
		
		System.out.println(r);
		
		

	}

}
