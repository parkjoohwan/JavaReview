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
		System.out.print("정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		}
		else
			System.out.println(num + "는 소수가 아닙니다.");
	}

}
