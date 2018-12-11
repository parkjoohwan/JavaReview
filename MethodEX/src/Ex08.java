
public class Ex08 {

	public static void printStar(int n) {
		for( int i = 0 ; i < n ;i ++)
			System.out.print("*");
	}
	public static void main(String[] args) {
		for(int i = 1 ; i <= 5 ; i++ ) {
			printStar(i);
			System.out.println();
		}
	}

}
