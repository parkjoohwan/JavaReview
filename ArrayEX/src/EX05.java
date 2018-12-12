
public class EX05 {

	static int[] reverse(int[] arr) {
		int[] r = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i ++)
			r[arr.length-1-i] = arr[i];
		
		return r;
	}
	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("원래 배열");
		for(int i : arr)
			System.out.print(i);
		arr = reverse(arr);
		System.out.println("바뀐 배열");
		for(int i : arr)
			System.out.print(i);
		

	}
}
