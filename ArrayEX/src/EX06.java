import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner in = new Scanner(System.in);
		
		System.out.println("0~99사이의 숫자 10 개를 입력하세요 : ");
		
		for(int i = 0 ; i < 10 ; i ++) {
			int tmp=in.nextInt();
			arr[tmp/10]++;
		}
		
		int f = 0 , e = 9;
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.print(f + " ~ " + e + " : ");
			for(int j = 0 ; j < arr[i] ; j++)
				System.out.print("*");
			f+=10; e+=10;
			System.out.println();
		}
		

	}

}
