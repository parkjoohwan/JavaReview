
public class EX02 {


	static int sum(int a, int... b) {
		int r = 0;
		for(int i : b)
			r+=i;
		return r;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4));
		int arr[] = {2,3};
		System.out.println(sum(1,arr));
		System.out.println(sum(1,2,3,4,5));
	}

}
