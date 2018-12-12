
public class EX07 {

	static boolean chk(int[] arr1, int[] arr2) {
		if(arr1.length == arr2.length) {
			boolean r = true;
			for(int i = 0 ; i < arr1.length ; i ++)
				if(arr1[i] != arr2[i])
					r = false;
			return r;
		}
			
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,2,4,1,5};
		int[] b = {3,2,4,1};
		int[] c = {3,2,4,1,5};
		int[] d = {2,7,1,8,2};
		
		System.out.println(chk(a,b));
		System.out.println(chk(a,c));
		System.out.println(chk(a,d));
	}

}
