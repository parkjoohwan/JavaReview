import java.util.Scanner;

public class Ex10 {

	public static boolean isPrime(int num) {
		boolean ans = true;
		
		for( int i = 2 ; i < num ; i ++)
			if(num%i == 0 )
				ans = false;
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}
		else
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
	}

}
